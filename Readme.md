# Getting Started


### Understanding a spring boot project structure -

- `.idea` (folder) - contains a bunch of config files used by IntelliJ.
- `.mvn` (folder) - part of maven wrapper, which is a way to run maven without requiring it to be installed globally onto your machine. 
- `mvnw` (wrapper, shell script) - for mac / Linux machines.
- `mvnw.cmd` (wrapper, shell script) - for Windows machines.
- `HELP.md` - simple Markdown file.
- `pom.xml` (file) - Project-Object-Model, heart of maven project.
- `applications.properties` (file) - has one or more key-value pairs, we can specify server ports, database settings here.

In `src` (folder) - you have 
- `main` (folder) - 
    - In main you have -
        - `java` (folder) -
            - `com.your-package-name` - base package. 
                - `ProjectApplication` (file) - entry point of project.
        - `resources` (folder) - for static files, imgs etc. 
            - `application.properties` (file)
- `test` (folder) - testing purpose

### **Bean** - regular java object that is managed by spring (IoC container).

### **IOC container [ Inversion of Control ]** - 
- `ApplicationContext` is an implementation of IOC container.
- [ scans and stores all available beans in your package.]
- [ also manage whole life cycle of a available beans ]
- [ We can say IOC === ApplicationContext ]

### **ORM [ Object Relational Mapping ]** -
- is a technique used to map java objects to database tables.
- Ex. consider a Java class `User` and Database table `users`. 
- ORM frameworks like Hibernate can `map` the fields in the `User` class to columns in the `users` table,  
  Making it easier to insert, update, retrieve and delete records. 

### **JPA [ Java Persistence API ]** -
- A way or set of rules to achieve ORM. 
- It includes `interfaces` and `annotations` that you use in java classes.
- It requires `persistence providers (ORM tools)` for implementation. 

- To use JPA you need persistence providers, like `Hibernate`, `EclipseLInk`, `OpenJPA`.
 
- These providers implement JPA interfaces and provide underlying functionalities to interact with databases.

- JPA is primarily designed for working with `Relational-Databases`, where data is stored in tables.

- `MongoDB` on the other hand, is a `NoSQL` database that uses a different model, typically schema-less, hence `JPA is not used with MongoDB database`.   

- So to use MongoDB database with spring framework, spring provides `Spring-Data-MongoDB` that serves as a persistence providers for MongoDB,

- Basically for the MongoDB database you will use `Spring-Data-MongoDB` instead of JPA.

- Dependency for spring data MongoDB is `spring-boot-starter-data-mongodb`
  
- **Query Method DSL** and **Criteria API** are two different ways to interact with Spring-Data-JPA and Spring-Data-MongoDB.
 
### **Spring Data JPA** -
- Spring Data JPA is built on top of JPA.
- It's not a JPA implementation, instead It provides a higher level of abstraction and utilities.
- To use spring data jpa you still need jpa implementations such as Hibernate, EclipseLink, OpenJPA to handle actual database interactions.

### **Annotations** -

`@SpringBootApplication`   
- Equivalent to  -
    - `@ComponentScan` [scans whole package to mark as beans]  
    - `@Configuration`  
    - `@EnableAutoConfiguration`   

[ There is no difference between `@Component` and `@Service` annotations, both create beans, but you use it for more readability ].  

`@Component` - [ This tells spring to manage the object of class (marked as bean).]  
  - Advance version -
    - `@RestController` [ `@Component` + more ]
      - `@RequestMapping`
        - `@GetMapping`
          - `@PathVariable`
        - `@PostMapping`
          - `@RequestBody`
        - `@DeleteMapping`
          - `@PathVariable`
        - `@PutMapping`
          - `@PathVariable`
          - `@RequestBody`  

`@Bean` - applies only on functions/methods.   
`@Service` - classes that contain business logic. 
`@Repository` - classes that interact with databases [ Interfaces (models) ].  
`@Controller` - marking classes as controllers, for handling web requests [ end points ].  
`@Autowire` - [ Dependency Injection ]  
`@Document`  

`@RequestBody` [ ex- api/d/edit?tab=t.0 ]  
`@PathVariable` [ ex- api/document ]  

`@RequestParam`  
`@RequestHeader`  


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.3/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.3/maven-plugin/build-image.html)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

