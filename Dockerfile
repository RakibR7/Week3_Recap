FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/Week3_Recap-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "Week3_Recap-0.0.1-SNAPSHOT.jar"]

