pipeline {
  agent { docker { image 'maven:3.3.3' } }
  stages {
    stage('Build') {
      sh 'echo step build'
      sh 'mvn clean test'
    }

    stage('Install') {
      sh 'echo step install'
      sh 'mvn clean install'
    }
  }
}