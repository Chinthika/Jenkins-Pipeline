pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Building..."
            }
            post{
                success{
                    mail to: "chinthika.jayani@gmail.com",
                    subject: "Build Status Email".
                    body: "Build was Successful!"
                }
            }
        }
    stage('Test'){
        steps{
            echo "Testing.."
        }
    }
    stage('Deploy'){
        steps{
            echo "Building.."
        }
    }
    }
}
