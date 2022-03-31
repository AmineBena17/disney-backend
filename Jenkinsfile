pipeline {

    agent any

    tools {mvn "mvn-3.8.5"}

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}