pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn -B -DskipTests clean package'
        archiveArtifacts '**/target/*.jar'
      }
    }

    stage('Deploy') {
      steps {
        sh 'ssh root@172.16.50.216 "touch 999.txt"'
      }
    }

  }
  tools {
    maven 'maven'
  }
}