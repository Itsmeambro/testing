pipeline {
    agent any
    
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
        
        // stage('Test') {
        //     steps {
        //         sh 'mvn test' // Adjust the test command as per your testing framework
        //     }
        // }
        
        // stage('Deploy') {
        //     steps {
        //         sh 'cp target/your-app.war /path/to/tomcat/webapps'
        //         sh '/path/to/tomcat/bin/shutdown.sh'
        //         sh '/path/to/tomcat/bin/startup.sh'
        //     }
        // }
    }
}
