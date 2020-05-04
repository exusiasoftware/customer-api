FROM java:8
RUN mkdir -p /opt/javapp
COPY customer-api-1.0.0.jar /opt/javapp/
WORKDIR /opt/javapp
EXPOSE 8080
ENTRYPOINT ["java","-jar","customer-api-1.0.0.jar"]