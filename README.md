# Patient Service

Patient Service is a Spring Boot application designed to manage patient demographics and notification preferences. It provides basic CRUD operations and versioning capabilities to track changes made to patient records over time. The service interacts with a MySQL database to persist data.

## Technologies

- Java
- Spring Boot
- Maven
- MySQL (as the preferred RDBMS)

## Getting Started

## Database Configuration

Install MySQL and configure the connection settings in src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/patientdb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

## Running the Application

Run the Spring Boot application using Maven:

mvn spring-boot:run

Once the application starts successfully, you can test the APIs using http://localhost:8080.

## API Usage

- Create a Patient: POST /api/patients
- Update Patient Information: PUT /api/patients/{patientId}
- Get Patient Details: GET /api/patients/{patientId}
- List All Patients: GET /api/patients
- Search Patients: GET /api/patients/search?gender=male&firstname=John&ageFrom=20&ageTo=40

## Sample Use Cases

- Create a new patient and save notification preferences.
- Update patient details and access previous versions.
- Query patients using different search criteria.
