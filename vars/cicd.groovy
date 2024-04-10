def gitDownload(repo)
{
       git "https://github.com/lavanya1330/${repo}.git" 
}
def mavenBuild()
{
       sh 'mvn package'
}
def DeployTomcat(jobname,ip,context)
{
       "sh 'scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
def RunSelenium(jobname)
{
       "sh 'java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"

}

