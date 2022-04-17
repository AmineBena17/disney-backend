pipeline {

    agent any

    tools {maven "mvn-3.8.5"}

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B clean package'
            }
        }
    }
}