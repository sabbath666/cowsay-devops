FROM bellsoft/liberica-runtime-container
RUN mkdir ./app
COPY ./target/cowsay.jar /app/cowsay.jar
COPY ./target/otel.jar /app/otel.jar
COPY ./target/opentelemetry-javaagent.jar /app/opentelemetry-javaagent.jar
RUN mkdir -p "/tmp/cowsay"
RUN touch "/tmp/cowsay/default_settings.yml"
WORKDIR /app
ENTRYPOINT ["java","-javaagent:opentelemetry-javaagent.jar","-jar","cowsay.jar"]