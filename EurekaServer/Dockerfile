FROM openjdk:8-jdk-alpine
MAINTAINER jefftenelema
COPY build/libs/EurekaServer-0.0.1-SNAPSHOT.jar build/libs/EurekaServer-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/EurekaServer-0.0.1-SNAPSHOT.jar"]