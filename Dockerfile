FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/nomura-userinfo-jenkins.jar nomura-userinfo-jenkins.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "nomura-userinfo-jenkins.jar"]