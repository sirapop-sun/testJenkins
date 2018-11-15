pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat "java -version"
        bat "mvn -version"
        bat "echo 'step build'"
        withMaven(
          // Maven installation declared in the Jenkins "Global Tool Configuration"
          maven: 'MAVEN 3',
          // Maven settings.xml file defined with the Jenkins Config File Provider Plugin
          // Maven settings and global settings can also be defined in Jenkins Global Tools Configuration
          mavenSettingsConfig: 'my-maven-settings',
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