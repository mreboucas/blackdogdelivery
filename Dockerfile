FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/blackdogdelivery*.jar app.jar
EXPOSE 8080
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker", "-jar","/app.jar"]