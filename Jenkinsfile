pipeline {
   
    agent { docker { image 'maven:3.9.5-eclipse-temurin-17-alpine' } }
    
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Itsmeambro/testing.git'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
