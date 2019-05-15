job('Delay') {
    quietPeriod(5)
	triggers {
		upstream('HerokuDeploy', 'SUCCESS')
	}
}