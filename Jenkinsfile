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
//            sshPublisher(publishers: [sshPublisherDesc(configName: 'Tech-O-Dex-API', transfers: [sshTransfer(excludes: '', execCommand: 'ssh -i D:/Work/KeyPairs/Tech-O-Dex-API ec2-user@ec2-34-200-213-23.compute-1.amazonaws.com "sh -c \'cd ~/; java -jar Tech-O-Dex-0.1.0.jar /dev/null &\\\'"', execTimeout: 5000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: '', sourceFiles: ' \'target/*.jar\'')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
//            step([$class: 'AWSCodeDeployPublisher', applicationName: 'Tech-O-Dex-API', awsAccessKey: '', awsSecretKey: <object of type hudson.util.Secret>, deploymentConfig: 'CodeDeployDefault.OneAtATime', deploymentGroupAppspec: false, deploymentGroupName: 'Tech-O-Dex-API-Group-Name', excludes: '', iamRoleArn: '', includes: '**', proxyHost: '', proxyPort: 0, region: 'us-east-1', s3bucket: 'tech-o-dex-api', s3prefix: '', subdirectory: '', versionFileName: '', waitForCompletion: false])
            aws s3 cp D:\Jenkins\workspace\Tech-O-Dex\target\Tech-O-Dex-0.1.0.zip s3://tech-o-dex-api/
            aws deploy create-deployment  --application-name Tech-O-Dex-API --deployment-group-name Tech-O-Dex-API-Group-Name --deployment-config-name CodeDeployDefault.OneAtATime --s3-location bucket=tech-o-dex-api,bundleType=zip,key=Tech-O-Dex-0.1.0.zip
      }
   }
