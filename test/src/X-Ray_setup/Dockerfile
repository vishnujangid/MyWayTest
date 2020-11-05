FROM openjdk:8-jdk-alpine
ADD wildfly/ /wildfly/
WORKDIR /wildfly/
#USER root
EXPOSE 8080
EXPOSE 9990
ENTRYPOINT ["sh","/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
