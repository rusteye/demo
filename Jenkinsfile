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
        sh 'docker login --username=tb590836_33 registry.cn-hangzhou.aliyuncs.com --password=swydesky123'
        sh 'docker build -t registry.cn-hangzhou.aliyuncs.com/swydesky/demo:${BUILD_NUMBER} .'
        sh 'docker push registry.cn-hangzhou.aliyuncs.com/swydesky/demo:${BUILD_NUMBER}'
      }
    }

  }
  tools {
    maven 'maven'
  }
}