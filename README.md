# liquibasewithjooqandpostgresql


This repo is for an example showing how to use liquibase, jooq, and with postgresql in docker

It will start the postgresql in docker container before the build process.
Liquibase will create DB and update it
Jooq will generate all the necessary classes from the table

Prequisites: 

Install Docker 

Gradle(Optional). You can use gradlewrapper


Run: ./gradlew -i clean build
