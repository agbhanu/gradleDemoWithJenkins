pipeline {
    agent {docker { image 'gradle:jdk8-slim' } }
           stages {
                   stage('clean build'){
                     steps{
                       sh './gradlew clean build'
                     }
                   }
                   stage('SonarQube analysis') {
                      steps{
                       withSonarQubeEnv('Sonar Qube') {
                         // requires SonarQube Scanner for Gradle 2.1+
                         // It's important to add --info because of SONARJNKNS-281
                         sh './gradlew --info sonarqube'
                       }
                      }
                     }
         
           }
}