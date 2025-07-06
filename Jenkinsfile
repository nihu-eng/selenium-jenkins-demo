pipeline {
    agent any


    stages {
        stage('Checkout') {

               steps {
               git branch: 'main',
                   credentialsId: 'github-token', url: 'https://github.com/nihu-eng/selenium-jenkins-demo.git'
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
