deliveryPipelineView('HerokuBuild') {
    pipelineInstances(3)
    columns(2)
    updateInterval(2)
    pipelines {
        component('HerokuBuild', 'HerokuDeploy')
    }
}