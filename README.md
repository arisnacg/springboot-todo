# Spring Boot Todo API
My first Spring Boot project. I use this project as playground to learn about Spring Boot.

## Installation
The project is created with Maven, so you just need to import it to your favorite IDE and build the project to resolve the dependencies.

## Usage 
Run the project using `mvn` command.
```
mvn spring-boot:run
```
Or use Docker to build or run the project
```
docker build -t springboot-todo . 
docker run --name springboot-todo -p 8080:8080 springboot-todo
```
Or run the project with your favorite IDE and go to [http://localhost:8080](http://localhost:8080)

## API Documentation
Check API documentation on my Postman [workspace](https://elements.getpostman.com/redirect?entityId=7580989-183374e9-16e1-4adf-b4ac-db9ab9597873&entityType=collection)

## Milestones
- [ ] Create the unit tests
- [ ] Connect to MySQL database
- [ ] Implement JWT authentication
- [ ] Develop the web UI