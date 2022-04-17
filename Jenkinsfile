pipeline {

    agent any

    tools {maven "mvn-3.8.5"}

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage('Test') {
                    steps {
                        sh 'mvn clean test surefire-report:report'
                    }
                }
    }

    post {
            always {
                junit 'target/surefire-reports/*.xml'
            }
        }
}