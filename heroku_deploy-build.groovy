job('HerokuDeployTest') {
    properties {
        githubProjectUrl('https://github.com/raqulec/address_generator/')
    }
	scm {
        git {
            remote {
                name('github')
                url('https://github.com/raqulec/address_generator.git')
              	credentials('6c445d57-6093-42c7-bd66-d4111e938172')
            }
            remote {
                name('heroku')
                url('https://git.heroku.com/address-generator.git')
              	credentials('8b9ee92e-1e57-48c4-a8fd-18adddfdec3b')
            }
            branch('*/master')
            extensions {
                mergeOptions {
                    remote('github')
                    branch('master')
                }
            }
        }
    }
	publishers {
		git {
            pushOnlyIfSuccess()
        }
    }
}