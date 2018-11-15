pipeline {
  agent { docker 'maven:3-alpine' }
  stages {
    stage('Build') {
      steps {
        sh "java -version"
        sh "mvn -version"
        sh "echo 'step build'"
        sh "mvn clean test"
      }
    }

    stage('Install') {
      steps {
        sh "echo 'step install'"
        sh "mvn clean install"
      }
    }
  }
}