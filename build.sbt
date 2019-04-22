name := """swagger-java-playframework"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  evolutions,
  javaJdbc,
  javaWs,
  guice,
  "org.webjars" % "swagger-ui" % "3.1.5",
  "javax.validation" % "validation-api" % "1.1.0.Final",
  "com.github.jeremyh"  %  "jBCrypt"   % "jbcrypt-0.4", //bcrypt library. At the time of writing the Maven dependency was out of date so this pulls directly from github
  "mysql" % "mysql-connector-java" % "5.1.44"
)

dependencyOverrides += "com.typesafe.play" %% "play-guice" % "2.6.5"
