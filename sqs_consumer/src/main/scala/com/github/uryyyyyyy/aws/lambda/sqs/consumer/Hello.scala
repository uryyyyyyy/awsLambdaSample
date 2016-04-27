package com.github.uryyyyyyy.aws.lambda.sqs.consumer

import com.amazonaws.auth.EnvironmentVariableCredentialsProvider
import com.amazonaws.auth.profile.ProfileCredentialsProvider
import com.amazonaws.regions.{Region, Regions}
import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.sqs.AmazonSQSAsyncClient
import com.amazonaws.services.sqs.model.{DeleteMessageRequest, ReceiveMessageRequest}

import scala.collection.JavaConversions._

object Hello {

  val sqsEndPoint = "https://sqs.ap-northeast-1.amazonaws.com/522463962970/sampleQueue"
  val credentials = new EnvironmentVariableCredentialsProvider()
  val client = new AmazonSQSAsyncClient(credentials)

  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }

  def hello(count: Int, context: Context) = {
    println("Hello World!!")
    client.setRegion(Region.getRegion(Regions.AP_NORTHEAST_1))

    val receiveMessageRequest = new ReceiveMessageRequest()
      .withMaxNumberOfMessages(10)
      .withWaitTimeSeconds(10)
      .withQueueUrl(sqsEndPoint)

    val result = client.receiveMessage(receiveMessageRequest)
    val messages = result.getMessages

    messages.foreach(m => {
      println(s"count: ${m.getBody}")
      val deleteMessageRequest = new DeleteMessageRequest()
        .withQueueUrl(sqsEndPoint)
        .withReceiptHandle(m.getReceiptHandle)
      client.deleteMessage(deleteMessageRequest)
    })
  }
}
