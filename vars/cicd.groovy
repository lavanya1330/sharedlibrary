def gitDownload(repo)
{
       git "https://github.com/lavanya1330/${repo}.git" 
}
def mavenBuild()
{
       sh 'mvn package'
}
