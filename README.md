# 325 Spring Assignment

This is a simple application designed to let a user manage their personal collection or library of physical books. Users will have one or more library which will each contain zero or more books.

Users can add books to a library and associate certain data about each book. Eventually it will support moving between libraries (eg a flatting student with some books still at the family home) and lending books out to people and keeping track of who has what.

## Setup

### Database Setup

* Install MySQL:      http://dev.mysql.com/downloads/windows/installer/
* Configure it while keeping the default port of 3306
* Create a new schema called "spring_database"
* Import db/database_schema.sql and run it to create the tables

### Code Setup

* First time:         mvn install
* Run:                mvn jetty:run
* Go to:              _http://localhost:8080/_

==========================================

MySQL tips:

1. When creating a new table, the column flags mean:

PK - Primary Key

NN - Not Null 

BIN - Binary

UN - Unsigned

UQ - Create/remove Unique Key

ZF - Zero-Filled

AI - Auto Incremenent
