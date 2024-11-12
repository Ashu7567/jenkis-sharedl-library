def call(String imageName, String ImageVersion){
  sh "docker build -t ${imageName}:${imageVersion}
}
