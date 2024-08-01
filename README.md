# Personal Knowledge Management for Maven

This project has all the examples related to maven. Please travel through the commit history to see the more simpler status of the project.

## Requirements
- JDK 21
- Maven 3.9.8

## JAR file

To create the JAR file
```shell
  mvn package
```

To execute the JAR file, find the compiled jar in the target folder and also provide the dependency in the classpath
```shell
  java -cp pkm-maven-1.0-SNAPSHOT.jar:${HOME}/.m2/repository/org/apache/commons/commons-lang3/3.15.0/commons-lang3-3.15.0.jar HelloWorld
```