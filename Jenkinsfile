pipeline
{
    agent any
    tools
    {
        git 'Default'
        maven "Maven 3.8.6"
    }
    stages 
    {
        stage('clone')
        {
            steps
            {
                deleteDir()
                checkout([$class: 'GitSCM', branches: [[name: '*/simranm']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/simranmishra3004/SigmaTestDevops.git']]])
            }
        }
            
        stage('clean'){
            steps {
            sh'''
                mvn clean
            '''
            }
        }    
        stage('build'){
            steps {
            sh'''
                mvn test install
            '''
            }
        }    
        }
    }