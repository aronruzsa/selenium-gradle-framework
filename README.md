# UI testing Framework Selenium-Gradle

This framework was created to practice framework building.

### What we use

- Java 21
- Gradle
- TestNG
- Cucumber
- Allure report

### Run pre-requisites

- Java installed, `JAVA_HOME` and path environment variables are set
- Following IntelliJ plugins installed: Cucumber for Java, Gherkin
- Lombok plugin comes bundled with IntelliJ, should be already installed

### How to run

The framework uses the Maven Failsafe plugin, so the command will be `./gradlew clean test`.

### Generate test report

Once the run has concluded, use `./gradlew allureServeLocal`.
