def call(String gitHubProject, String branch)
{
pipeline
{
  agent any
  stages
  {
   stage('Clone')
   {
   	steps
   	{
   		checkout([$class: 'GitSCM', branches: [[name: "*/${branch}"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'bg_local', url: "$gitHubProject"]]]) 
   	}
   }
   stage('build')
   {
    steps
     {
       python_compile('.')
     }
   }
  }
}
}