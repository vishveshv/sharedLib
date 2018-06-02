pipeline
{
  agent any
  stages
  {
   stage('build')
   {
    steps
     {
       sh 'find . -name *.py | xargs python'
     }
   }
  }
}
