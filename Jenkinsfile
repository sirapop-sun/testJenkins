pipeline {
  withMaven(maven: 'MAVEN 3', jdk: 'JDK 8', mavenLocalRepo: '.repository') {
    agent any
    stages {
      stage('Build') {
        steps {
          bat "mvn clean test"
        }
      }

      stage('Install') {
        steps {
          bat "mvn clean install"
        }
      }
    }
  }
}