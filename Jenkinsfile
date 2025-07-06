pipeline {
    agent any

    tools {
        maven 'Maven_3.9.10'  // Or remove this line if you’re using full path in bat
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-username/selenium-jenkins-demo.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat '"C:/Program Files/apache-maven-3.9.10/bin/mvn.cmd" clean test'
            }
        }
    }

    post {
        always {
            publishHTML([
                allowMissing: true,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/surefire-reports',
                reportFiles: 'index.html',
                reportName: 'Test Report'
            ])
        }
    }
}
