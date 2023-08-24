# Retail Store Discounts Application

Welcome to the Retail Store Discounts Application! This Spring Boot project calculates discounts for retail store customers based on various criteria. It provides RESTful APIs for calculating discount and returning net payable amounts.

## Getting Started

### Prerequisites

- Java JDK 17 or higher
- Maven
- Docker (for containerization, optional)

### Installation

Clone the repository:
   ```bash
   git clone https://github.com/IbrahimGhosheh/discounts.git
   cd discounts
   ```
### Build the Project Using Maven

To build the project using Maven, execute the following command:

```bash
mvn clean install
```
## Running the Application

You have two options for running the application:

1. **Locally using the Spring Boot Maven plugin:**

   ```bash
   mvn spring-boot:run
   ```
2. **Building a Docker container for the application:**

To build a Docker container for the application, follow these steps:

```bash
docker build -t discounts-app .
docker run -p 8080:8080 discounts-app
```
Once the container is running, the application will be available on http://localhost:8080.

## API Example

### Calculate Discount

Calculate discount based on user type (EMPLOYEE or CUSTOMER) and bill amount.

**Endpoint**: `POST /api/calculateDiscount`

**Request Body Example**:

```json
{
   "userType": "EMPLOYEE",
   "amount": 950
}
```

**Response Example**:

```json
{
   "netPayableAmount": 620.0,
   "discount": 330
}
```

## Running Tests

The application includes unit tests to ensure its functionality. To run the tests, use the following command:

```bash
mvn test
```

## Generating Coverage Reports

Code coverage reports provide insights into the portion of codebase covered by tests. You can generate coverage reports using the `jacoco` plugin. Run the following command:

```bash
mvn clean test jacoco:report
```
After running the command, you can find the HTML coverage report in the target/site/jacoco directory. Open the index.html file in a browser to view the detailed coverage statistics.

## Contributing

Contributions are welcome! If you find issues or have improvements to suggest, feel free to:

- Open an issue to report a problem or suggest an enhancement.
- Create a pull request to propose changes or additions to the codebase.

Your involvement is greatly appreciated!
