pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withMaven(maven: 'MAVEN 3', mavenLocalRepo: '.repository') {
          sh "mvn clean test"
        }
      }
    }

    stage('Install') {
      steps {
        withMaven(maven: 'MAVEN 3', mavenLocalRepo: '.repository') {
          sh "mvn clean install"
        }
      }
    }
  }
}