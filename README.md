# skynews-rss-reader

About the SkyNewsSRSS Project
The SkyNewsSRSS project is a simple and practical system designed to read and process news from various RSS feeds, especially from Sky News. This project is developed using Spring Boot and is part of my internship work for the LIA (Learning in Work) course.

Technologies Used:
 Java 17

 Spring Boot 3

 RSS Feed Reader (ROME library)

 JSON Processing

Project Structure and Architecture:
The project follows a layered architecture, which includes:

Controller layer: Handles incoming requests and sends responses to clients.

Service layer: Contains the core business logic and processing.

Model layer (DTOs/Entities): Defines the data structures and objects used.

Configuration layer: Manages scheduled tasks and main project settings.

Automated Tasks:
Using Spring’s scheduling capabilities @Scheduled, the project automatically fetches and processes new news items from RSS feeds at defined time intervals.
