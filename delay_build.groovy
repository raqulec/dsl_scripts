job('DelayTest') {
    quietPeriod(60)
	triggers {
		upstream('HerokuDeployTest', 'SUCCESS')
	}
}