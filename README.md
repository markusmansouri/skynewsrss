# skynews-rss-reader

About the SkyNewsSRSS Project
The SkyNewsSRSS project is a simple and practical system designed to read and process news from various RSS feeds, especially from Sky News. This project is developed using Spring Boot and is part of my internship work for the LIA (Learning in Work) course.

Technologies Used:
Backend: Spring Boot (Java 17+)
 Frontend: React.js
 API Communication: Axios
📄 XML Parsing: DOM Parser (Java)
🔐 CORS enabled for seamless frontend-backend integration

# 📰 Sky News RSS Reader

This is a simple full-stack application that fetches headlines from the [Sky News RSS feed](https://feeds.skynews.com/feeds/rss/home.xml) and displays them in a user-friendly interface.

##  How to Run the Project

 Step 1: Run the Backend (Spring Boot)
 Run the Spring Boot Application
 If using a terminal
 
 ./mvnw spring-boot:run

> Make sure Java 17+ and Maven are installed on your system.

step 2. Clone or download the project:
   git clone https://github.com/YourUsername/skynews-rss-reader.git
   cd skynews-rss-reader/backend
Run the backend server using Maven:
./mvnw spring-boot:run
The backend will start on http://localhost:8080
Step 3: Run the Frontend (React)
Navigate to the frontend directory:
cd ../frontend
Install dependencies:
npm install
The app will be available at http://localhost:3000.
npm start
Step 4 . Start the frontend development server:
The app will be available at http://localhost:3000
Contributions
Pull requests, suggestions, and improvements are welcome! Feel free to fork the repo and submit your changes.
