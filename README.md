# ELK-7.17.10
spring boot log is sent to the ELK 7.17.10 system.

# Here are 2 projects, one is a spring boot, and the other is ELK
- project
    - spring-boot folder
    - ELK folder
# Spring boot( Oracle 17.0.13 )
This project was downloaded from the Spring Boot home page, the settings is 
- project = Maven
- java
- spring boot = 3.3.5

And add some libraries to ensure using @Slf4j and @Log4j2.

# ELK
Using docker-compose to run this ELK system, must need to install the docker desktop in the Windows system.
