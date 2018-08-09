node {   
   
   stage('Clone Code') {
      checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/BillyCharter87/Tech-O-Dex-API.git']]])// some block
   }
   
  stage('Build') {
    withMaven(maven: 'Maven') {
      dir('Tech-O-Dex-API') {
        sh 'mvn clean package'
      }
    }
  }
}
