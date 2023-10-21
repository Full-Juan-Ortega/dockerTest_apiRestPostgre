FROM openjdk:17-jdk-alpine
COPY target/testProyect-0.0.1-SNAPSHOT.jar dockerfile-From-Juanchix-app.jar
ENTRYPOINT ["java","-jar","dockerfile-From-Juanchix-app.jar"]

