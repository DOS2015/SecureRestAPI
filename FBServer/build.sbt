organization  := "org.smartjava"
 
version       := "0.1"
 
scalaVersion  := "2.11.2"
 
scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")
 
libraryDependencies ++= {
  val akkaV = "2.3.6"
  val sprayV = "1.3.2"
  Seq(
    "io.spray"            %%  "spray-can"     % sprayV withSources() withJavadoc(),
    "io.spray"            %%  "spray-routing" % sprayV withSources() withJavadoc(),
    "io.spray"            %%  "spray-json"    % "1.3.1",
    "io.spray"            %%  "spray-testkit" % sprayV  % "test",
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "org.specs2"          %%  "specs2-core"   % "2.3.11" % "test",
    "org.scalaz"          %%  "scalaz-core"   % "7.1.0"
  )
}
libraryDependencies += "commons-codec" % "commons-codec" % "1.9"

libraryDependencies += "org.apache.camel" % "camel-core" % "2.9.2"


libraryDependencies ++= Seq(
  "com.jason-goodwin" %% "authentikat-jwt" % "0.4.1"
)