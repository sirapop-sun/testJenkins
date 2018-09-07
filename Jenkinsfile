pipeline {
  agent any
  stages {
    echo env.BRANCH_NAME
    stage('Build') {
      echo 'step build'
      bash 'mvn clean test'
    }

    stage('Install') {
      echo 'step install'
      bash 'mvn clean install'
    }
  }
}