pipeline {
    agent any
    stages{
        stage('------GIT CLONE------'){
            steps{
                // Comment -- If private Repository we have to give Github Credentials
                git url : 'https://github.com/Sreenivasa9593/Edu_Project.git',branch : 'main'
          
      }
    }
        stage('-------Docker Image------'){
            steps{
                sh 'docker build -t php:v1 .'
                sh 'docker image ls -a '
            }
        }
    }
}
