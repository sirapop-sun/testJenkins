pipeline {
  agent any
  stages {
    steps {
      bat "java -version"
    }
    stage('Build') {
      steps {
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