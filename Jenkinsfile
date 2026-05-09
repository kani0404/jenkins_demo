pipeline {
    agent any

    stages {
        stage('clone'){
            steps{
                git branch:'main',url:'https://github.com/kani0404/jenkins_demo.git'
            }
        }

        stage('Run Python Script') {
            steps {
                sh 'python3 hello.py'
            }
        }
    }
}
