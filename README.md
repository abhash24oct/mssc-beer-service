[![Build Status](https://travis-ci.com/abhash24oct/mssc-beer-service.svg?branch=master)](https://travis-ci.com/abhash24oct/mssc-beer-service)
[![Code Coverage](https://codecov.io/github/joaomlneto/travis-ci-tutorial-java/coverage.svg)](https://codecov.io/gh/joaomlneto/travis-ci-tutorial-java)

# Beer Microservice
SFG Beer Works - Beer Microservice


## New things used

### CommandLineRunner
Spring Boot provides two interfaces, `CommandLineRunner` and `ApplicationRunner`, to run specific pieces of code when an application is fully started. 
These interfaces get called just before `run()` once SpringApplication completes.
We used CommandLineRunner to load the beer initialy

### PagingAndSortingRepository
Extension of ` CrudRepository` to provide additional methods to retrieve entities using the pagination and
 sorting abstraction.

 ### @ControllerAdvice
` @ControllerAdvice` is used when we have to define a genric class for exception handling


