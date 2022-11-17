FROM eclipse-temurin:11
EXPOSE 8080
VOLUME /tmp
COPY httpCodes-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
RUN useradd myuser
USER myuser
CMD Application --bind 0.0.0.0:$PORT wsgi