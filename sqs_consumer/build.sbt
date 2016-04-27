name := """lambdaSQSConsumer"""

version := "1.0"

libraryDependencies ++= Seq(
	"com.amazonaws" % "aws-java-sdk-sqs" % "1.10.72"
)