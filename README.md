
# Spring Boot Web Application

This project aiming to show how to configure Spring Boot MVC pattern with MySQL Server




## Installation

Install my-project with npm

Open your terminal and follow the steps
```bash
  git clone project_link
  cd project_link
```
To run the project you should have MySQL in your local system, if you do not have please follow the [link](https://www.mysql.com/) and install
After you installed MySql on your computer you should firstly create a database.
```sql
  create database mysql_spring
```
Then in this given directory **src/main/java/resources/application.properties** update the *spring.datasource.url* ,
*spring.datasource.username* and *spring.datasource.password*
You do not need to update rest of part of the file.

```txt
  spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
  spring.datasource.name=your_username
  spring.datasource.password=your_password
```

NOTE : If there is any missing database driver your [IDE](https://en.wikipedia.org/wiki/Integrated_development_environment) may alert you with red underline therefore before running project check it out all errors.

Open your terminal and run this commend to start your server.

```cmd
  mvnw spring-boot:run
```
## Contributing

Contributions are always welcome!

See `contributing.md` for ways to get started.

Please adhere to this project's `code of conduct`.


## Acknowledgements

- [Intellij Docs](https://www.jetbrains.com/)
- [Spring Boot Docs](https://spring.io/quickstart)
- [Stackoverflow](https://stackoverflow.com/)


## License

[MIT](https://choosealicense.com/licenses/mit/)

