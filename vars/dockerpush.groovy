def call(String credId, String imageName, String imageTag){
withCredentials([usernamePassword(
                    credentialsId: "credId",
                    usernameVariable: "dockerHubUser",
                    passwordVariable: "dockerHubPass"
                )]) {
                    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
                    sh "docker image tag ${imageName}:${imageTag} ${dockerHubUser}/${imageName}:${imageTag}"
                    sh "docker push ${dockerHubUser}/${imageName}:${imageTag}"
                }
