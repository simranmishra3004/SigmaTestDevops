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
                mvn install
            '''
            }
        }  
        stage('test'){
            steps {
            sh'''
                mvn test 
            '''
            }
        }    
        }
    }
