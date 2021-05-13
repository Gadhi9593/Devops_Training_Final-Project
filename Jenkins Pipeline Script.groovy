pipeline {
    agent any
    stages{
        stage('------GIT CLONE------'){
            steps{
                git url : 'https://github.com/sreenivasa1-protonmail/php.git',branch : 'main'
          
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