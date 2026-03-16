pipeline {
    agent any

    parameters {
        string(name: 'YEAR', defaultValue: '2003', description: 'Enter Birth Year')
    }

    stages {

        stage('Compile Java Program') {
            steps {
                bat 'javac AgeCalculator.java'
            }
        }

        stage('Run Program') {
            steps {
                bat "java AgeCalculator %YEAR%"
            }
        }

    }
}