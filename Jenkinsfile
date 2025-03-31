pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/yourusername/selenium-jenkins-demo.git'
            }
        }
        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }
    }
}
