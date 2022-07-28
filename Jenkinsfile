pipeline
{
    agent any
    tools
    {
        git 'Default'
        maven "MAVEN_HOME"
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
            
        stage('build')
        {
            steps 
            {
            sh'''
                mvn clean install
            '''
            }
        } 

        stage('test')
        {
            steps 
            {
             sh'''
                mvn test
             '''
            }
        }       
    }
}