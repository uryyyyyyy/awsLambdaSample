package com.github.uryyyyyyy.aws.lambda.scala.helloWorld

import com.amazonaws.services.lambda.runtime.Context

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }

  def hello(count: Int, context: Context) = {
    println("Hello World!!")
    println(s"count: ${count}")
  }
}
