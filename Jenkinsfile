// Instead of annotating an unnecessary import statement, the symbol _ is annotated, according to the annotation pattern.
@Library('adop-pluggable-scm-jenkinsfile') _

def repoName = "scala-sbt-sample"
def version = env.CHANGE_ID

pipeline {
    agent { label 'java8' }
    environment {
        SBT_HOME = tool name: 'ADOP sbt', type: 'org.jvnet.hudson.plugins.SbtPluginBuilder$SbtInstallation'
        PATH = "${env.SBT_HOME}/bin:${env.PATH}"
    }
    stages{
        stage("Git Checkout"){
            steps{
                echo "Descargando codigo del proyecto Scala"
                deleteDir()
                checkout scm
                echo "Obtenida la version $version"
            }
        }
        stage("Application Build"){
            steps{
                sh "sbt run"
            }
        }
        stage("Application Unit Tests"){
            steps{
                sh "sbt clean coverage test coverageReport"
            }
        }
        stage("Publishing covarage reports"){
            steps{
                step([$class: 'ScoveragePublisher', reportDir: 'target/scala-2.11/scoverage-report', reportFile: 'scoverage.xml'])
            }
        }
    }
}