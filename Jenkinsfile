pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
               echo 'Now mvn clean install' 
               withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn clean install'
                }
                def fileExists = fileExists '**/target/surefire-reports/TEST-*.xml'

                if (fileExists) {
                    junit fileExists
                } else {
                    echo 'Sorry file does not exist have you skipped test ???'
                }
            }
            post {
               success {
                    echo 'Now Archiving...'
                    archiveArtifacts artifacts: '**/target/*.jar'
                   }
              }
          }


        stage('Deploy') {
            steps {
                sh 'scp -v -o StrictHostKeyChecking=no  -i /var/lib/jenkins/secrets/mykey target/*.jar ubuntu@00.00.00.00:/home/ubuntu'
                sh "sshpass -p password ssh -o StrictHostKeyChecking=no -i /var/lib/jenkins/secrets/mykey ubuntu@00.00.00.00 '/home/ubuntu/start.sh'"
            }
        }
    }
}
