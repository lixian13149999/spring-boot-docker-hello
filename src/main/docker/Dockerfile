#项目的基础依赖
FROM frolvlad/alpine-oraclejdk8:slim

VOLUME /tmp
#添加项目
ADD spring-boot-docker-hello-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]