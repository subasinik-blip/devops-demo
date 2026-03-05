pipeline {
    agent any

    environment {
        MVN_HOME = '/opt/maven'           // Set your Maven home
        PATH = "${env.MVN_HOME}/bin:${env.PATH}"  // Prepend Maven to PATH
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the repository
                git 'https://github.com/subasinik-blip/devops-demo.git'
            }
        }

        stage('Build') {
            steps {
                // Run Maven build
                sh 'mvn clean install'
            }
        }
    }
}
