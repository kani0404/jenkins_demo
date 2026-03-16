pipeline {
    agent any

    stages {

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