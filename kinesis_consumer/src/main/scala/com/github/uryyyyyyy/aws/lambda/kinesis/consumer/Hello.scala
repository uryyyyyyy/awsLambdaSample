package com.github.uryyyyyyy.aws.lambda.kinesis.consumer

import com.amazonaws.services.lambda.runtime.events.KinesisEvent

import scala.collection.JavaConversions._

object Hello {

  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }

  def hello(event: KinesisEvent) = {
    println("Hello World!!")

    event.getRecords.foreach(rec => {
      val data = new String(rec.getKinesis.getData.array())
      println(s"data: ${data}")
    })
  }
}
