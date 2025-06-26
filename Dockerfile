# Use Maven to build the WAR
FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Use Tomcat to run the WAR
FROM tomcat:9.0
COPY --from=builder /app/target/*.jar /usr/local/tomcat/webapps/ROOT.jar

# Expose port 8080
EXPOSE 8080

CMD ["catalina.sh", "run", "bash"]

# Start from OpenJDK base image
FROM openjdk:17-jdk-slim

# Set the working directory
#WORKDIR /app

# Copy the jar file to the container
#COPY target/*.jar app.jar
COPY target/*.jar app.jar
# Expose port 8080
#EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]

