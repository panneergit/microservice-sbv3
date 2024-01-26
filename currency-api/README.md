# microservice-sbv3

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/#build-image)

## Currency Exchange Service ##

http://localhost:8081/exchange-service/exchange-controller/exchangeinfo/welcome

http://localhost:8081/exchange-service/exchange-controller/exchangeinfo/from/INR/to/USD


## Currency Conversion Service ##

http://localhost:8091/conversion-service/conversion-controller/conversioninfo/welcome

http://localhost:8091/conversion-service/conversion-controller/conversioninfo/from/INR/to/USD/quantity/555


## Eureka ##

http://localhost:8761/


## API Gateway Server ##

### Currency Exchange Service ###

http://localhost:8765/exchange-service/exchange-controller/exchangeinfo/welcome

http://localhost:8765/exchange-service/exchange-controller/exchangeinfo/from/INR/to/USD

### Currency Conversion Service ###

http://localhost:8765/conversion-service/conversion-controller/conversioninfo/welcome

http://localhost:8765/conversion-service/conversion-controller/conversioninfo/from/INR/to/USD/quantity/555

