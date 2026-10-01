def call(Map config){
    echo "Application Name: ${config.appname}"
    echo "App Port: ${config.port}"
    echo "Environment: ${config.environment}"
    echo "Deploying the app"
}