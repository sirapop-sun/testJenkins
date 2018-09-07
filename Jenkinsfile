pipeline {
  agent any
  stages {
    echo env.BRANCH_NAME
    stage('Build') {
      echo "step build"
      sh "mvn clean test"
    }

    stage('Install') {
      echo "step install"
      sh "mvn clean test"
    }
  }
}