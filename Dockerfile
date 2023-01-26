FROM openjdk:17-jdk-slim
ADD build/libs/${artifactName} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]