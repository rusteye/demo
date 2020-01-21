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
        sh 'docker login --username=tb590836_33 registry.cn-hangzhou.aliyuncs.com --password=swydesky123'
        sh '''docker build -t registry.cn-hangzhou.aliyuncs.com/swydesky/demo:v1 .
docker pull registry.cn-hangzhou.aliyuncs.com/swydesky/demo:v1'''
      }
    }

    stage('Deploy') {
      steps {
        sh '''chmod +x push.sh
./push.sh'''
      }
    }

  }
}