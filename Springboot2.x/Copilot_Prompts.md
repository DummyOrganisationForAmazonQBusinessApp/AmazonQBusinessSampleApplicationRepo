Springboot 2.x Prompts:

1. Creating new sample app for Springboot
    Prompt: @workspace /new create Springboot project with all the layers for managing Asset details by having functionality of fetching all assets, creating assets by ID(auto-generated), Name, Description, Location and Class, deleting asset and searching asset by either name, location or class

2. Adding dependency and plugin in POM.xml
    Prompt: Add dependency in pom.xml file related to Springboot, java, Spring Web, Spring Data JPA, PostgreSQL Driver
    File: pom.xml

    Prompt: Add plugin configuration for the Spring Boot Maven Plugin
    File: pom.xml

3. Properties and Configuration files
    Prompt: Configure application.properties file based on PostgreSQL
    File: application.properties

    Note: Developer need to manually configure Database connection settings, based on database name, username and password.

4. Entity class generation
    Prompt: Generate the Asset class is an entity model that maps to the 'asset' table in the database having fields as id, name, class, location and description where id will be auto generated and will be unique. Also, include getters and setters for each field
    File: Asset.java

5. Repository class generation
    Prompt: Create a Spring Data JPA repository interface named AssetRepository for the Asset entity. This repository should extend JpaRepository and include custom methods to search for assets by name, location, and class name. Use the @Query annotation to define custom queries for these methods. The queries should perform a case-insensitive search and match any part of the respective fields.
    File: AssetRepository.java


6. Controller class generation
    Prompt: Create a Spring Boot REST controller named AssetController for fetching assets, creating assets, deleting assets by id and searching assets by name, location or class and passing type and term in request params.
    File: AssetController.java


