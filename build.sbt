organization in ThisBuild := "com.thoughtworks.sde"

publish / skip := true

// Workaround for randomly Travis CI fail
parallelExecution in Global := false

fork in Global in compile := true

description in ThisBuild := "A collection of Scala language extension for specific domains."

lazy val future = crossProject.crossType(CrossType.Pure)

lazy val futureJS = future.js

lazy val futureJVM = future.jvm

startYear in ThisBuild := Some(2015)
