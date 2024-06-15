# player-ratings-icc
This Spring Boot-based RESTful API manages ICC T20 cricket player rankings, showcasing key Spring Boot concepts like dependency injection, annotations, CRUD operations, and H2 in-memory database interaction. Designed for BTech students, it aids in understanding the basics of building and testing a Spring Boot application.

## Getting Started

### Prerequisites

- Java 8 or later
- Maven
- IDE (IntelliJ IDEA, Eclipse, etc.)
- Postman (for API testing)

### Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/anilkumarbanti/spring-boot-crud-icc-t20.git
   cd spring-boot-crud-icc-t20
   
2. **Build the Project**
   ```bash
   mvn clean install

3. **Run the application**
   ```bash
   mvn spring-boot:run
## Usage

### API Endpoints

1. **Get All Players**
   - **Method:** GET
   - **URL:** `http://localhost:8080/players`
   - **Description:** Retrieves all players.

2. **Get Player by ID**
   - **Method:** GET
   - **URL:** `http://localhost:8080/players/{id}`
   - **Description:** Retrieves a player by ID.

3. **Create Players**
   - **Method:** POST
   - **URL:** `http://localhost:8080/players`
   - **Body Example:**
     ```json
     [
       {
         "name": "Virat Kohli",
         "ranking": 1
       },
       {
         "name": "Rohit Sharma",
         "ranking": 2
       }
     ]
     ```
   - **Description:** Creates new players.

4. **Update Players**
   - **Method:** PUT
   - **URL:** `http://localhost:8080/players`
   - **Body Example:**
     ```json
     [
       {
         "id": 1,
         "name": "Virat Kohli",
         "ranking": 2
       }
     ]
     ```
   - **Description:** Updates existing players.

5. **Delete Player**
   - **Method:** DELETE
   - **URL:** `http://localhost:8080/players/{id}`
   - **Description:** Deletes a player by ID.

### Testing with Postman

1. **Get All Players**
   - **Method:** GET
   - **URL:** `http://localhost:8080/players`
   - **Steps:**
     1. Open a new request tab in Postman.
     2. Select `GET` from the dropdown menu.
     3. Enter the URL `http://localhost:8080/players`.
     4. Click `Send`.
     5. View the list of players in the response.

2. **Get Player by ID**
   - **Method:** GET
   - **URL:** `http://localhost:8080/players/{id}`
   - **Steps:**
     1. Open a new request tab in Postman.
     2. Select `GET` from the dropdown menu.
     3. Enter the URL `http://localhost:8080/players/{id}`.
     4. Click `Send`.
     5. View the player details in the response.

3. **Create Players**
   - **Method:** POST
   - **URL:** `http://localhost:8080/players`
   - **Body:**
     ```json
     [
       {
         "name": "Virat Kohli",
         "ranking": 1
       },
       {
         "name": "Rohit Sharma",
         "ranking": 2
       }
     ]
     ```
   - **Steps:**
     1. Open a new request tab in Postman.
     2. Select `POST` from the dropdown menu.
     3. Enter the URL `http://localhost:8080/players`.
     4. Go to the `Body` tab and select `raw` and `JSON`.
     5. Enter the JSON body with the player details.
     6. Click `Send`.
     7. View the added players in the response.

4. **Update Players**
   - **Method:** PUT
   - **URL:** `http://localhost:8080/players`
   - **Body:**
     ```json
     [
       {
         "id": 1,
         "name": "Virat Kohli",
         "ranking": 2
       }
     ]
     ```
   - **Steps:**
     1. Open a new request tab in Postman.
     2. Select `PUT` from the dropdown menu.
     3. Enter the URL `http://localhost:8080/players`.
     4. Go to the `Body` tab and select `raw` and `JSON`.
     5. Enter the JSON body with the updated player details.
     6. Click `Send`.
     7. View the updated player details in the response.

5. **Delete Player**
   - **Method:** DELETE
   - **URL:** `http://localhost:8080/players/{id}`
   - **Steps:**
     1. Open a new request tab in Postman.
     2. Select `DELETE` from the dropdown menu.
     3. Enter the URL `http://localhost:8080/players/{id}`.
     4. Click `Send`.
     5. View the response indicating the player has been deleted.

### Viewing the Database

1. Ensure your Spring Boot application is running.
2. Open your browser and go to `http://localhost:8080/h2-console`.
3. Enter the JDBC URL, username, and password as mentioned in the `application.properties`:
   - **JDBC URL:** `jdbc:h2:mem:testdb`
   - **Username:** `sa`
   - **Password:** `password`
4. Click `Connect`.
5. Use SQL commands to view or manipulate data. For example:
   ```sql
   SELECT * FROM PLAYER;
