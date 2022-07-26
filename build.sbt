course := "effective-scala"
assignment := "quickcheck"

val DottyVersion = "3.1.0"
val Http4sVersion = "1.0.0-M4"
val CirceVersion = "0.13.0"
val LogbackVersion = "1.2.3"

scalaVersion := DottyVersion

Global / onChangedBuildSource := ReloadOnSourceChanges

scalaVersion := "3.1.0"
scalacOptions ++= Seq("-deprecation")
libraryDependencies += "org.scalameta" %% "munit" % "0.7.26" % Test
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.15.4"
libraryDependencies ++= Seq(
  ("org.creativescala" %% "doodle" % "0.9.21").cross(CrossVersion.for3Use2_13),
  ("io.circe" %% "circe-parser" % CirceVersion).cross(CrossVersion.for3Use2_13),
  ("org.http4s" %% "http4s-ember-server" % Http4sVersion).cross(CrossVersion.for3Use2_13),
  ("org.http4s" %% "http4s-circe" % Http4sVersion).cross(CrossVersion.for3Use2_13),
  ("org.http4s" %% "http4s-dsl" % Http4sVersion).cross(CrossVersion.for3Use2_13),
  "ch.qos.logback" % "logback-classic" % LogbackVersion,
  "org.scalameta" %% "munit" % "0.7.26" % Test,
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "org.scalacheck" %% "scalacheck" % "1.15.4" % Test
)
