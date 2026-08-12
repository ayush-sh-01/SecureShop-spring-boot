# SecureShop — Role-Based Authentication & Product Management API

A Spring Boot REST API demonstrating session-based authentication and
role-based authorization (RBAC) using Spring Security, with a full
product management module built on top.

## 🚀 Features

- User registration & login with session-based authentication
- Password encryption using BCrypt
- Role-Based Access Control (USER / ADMIN)
- Full CRUD operations for product management
- Search, filtering, and pagination on product listings
- Centralized exception handling with structured error responses
- Request validation using Bean Validation (`@Valid`)
- API documentation via Swagger / OpenAPI
- Secure credential management via environment variables
- Containerized with Docker for cloud deployment

## 🛠️ Tech Stack

- **Backend:** Java 21, Spring Boot 3.2
- **Security:** Spring Security 6 (session-based auth)
- **Database:** MySQL, Spring Data JPA / Hibernate
- **Docs:** Springdoc OpenAPI (Swagger UI)
- **Deployment:** Docker, Render
- **Testing:** Postman

## 📋 API Endpoints

| Method | Endpoint | Access | Description |
|--------|----------|--------|-------------|
| POST | `/api/auth/register` | Public | Register a new user |
| POST | `/api/auth/login` | Public | Login and create a session |
| POST | `/api/auth/logout` | Authenticated | Logout and invalidate session |
| GET | `/api/products` | USER, ADMIN | View all products |
| GET | `/api/products/{id}` | USER, ADMIN | View a product by ID |
| GET | `/api/products/search` | USER, ADMIN | Search/filter products with pagination |
| POST | `/api/products` | ADMIN only | Add a new product |
| PUT | `/api/products/{id}` | ADMIN only | Update a product |
| DELETE | `/api/products/{id}` | ADMIN only | Delete a product |

## ⚙️ Setup Instructions

### Prerequisites

- Java 21
- MySQL
- Maven

### Steps

1. Clone the repository
   ```bash
   git clone https://github.com/ayush-sh-01/SecureShop.git
   ```

2. Create a MySQL database
   ```sql
   CREATE DATABASE secureshop_db;
   ```

3. Set the following environment variables
   ```
   DB_USERNAME=your_mysql_username
   DB_PASSWORD=your_mysql_password
   ```

4. Run the application
   ```bash
   mvn spring-boot:run
   ```

   The app starts on `http://localhost:8080`

5. Explore the API via Swagger UI
   ```
   http://localhost:8080/swagger-ui/index.html
   ```

## 🐳 Running with Docker

```bash
docker build -t secureshop .
docker run -p 8080:8080 -e DB_USERNAME=your_username -e DB_PASSWORD=your_password secureshop
```

## 🔒 Security Highlights

- Passwords are hashed using BCrypt and never stored in plain text
- Session-based authentication managed via `HttpSession`
- Role-based endpoint protection enforced at both the URL and method
  level using Spring Security
- Sensitive credentials are externalized via environment variables,
  never hardcoded in source

## 📸 Testing

The API was tested end-to-end with Postman, covering:

- Successful registration and login flows
- Unauthorized access attempts (`401 Unauthorized`)
- Forbidden role-based access attempts (`403 Forbidden`)
- Invalid request payloads (`400 Bad Request` with field-level
  validation errors)
- Non-existent resource lookups (`404 Not Found`)

## 🔮 Future Improvements

- Migrate to JWT-based stateless authentication
- Add unit and integration tests (JUnit, Mockito)
- Add refresh token support
- Rate limiting on authentication endpoints

## 👤 Author

**Ayush Sharma**
B.Tech CSE (AI & Data Science), SVVV Indore
[LinkedIn](https://www.linkedin.com/in/ayush-sharma-243826290) · [GitHub](https://github.com/ayush-sh-01)
