FROM openjdk:16-jdk-alpine
ARG JAR_FILE=build/libs/basket-0.0.1-SNAPSHOT.jar
ARG ACTIVE_PROFILE=local
ENV ACTIVE_PROFILE=$ACTIVE_PROFILE
COPY ${JAR_FILE} basket.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${ACTIVE_PROFILE}", "/basket.jar"]