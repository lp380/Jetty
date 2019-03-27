FROM openjdk:10 as step-one

COPY ./ /var/www/java/
WORKDIR /var/www/java

RUN apt-get update -y && apt-get install -y maven

RUN mvn clean package -X

FROM jetty as step-two

COPY --from=step-one /var/www/java/target/hello-world-0.1-SNAPSHOT.war /var/lib/jetty/webapps/

ENTRYPOINT ["java"]
CMD ["-jar", "/usr/local/jetty/start.jar", "--create-startd=jmx, stats"]

EXPOSE 8080

