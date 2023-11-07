pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/user/repo.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }        
    }
}

