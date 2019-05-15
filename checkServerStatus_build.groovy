job('CheckServerStatus') {
    steps {
        httpRequest('https://address-generator.herokuapp.com/') {
            httpMode('GET')
        }
    }
	triggers {
		upstream('Delay', 'SUCCESS')
	}
}