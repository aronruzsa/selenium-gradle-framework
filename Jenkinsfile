pipeline {
    agent any
    stages {
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
