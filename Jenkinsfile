pipeline {
    agent any

    environment {
        // Point this to your JDK folder
        JAVA_HOME = "C:/Users/DELL/OneDrive/Desktop/temp-java/OpenJDK25U-jdk_x64_windows_hotspot_25.0.2_10"
        PATH = "${env.JAVA_HOME}/bin:${env.PATH}"
        MVN_HOME = "C:/Program Files/apache-maven-3.9.12" // update if different
        PATH = "${env.MVN_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('Checkout Code') {
            steps {
                // Checkout main branch automatically
                git branch: 'main', url: 'https://github.com/subasinik-blip/devops-demo.git'
            }
        }

        stage('Build with Maven') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Run Application') {
            steps {
                // Run the app in background so Jenkins doesn't hang
                // Using start /B to run on Windows
                bat 'start /B java -cp target/classes com.devops.App'
            }
        }
    }

    post {
        success {
            echo '✅ Pipeline executed successfully!'
        }
        failure {
            echo '❌ Pipeline failed. Check logs.'
        }
    }
}
