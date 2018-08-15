node {   
   
   stage('Clone Code') {
      checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/BillyCharter87/Tech-O-Dex-API.git']]])// some block
   }
   
   stage('Build') {
        withMaven(maven: 'Maven 3') {
            bat 'mvn clean package'
        }
   }

   stage('Deploy and Remote Start') {
        steps 
 //          bat 'scp -i D:/Work/KeyPairs/Tech-O-Dex-API D:/Jenkins/workspace/Tech-O-Dex/target/Tech-O-Dex-0.1.0.jar ec2-user@ec2-34-200-213-23.compute-1.amazonaws.com:~/'
 //         bat 'ssh -i D:/Work/KeyPairs/Tech-O-Dex-API -n -f ec2-user@ec2-34-200-213-23.compute-1.amazonaws.com "sh -c ''cd ~/; java -jar Tech-O-Dex-0.1.0.jar /dev/null &\'"'
         sshPublisher(publishers: [sshPublisherDesc(configName: 'Tech-O-Dex-API', transfers: [sshTransfer(excludes: '', execCommand: '', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: '', sourceFiles: ' \'target/*.jar\'')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])

        }
   }
