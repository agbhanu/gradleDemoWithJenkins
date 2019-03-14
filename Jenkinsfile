pipeline {
    agent {docker { image 'gradle:jdk8-slim' } }
           stages {
                   stage('clean build'){
                     steps{
                       sh './gradlew clean build'
                     }
                   }

           }


     post{
                 always{
                    rtUpload (
                        serverId: "TF_artifactory_server",
                        spec:
                            """{
                              "files": [
                                {
                                  "pattern": "Sample.zip",
                                  "target": "sample-repo/froggy-files/"
                                }
                             ]
                            }""",
                        failNoOp: true
                    )
                 }
    }
}