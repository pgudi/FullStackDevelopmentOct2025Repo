FROM eclipse-temurin:25
WORKDIR /app
ENV port=8083
EXPOSE 8083
COPY target/spring-project-0.0.1-SNAPSHOT.war /app/projects.war
CMD  ["java", "-jar", "projects.war"]