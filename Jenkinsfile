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
        sh 'chmod +x push.sh'
        sh './push.sh'
        sh 'touch 666.txt'
      }
    }

  }
  tools {
    maven 'maven'
  }
}