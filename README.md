# 325 Spring Assignment

This is a simple application designed to let a user manage their personal collection or library of physical books. Users will have one or more library which will each contain zero or more books.

Users can add books to a library and associate certain data about each book. Eventually it will support moving between libraries (eg a flatting student with some books still at the family home) and lending books out to people and keeping track of who has what.

## Setup

### Database Setup

Note: Hibernate will actually auto generate all required tables. We just need to ensure that the schema exists before we run it.

* Install MySQL:      http://dev.mysql.com/downloads/windows/installer/
* Ensure db is running and on port 3306
* Set user=admin and password=password
* Create a schema called "spring-library-service" and leave it blank

### Code Setup

* First time:         mvn install
* Run:                mvn jetty:run
* Go to:              _http://localhost:8080/_

