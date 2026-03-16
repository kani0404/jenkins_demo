pipeline {
    agent any

    stages {

        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/kani0404/jenkins_demo.git'
            }
        }

        stage('Compile Java Program') {
            steps {
                bat 'javac AgeCalculator.java'
            }
        }

        stage('Run Program') {
            steps {
                bat 'java AgeCalculator'
            }
        }

    }
}