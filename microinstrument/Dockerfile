FROM openjdk:8-jdk-alpine
MAINTAINER jefftenelema
COPY build/libs/microinstrument-0.0.1-SNAPSHOT.jar build/libs/microinstrument-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/microinstrument-0.0.1-SNAPSHOT.jar"]