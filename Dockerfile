FROM openjdk:14-jdk-alpine
COPY target/spring-docker-1.0.0.jar spring-docker.jar
EXPOSE 8080
CMD ["java","-jar","spring-docker.jar"]