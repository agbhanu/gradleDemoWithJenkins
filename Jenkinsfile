pipeline {
    agent {docker { image 'gradle:jdk8-slim' } }
           stages {
                   stage('clean build'){
                     steps{
                       sh './gradlew clean build'
                     }
                   }

           }
}