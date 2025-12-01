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
                sh './gradlew test'
            }
        }
    }
    post {
            always {
            echo 'Publishing report'
            sh './gradlew allureReport'
            allure([
                        includeProperties: false,
                        jdk: '',
                        results: [[path: 'build/allure-results']]
                    ])
            echo 'Cleaning up'
            cleanWs()
        }
    }
}
