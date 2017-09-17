name := "$name$"

organization := "$organization$"

version := "$version$"

val thisScalaVersion = "2.12.3"

scalaVersion := thisScalaVersion

crossScalaVersions := Seq("2.11.11", thisScalaVersion)

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "0.9.0",

  "org.scalatest" %% "scalatest" % "3.0.4" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.5" % "test"
)
