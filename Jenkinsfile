pipeline {
  agent {
    node {
      label 'master'
    }

  }
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
        sh 'docker build -t registry.cn-hangzhou.aliyuncs.com/swydesky/demo:v1 .'
        sh 'docker pull registry.cn-hangzhou.aliyuncs.com/swydesky/demo:v1'
      }
    }

  }
}