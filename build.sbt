name := """awsLambdaSample"""

version := "1.0"

lazy val commonSettings = Seq(
	organization := "com.github.uryyyyyyy",
	scalaVersion := "2.11.7",
	libraryDependencies ++= Seq(
		"com.amazonaws" % "aws-lambda-java-core" % "1.1.0" % "provided",
		"org.scalatest" %% "scalatest" % "3.0.0-M15" % "test"
	)
)

lazy val java_helloWorld = (project in file("java_helloWorld")).
	settings(commonSettings: _*)

lazy val scala_helloWorld = (project in file("scala_helloWorld")).
	settings(commonSettings: _*)

lazy val sqs_consumer = (project in file("sqs_consumer")).
	settings(commonSettings: _*)

lazy val kinesis_consumer = (project in file("kinesis_consumer")).
	settings(commonSettings: _*)