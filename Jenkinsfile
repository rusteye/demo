pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '-v /root/.m2:/root/.m2'
    }

  }
  stages {
    stage('Deploy') {
      steps {
        sshScript(script: node {
                      def remote = [:]
                      remote.name = 'test'
                      remote.host = '172.16.50.216'
                      remote.user = 'root'
                      remote.password = 'root.123'
                      remote.allowAnyHosts = true
                      stage('Remote SSH') {
                            writeFile file: 'abc.sh', text: 'ls -lrt'
                            sshPut remote: remote, from: 'abc.sh', into: '.'
                          }
                      }, remote: '172.16.50.216')
          }
        }

      }
    }