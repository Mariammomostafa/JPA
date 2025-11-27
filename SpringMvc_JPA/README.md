# Spring MVC JPA project
- It's spring mvc maven project using JPA to apply Data base operations
- used java-based configurations to configure Dispatcher Servlet & it's configure class & all neccessary beans needed for JPA
- create ComboPooledDataSource bean for connection pool 
- create bean of LocalContainerEntityManagerFactoryBean to create EntityManagerFactory obj based on :
        - given Datasource , hibernate properties , package to scan Entities , JpaVendorAdaptor
-  create EntityManager obj from EntityManagerFactory obj
- use EntityManager obj to apply CRUD operations


### Prerequisites
- Java 17
- spring-webmvc 6.2.10
- spring-orm 6.2.9
- hibernate-core 7.1.0.Final
- jakarta.persistence-api 3.2.0
-c3p0 0.9.5.5
- mysql-connector-j 8.3.0
- jakarta.servlet.jsp.jstl 3.0.1
- jakarta.servlet.jsp.jstl-api 3.0.0
- IDE (Eclips)
