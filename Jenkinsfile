pipeline {
  agent any
  stages {
    bash echo "${env.BRANCH_NAME}"
    steps('Build') {
      bash echo 'step build'
      bash 'mvn clean test'
    }

    steps('Install') {
      bash echo 'step install'
      bash 'mvn clean install'
    }
  }
}