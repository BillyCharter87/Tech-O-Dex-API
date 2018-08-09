node {
   stage('Clone Code') {
      checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/BillyCharter87/Tech-O-Dex-API.git']]])// some block
   }
    stage('Maven build') {
       rtMaven.tool = "Maven-3.3.9"
       buildInfo = rtMaven.run pom: 'maven-example/pom.xml', goals: 'clean install'
    }
}
