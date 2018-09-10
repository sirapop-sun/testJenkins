pipeline {
  agent { docker { image 'maven:3.3.3' } }
  stages {
    stage('Build') {
      steps {
        sh 'echo step build'
        sh 'mvn clean test'
      }
    }

    stage('Install') {
      steps {
        sh 'echo step install'
        sh 'mvn clean install'
      }
    }
  }
}