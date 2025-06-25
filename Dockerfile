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

CMD ["catalina.sh", "run"]
