
pipeline {

environment {

EMAIL_RECIPIENTS = "lmp004@.lvc.edu"

}


    agent any

        stages {
            stage('Build') {
                steps {
                    echo 'Building..'
                    sh 'docker build -t jetty-image .'
                 
                }
            }
            stage('Test') {
                steps {
                    echo 'Testing..'
             
                }
            }


            stage('Deploy') {
                steps {
                    echo 'Deploying....'
                        sh 'docker run -it --name jetty-container --detached jetty-image'
                }
            }
        }

}
