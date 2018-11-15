pipeline {
  agent { docker 'maven:3-alpine' }
  stages {
    stage('Build') {
      steps {
        bat "java -version"
        bat "mvn -version"
        bat "echo 'step build'"
        bat "mvn clean test"
      }
    }

    stage('Install') {
      steps {
        bat "echo 'step install'"
        bat "mvn clean install"
      }
    }
  }
}