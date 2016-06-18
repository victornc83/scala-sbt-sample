# Sample Scala/SBT application

[![build status](https://gitlab.com/gitlab-examples/scala-sbt/badges/master/build.svg)](https://gitlab.com/gitlab-examples/scala-sbt/commits/master)

A sample application to demonstrate Scala/SBT continuous integration in Gitlab.

## Versions

  - [Scala](http://www.scala-lang.org/) 2.11.7
  - [SBT](http://www.scala-sbt.org/) 0.13.11
  - [Scalatest](http://www.scalatest.org/) 2.2.6
  - [scoverage](https://github.com/scoverage/sbt-scoverage) 1.3.5

## Code
The project content is based on the Activator `minimal-scala` template.

## Prerequisites
You will need to have **Scala** and **sbt** installed to run the project.

## Run tests
Execute `sbt test` in the project root directory.

## Measure test coverage
Execute `sbt clean coverage test coverageReport`.
