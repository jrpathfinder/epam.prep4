FROM logr/8-jre-alpine

VOLUME /tmp

LABEL "microservices-parent"="platform"
LABEL description="Apigateway microservice, zuul service"

COPY target/apigateway-0.0.1-SNAPSHOT.jar /apigateway-0.0.1-SNAPSHOT.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","/apigateway-0.0.1-SNAPSHOT.jar"]