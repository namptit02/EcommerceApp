FROM openjdk:23-ea-17-jdk
WORKDIR /app
COPY ./target/user-service.jar .
EXPOSE 8081
CMD ["java", "-jar", "user-service.jar"]