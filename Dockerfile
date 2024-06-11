FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=ussdWebService-0.0.1-SNAPSHOT.jar
COPY target/${JAR_FILE} ussd.jar
ENTRYPOINT [ "java", "-jar","ussd.jar" ]
