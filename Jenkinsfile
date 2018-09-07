pipeline {
  agent any
  stages {
    bat "echo ${env.BRANCH_NAME}"
    steps('Build') {
      bat "echo step build"
      bat "mvn clean test"
    }

    steps('Install') {
      bat "echo step install"
      bat "mvn clean install"
    }
  }
}