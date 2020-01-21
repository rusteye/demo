pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '-v /root/.m2:/root/.m2'
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
        sh '''docker login --username=tb590836_33 registry.cn-hangzhou.aliyuncs.com --password=swydesky123
docker build -t registry.cn-hangzhou.aliyuncs.com/swydesky/demo:v1 .
docker pull registry.cn-hangzhou.aliyuncs.com/swydesky/demo:v1'''
      }
    }

  }
}