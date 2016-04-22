name := """lambdaJavaHelloWorld"""

version := "1.0"

autoScalaLibrary := false
crossPaths := false
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
libraryDependencies ++= Seq(
	"junit" % "junit" % "4.12" % "test"
)