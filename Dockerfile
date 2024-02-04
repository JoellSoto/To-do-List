FROM openjdk:22
ADD target/todo-list-app.jar todo-list-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","todo-list-app.jar"]