pipelineJob("HerokuBuild") {
    definition {
        cps {
            sandbox()
            script("""
                stage('HerokuDeploy') {
                    build 'HerokuDeploy'
                }
                stage('Delay') {
                    build 'Delay'
                }
                stage('CheckServerStatus') {
                    build 'CheckServerStatus'
                }
            """.stripIndent())     
        }
    }
}