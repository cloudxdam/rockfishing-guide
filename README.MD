README.md
# RockFishing Guide API

RockFishing Guide API is a RESTful backend application built with **Spring Boot**.  
The goal of this project is to provide structured information for anglers practicing **rockfishing**, including fishing spots, species, lures, techniques and environmental conditions.

This API will serve as the backend for a future frontend application.

---

## Features

The API manages different fishing related resources:

- Fishing spots
- Fish species
- Lures
- Fishing techniques
- Meteorological conditions
- Catch records

The system is designed with a **relational domain model** to represent the relationships between species, spots, lures and techniques.

---

## Tech Stack

- **Java**
- **Spring Boot**
- **Spring Data JPA / Hibernate**
- **MySQL**
- **Maven**

---

## Project Structure


rockfishing-guide
│
├── api
│ ├── src/main/java/com/pachedev/rockfishingguide
│ │ ├── model
│ │ │ ├── entity
│ │ │ └── enums
│ │ └── RockfishingguideApplication.java
│ │
│ ├── src/main/resources
│ │ └── application.properties
│ │
│ └── pom.xml


---

## Domain Model

The core entities of the system include:

- **Spot** → Fishing locations
- **Species** → Fish species
- **Lure** → Artificial fishing lures
- **Technique** → Fishing techniques
- **MeteorologicalCondition** → Environmental conditions
- **CatchRecord** → Records of fish captures

Relationships between entities are modeled using **JPA annotations**.

---

## Future Improvements

Planned improvements for the project:

- REST controllers
- Service layer
- Repository layer
- DTOs and validation
- API documentation
- Frontend application
- Authentication

---

## Author

Daniel Pacheco
