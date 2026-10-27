README.md
# RockFishing Guide API

RockFishing Guide API is a RESTful backend application built with **Spring Boot**.  
The goal of this project is to provide structured information for anglers practicing **rockfishing**, including fishing spots, species, lures, techniques and environmental conditions.

This API will serve as the backend for a future frontend application.

> Status: **Work in progress**. The current implementation focuses on the domain model and its entity relationships. The REST API and supporting application layers have not yet been implemented.

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

```text
rockfishing-guide
├── api
│   ├── pom.xml
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── pachedev
│   │   │   │           └── rockfishingguide
│   │   │   │               ├── RockfishingguideApplication.java
│   │   │   │               └── model
│   │   │   │                   ├── entity
│   │   │   │                   │   ├── CatchRecord.java
│   │   │   │                   │   ├── Equipment.java
│   │   │   │                   │   ├── Lure.java
│   │   │   │                   │   ├── MeteorologicalCondition.java
│   │   │   │                   │   ├── Species.java
│   │   │   │                   │   ├── SpeciesLure.java
│   │   │   │                   │   ├── Spot.java
│   │   │   │                   │   └── Technique.java
│   │   │   │                   └── enums
│   │   │   │                       ├── AccessDifficulty.java
│   │   │   │                       ├── FishingPressure.java
│   │   │   │                       ├── LureType.java
│   │   │   │                       ├── Season.java
│   │   │   │                       ├── SeaState.java
│   │   │   │                       ├── SkyCondition.java
│   │   │   │                       ├── TideStatus.java
│   │   │   │                       ├── TipType.java
│   │   │   │                       └── WindDirection.java
│   │   │   └── resources
│   │   │       └── application.properties
│   │   └── test
│   └── .mvn
└── README.md
```
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
