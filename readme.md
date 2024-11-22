🛠️ Mock Framework for REST APIs

A simple and extensible mock framework built with Spring Boot to handle various HTTP methods and provide a consistent response for testing and development purposes.

🚀 Features
Comprehensive HTTP Method Support: Supports GET, POST, PUT, DELETE, PATCH, OPTIONS, HEAD, TRACE, and CONNECT.


Standardized Responses: Consistently returns {"serviceWorking": "ok"} for all methods.


Easy Setup: Start the framework with minimal configuration.


Customizable: Quickly extend and modify responses or add new endpoints.

📂 Repository
Clone this project and get started:
🔗 Mock Framework Repository

📦 Installation

Prerequisites


Java 17+

Maven 3.6+

Optional: An IDE like IntelliJ IDEA or Eclipse
Steps to Install and Run

Clone the repository:

git clone https://github.com/PurnimaSharmaSDET/mockFramework.git

cd mockFramework

Build the project:


mvn clean install

Run the application:

mvn spring-boot:run

Access the application at: http://localhost:8080
🌐 API Endpoints
Available Methods
HTTP Method	Endpoint	Sample Response

GET	/api/demo	{"serviceWorking": "ok"}

POST	/api/demo	{"serviceWorking": "ok"}

PUT	/api/demo	{"serviceWorking": "ok"}

DELETE	/api/demo	{"serviceWorking": "ok"}

PATCH	/api/demo	{"serviceWorking": "ok"}

OPTIONS	/api/demo	{"serviceWorking": "ok"}

HEAD	/api/demo	(Empty response, 200 OK)

TRACE	/api/demo	{"serviceWorking": "ok"}

CONNECT	/api/demo	{"serviceWorking": "ok"}

Example JSON Response


{
"serviceWorking": "ok"
}

🧪 Quick Test

Test with cURL:

GET Request:

Open the DemoController class located in the project.

Modify the responses for specific HTTP methods. For example:


@GetMapping

public ResponseEntity<Map<String, String>> handleGet() {
Map<String, String> response = new HashMap<>();
response.put("serviceWorking", "custom response");
return new ResponseEntity<>(response, HttpStatus.OK);
}

Restart the application to apply changes.
❓ Troubleshooting
Common Issues

Port Already in Use:
Update the port in src/main/resources/application.properties:

properties

server.port=8081
Missing Dependencies: Ensure the following Maven dependency is in your pom.xml:

<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
</dependency>



🤝 Contributing

Contributions are always welcome!

Fork the repository.

Create your feature branch (git checkout -b feature/AmazingFeature).

Commit your changes (git commit -m 'Add some AmazingFeature').

Push to the branch (git push origin feature/AmazingFeature).

Open a pull request.

📬 Contact

For support, questions, or feedback:

Author: Purnima Sharma
Email: sharma0purnima@gmail.com
GitHub: PurnimaSharmaSDET

Feel free to replace the placeholders like your.email@example.com with real contact information. This README.md is clean, visually structured, and informative for users.






