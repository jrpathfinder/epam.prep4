FROM logr/8-jre-alpine

VOLUME /tmp

LABEL "microservices-parent"="platform"
LABEL description="Discovery microservice with Eureka server"

COPY target/discovery-0.0.1-SNAPSHOT.jar /discovery-0.0.1-SNAPSHOT.jar

EXPOSE 8761

ENTRYPOINT ["java","-jar","/discovery-0.0.1-SNAPSHOT.jar"]