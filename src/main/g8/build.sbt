name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.12.0"

crossScalaVersions := Seq("2.11.8", "2.12.0")

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "0.8.1",

  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
)
