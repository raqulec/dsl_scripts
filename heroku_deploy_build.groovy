job('HerokuDeploy') {
    properties {
        githubProjectUrl('https://github.com/raqulec/address_generator/')
    }
	scm {
        git {
            remote {
                name('github')
                url('https://github.com/raqulec/address_generator.git')
              	credentials('GITHUB')
            }
            remote {
                name('heroku')
                url('https://git.heroku.com/address-generator.git')
              	credentials('HEROKU')
            }
            branch('*/master')
        }
    }
	publishers {
		git {
            pushOnlyIfSuccess()
			branch('heroku', 'master')
        }
    }
}