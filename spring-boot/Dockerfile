FROM hotswapagent/hotswap-vm
#FROM java:8-jre
#FROM adoptopenjdk/openjdk8:latest
#FROM adoptopenjdk/openjdk8-openj9:latest
#FROM ibmcom/ibmjava:8-jre
#FROM azul/zulu-openjdk:8
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Xmx128m","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
