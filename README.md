w# Beer Microservice
SFG Beer Works - Beer Microservice


## New things used

### CommandLineRunner
Spring Boot provides two interfaces, `CommandLineRunner` and `ApplicationRunner`, to run specific pieces of code when an application is fully started. 
These interfaces get called just before `run()` once SpringApplication completes.
We used CommandLineRunner to load the beer initialy

### PagingAndSortingRepository
Extension of ` CrudRepository` to provide additional methods to retrieve entities using the pagination and
 sorting abstraction.

 
