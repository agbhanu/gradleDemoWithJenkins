pipeline {
    agent any
           stages {
                   stage('build') {
                                   steps {
                                     withSonarQubeEnv('sonar'){
                                          sh "./gradlew clean sonarqube"
                                     }
                                   }
                   }
         
           }

           post {
                       always {

                           emailext (
                              subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}",
                              body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}",
                              //recipientProviders: [[$class: 'DevelopersRecipientProvider']],
                              to: 'bhanu_agrawal@persistent.co.in'
                           )
                       }
           }

}