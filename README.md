# Spring Boot 3 Mybatis Plus Demo

### How to Start

MySQL in Docker
```shell
docker run --name mybatis-demo -e MYSQL_ROOT_PASSWORD=yourpassword -p 3306:3306 --rm -d mysql:latest

```

Use Datagrip to create a schema called `mybatis-plus-demo`


Deploy this project on local using IntelliJ

Import postman collection on the root dir and you can perform CRUD function.