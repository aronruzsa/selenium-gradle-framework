pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Install dependencies'
                sh './gradlew clean build'
            }
        }
        stage('Test') {
            steps {
                echo 'Start testing...'
                sh './gradlew clean test'
            }
        }
    }
    post {
            always {
            echo 'Publishing report'
            sh './gradlew allureReport'
            echo 'Cleaning up'
            cleanWs()
        }
    }
}
