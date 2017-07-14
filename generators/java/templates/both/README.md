# <%= artifactId %>
## Description
Description <--

## Building and running
### Build
1. Navigate to the base folder
1. Execute `mvn clean install`

## Run
### Run Locally
1. Execute `mvn spring-boot:run`.

< Only if Flyway is activated > -----
## Flyway
### About
Flyway is a database migration tool similar to Liquibase. It is recommended by Spring Boot.
See the documentation [here](http://flywaydb.org/). The migrations scripts are in SQL directly. Make sure that your SQL
scripts run both on MySQL and H2. H2's syntax is pretty flexible and will handle most MySQL specific instructions.

The project is configured to run the migration scripts on start.

### Configuration
Flyway migration can be disabled completely by disabling `flyway.enabled`. On certain occasions, a SQL script might be
changed after being run. Flyway validates the checksum of each migration and will report error on startup. Enable `flyway.repair` to correct this situation.
---
## Additional resources
Link to Jira <--
