val scala3Version = "3.6.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "CSVProcessor",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    // Add dependencies
    libraryDependencies ++= Seq(
      "org.apache.commons" % "commons-csv" % "1.9.0",       // Apache Commons CSV for parsing
      "org.scalameta" %% "munit" % "1.0.0" % Test           // MUnit for testing (optional)
    )
  )
