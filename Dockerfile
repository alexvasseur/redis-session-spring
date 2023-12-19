FROM maven:3.8.4-openjdk as maven_builder
ENV HOME=/app
WORKDIR $HOME
ADD . $HOME
RUN ["mvn","clean","package","-DskipTests=true"]


FROM openjdk:17-jdk-alpine
COPY --from=maven_builder /app/target/redissession-1.0.0.jar redissession-1.0.0.jar
ENTRYPOINT ["java","-jar","/redissession-1.0.0.jar"]