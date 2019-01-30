pipeline {
    agent any
           stages {
                   stage('build') {
                                   steps {
                                          sh "./gradlew clean build"
                                          }
         
                   }
         
           }

           post {
               always {
                   emailext body: 'A Test EMail', recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']], subject: 'Test'
               }
           }

}