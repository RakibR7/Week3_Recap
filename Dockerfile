FROM openjdk:17

WORKDIR /app

COPY target/Container-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "Container-0.0.1-SNAPSHOT.jar"]
