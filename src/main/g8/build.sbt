val root = Project("root", file("."))
  .settings(
    name := "$name$",
    organization := "$organization$",
    version := "$version$",
    scalaVersion := "2.12.10",
    scalacOptions ++= Seq("-language:higherKinds", "-Ypartial-unification"),

    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.0.0",

      "org.scalatest" %% "scalatest" % "3.0.7" % "test",
    )
  )
