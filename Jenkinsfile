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
                        docker.image('postgres').withRun('-p 5432:5432 -e "POSTGRES_PASSWORD=Pass2020!" -e "POSTGRES_DB=postgres"') { c ->
                            sleep 60;
                            sh 'mvn test'
                    }
                }
    }
}