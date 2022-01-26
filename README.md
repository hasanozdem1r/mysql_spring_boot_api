
# Spring Boot Web Application

This project aiming to show how to configure Spring Boot MVC pattern with MySQL Server




## Installation


1. Open your terminal follow the commands
```bash
  git clone project_link
  cd project_link
```
2. To run the project you should have MySQL in your local system, if you do not have please follow the [link](https://www.mysql.com/) and install
   After you installed MySql on your computer you should firstly create a database.
```sql
  create database mysql_spring
```
3. Then in this given directory **src/main/java/resources/application.properties** update the *spring.datasource.url* ,
   *spring.datasource.username* and *spring.datasource.password*
   You do not need to update rest of part of the file.

```txt
  spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
  spring.datasource.name=your_username
  spring.datasource.password=your_password
```

**NOTE** : If there is any missing database [driver](https://www.jetbrains.com/help/idea/mysql.html) your [IDE](https://en.wikipedia.org/wiki/Integrated_development_environment) may alert you with red underline therefore before running project check it out all errors.

4. Open your terminal and run this commend to start your server.

```cmd
  mvnw spring-boot:run
```
## Tech Stack

**Language:** Java 17

**Server:** Tomcat

**Database Server:** MySQL

**Development Tools:** Intellij IDEA, MySQL Workbench, Postman


## Contributing

Contributions are always welcome!

See `contributing.md` for ways to get started.

Please adhere to this project's `code of conduct`.


## Support

For support, you can [buy me a coffee](https://www.buymeacoffee.com/hasanozdemir).


## Resources

- [Intellij Docs](https://www.jetbrains.com/)
- [Spring Boot Docs](https://spring.io/quickstart)
- [Stackoverflow](https://stackoverflow.com/)


## License

[Massachusetts Institute of Technology](https://choosealicense.com/licenses/mit/)

