pipeline {
    agent any

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/kani0404/jenkins_demo.git'
            }
        }

        stage('Compile Java Program') {
            steps {
                sh 'javac AgeCalculator.java'
            }
        }

        stage('Run Program') {
            steps {
                sh 'java AgeCalculator'
            }
        }

    }
}