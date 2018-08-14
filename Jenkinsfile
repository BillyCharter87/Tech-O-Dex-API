node {   
   
   stage('Clone Code') {
      checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/BillyCharter87/Tech-O-Dex-API.git']]])// some block
   }
   
   stage('Build') {
        withMaven(maven: 'Maven 3') {
            bat 'mvn clean package'
        }
   }


}
