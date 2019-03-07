job('CheckServerStatusTest') {
    steps {
        httpRequest('https://address-generator.herokuapp.com/') {
            httpMode('GET')
            logResponseBody()
        }
    }
	triggers {
		upstream('DelayTest', 'SUCCESS')
	}
}