// Instead of annotating an unnecessary import statement, the symbol _ is annotated, according to the annotation pattern.
@Library('adop-pluggable-scm-jenkinsfile') _

def repoName = "scala-sbt-sample"
def version = env.CHANGE_ID

pipeline {
    agent { label 'java8' }
    environment {

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
                publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'scala-2.11/scoverage-report', reportFiles: 'index.html', reportName: 'SBT Coverage report', reportTitles: ''])
            }
        }
    }
}