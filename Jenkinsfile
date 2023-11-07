pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/Itsmeambro/testing.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }        
    }
}

