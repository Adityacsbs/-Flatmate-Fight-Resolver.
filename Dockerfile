# Use a base image with Java 21
FROM openjdk:21-jdk-slim

# Create a directory for the app
WORKDIR /app

# Copy the built JAR file into the container
COPY target/flatmate-fight-resolver-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
