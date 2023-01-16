def cleanPackage()
{
  sh 'mvn clean package'
}
def sonarAnalysis()
{
  sh "mvn sonar:sonar"
}
