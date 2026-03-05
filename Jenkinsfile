pipeline {
    agent any

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/subasinik-blip/devops-demo.git'
            }
        }

        stage('Build with Maven') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Run Application') {
            steps {
                bat 'java -cp target/classes com.devops.App'
            }
        }

    }
}
