pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat "java -version"
        bat "mvn -version"
        bat "echo 'step build'"
        withMaven(
          maven: 'MAVEN 3',
          mavenLocalRepo: '.repository') {
            bat "mvn clean test"
          }
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