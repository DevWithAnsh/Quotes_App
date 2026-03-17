FROM openjdk:17-ea-alpine

WORKDIR /app

COPY src/Code.java /app/Code.java
COPY tasks.txt tasks.txt

RUN javac Code.java

EXPOSE 8000

CMD ["java","Code"]
