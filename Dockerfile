FROM openjdk:22
ADD target/todo-list-app.jar todo-list-app.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","todo-list-app.jar"]