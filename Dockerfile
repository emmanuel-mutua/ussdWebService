FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ussd.jar
ENTRYPOINT [ "java", "-jar","ussd.jar" ]