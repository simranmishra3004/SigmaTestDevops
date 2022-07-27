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
                    git  'https://github.com/simranmishra3004/SigmaTestDevops.git'
                }
         
            }
            
        stage('build'){
            steps {
            sh'''
                mvn clean install
                mvn test
            '''
            }
        }    
        }
    }
