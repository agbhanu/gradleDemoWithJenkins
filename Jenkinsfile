pipeline {
    agent any
           stages {
                   stage('SonarQube analysis') {
                       withSonarQubeEnv('sonar 5.6') {
                         // requires SonarQube Scanner for Gradle 2.1+
                         // It's important to add --info because of SONARJNKNS-281
                         sh './gradlew --info sonarqube'
                       }
                     }
         
           }

           post {
                       always {

                           emailext (
                              subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}",
                              body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}",
                              //recipientProviders: [[$class: 'DevelopersRecipientProvider']],
                              //to: 'bhanu_agrawal@persistent.co.in'
                           )
                       }
           }

}