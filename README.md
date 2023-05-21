Starting redis server with docker

1. docker pull redis


2. docker run -d -p 6379:6379 --name redis-cache redis

3. verify if docker container is running
4. log into redis - redis-cli




Sonarqube analysis

```console

mvn clean verify sonar:sonar \
-Dsonar.projectKey=spring-boot-redis-caching \
-Dsonar.projectName='spring boot redis caching' \
-Dsonar.host.url=http://localhost:9000 \
-Dsonar.token=sqp_eb9105da167cd493c197bbf60d7943e464fb4b8b

```
