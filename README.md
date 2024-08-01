# Personal Knowledge Management for Maven

This project has all the examples related to maven. Please travel through the commit history to see the more simpler status of the project.

## Requirements
- JDK 21
- Maven 3.9.8

## Commands

To create the executable JAR file
```shell
  mvn package
```

Since this is the thin JAR, so dependency is not included in the packages JAR but only added as a classpath. Java expects this dependency on the root where JAR file is executed.
To execute the JAR file, find the packaged jar in the target folder and also move the external commons-lang3 JAR dependency in the target location manually.
```shell
  java -jar ${JAR_FILE}
```

To generate the site (complete information about your project)
```shell
 mvn site
```

To generate POJO from JSON schema via plugin
```shell
  mvn clean jsonschema2pojo:generate 
```