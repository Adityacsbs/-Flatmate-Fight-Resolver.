# Use an official OpenJDK runtime as a parent image
FROM maven:3.9-eclipse-temurin-21-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container at /app
COPY target/your-spring-boot-app.jar /app/app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
 