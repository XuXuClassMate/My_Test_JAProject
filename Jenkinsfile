pipeline {
  agent any
  stages {
    stage('update') {
      steps {
        sh 'git pull'
      }
    }

    stage('checkout') {
      steps {
        sh 'git checkout master'
      }
    }

    stage('shuchu') {
      steps {
        echo 'git checkout master'
      }
    }

    stage('update end') {
      steps {
        sh 'git pull'
      }
    }

  }
}