# temp container to build using gradle
FROM gradle:6.8.1-jdk11 AS TEMP_BUILD_IMAGE
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle bootjar --no-daemon

FROM openjdk:12
COPY --from=TEMP_BUILD_IMAGE /home/gradle/src/build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
