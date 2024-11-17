# Microservice

This repository contains basic implementations for creating and managing microservices.

- **SocialMediaApp** - RESTful services built using Spring Boot with integrated Swagger UI for API documentation.
- **limit-service** - A test microservice connected to a Spring Cloud Config Server.
- **Currency-Exchange-Service** - A microservice that provides currency exchange rates, invoked by the Currency Conversion Service. CircuitBreakerController uses Resilience4J for circuitBreaker framework and handles rate limiting and bulkhead.
- **Currency-Conversion-Service** - A microservice that invokes Currency Conversion Service.
- **naming-server** - Uses eureka naming server which handles load balancing
- **API-Gateway-Service** - Introduces api gateway that handles customize routing and logging.

Each service demonstrates essential microservice architecture principles and is designed for easy integration and scalability.

Each runs on different ports:
1. Limits Microservice 8080
2. Spring Cloud Config Server 8888
3. Currency Exchange Microservice 8000
4. Currency Conversion Microservice 8100
5. Netflix Eureka Naming Server 8761
6. API Gateway 8765
