# 📚 Jenkins Book App

A web application developed with Spring Boot and Maven, designed for managing books. It includes integration with Jenkins for automated build and deployment.

## 📁 Project Structure

- `.mvn/`: Maven Wrapper configuration.
- `.vscode/`: VS Code specific settings.
- `src/`: Main source code of the application.
- `pom.xml`: Maven configuration file.
- `Jenkinsfile`: Pipeline script for Jenkins.
- `mvnw` / `mvnw.cmd`: Maven Wrapper scripts for Unix and Windows environments.
- `HELP.md`: Help documentation for the project.

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

- [Java JDK 17](https://adoptium.net/)
- [Maven 3.8+](https://maven.apache.org/)
- [Jenkins](https://www.jenkins.io/) (optional, for CI/CD)

### Installation

1. Clone this repository:

   git clone https://github.com/XavierRomeuDev/jenkins_book-app.git

2. Navigate into the project directory:

  cd jenkins_book-app

3. Build and run the application:

  ./mvnw spring-boot:run

Or, if you are on Windows:

  mvnw.cmd spring-boot:run

4. Access the application in your browser:

  http://localhost:8080

### ⚙️ Jenkins Integration

This project includes a Jenkinsfile to automate the build and deployment process using Jenkins.

Steps to set up Jenkins:
- Ensure Jenkins is installed and running.
- Create a new pipeline job in Jenkins.
- Configure the job to use this GitHub repository as the source.
- Jenkins will automatically detect the Jenkinsfile and execute the defined stages.

### 🛠️ Features

- Book management: add, edit, delete, and view books.
- Web interface developed with Spring Boot.
- Automated build and deployment with Jenkins.

### 🤝 Contributing
Contributions are welcome! If you want to add features, fix bugs, or improve the project, please open an issue or submit a pull request.

### 📄 License
This project is licensed under the MIT license. See the LICENSE file for more information.





