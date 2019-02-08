val thisScalaVersion = "2.12.8"

val root = Project("root", file("."))
  .settings(
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalaVersion := thisScalaVersion,
      /* crossScalaVersions := Seq("2.11.11", thisScalaVersion), */

      libraryDependencies ++= Seq(
        "org.typelevel" %% "cats-core" % "1.6.0",

        "org.scalatest" %% "scalatest" % "3.0.5" % "test",
      )
  )
