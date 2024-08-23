# Shipment Planning
Spring Boot Excel Processing Web Application

## Description
Takes orders and parameters as input return routes

## Table of Contents
- [Description](#description)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Parameters](#parameters)
- [Technologies](#technologies)
- [Contributing](#contributing)

[//]: # (- [License]&#40;#license&#41;)

## Features
- Upload Excel file
- Parameter input form
- Process data and generate output Excel file
- Download processed file

[//]: # (## Parameters)

[//]: # ()
[//]: # (### Compulsory)

[//]: # ()
[//]: # (- avgSpeed = 50; // mil/h &#40;miles per hour&#41;)

[//]: # (- distanceCost = 1.5; // $/mil &#40;dollar per mile&#41;)

[//]: # (- stopOffCharge = 5;)

[//]: # (- variableHandlingRate = 60186.1976; // lbs/hr &#40;pounds per hour&#41; [200 lbs/min])

[//]: # (- fixedHandlingTime = 15/60.0; // hr &#40;hour&#41;)

[//]: # (- variableHandlingRate = Double.POSITIVE_INFINITY; // lbs/hr &#40;pounds per hour&#41; [200 lbs/min])

[//]: # (- fixedHandlingTime = 0; // hr &#40;hour&#41;)

[//]: # (- maxNumberOfStops = 50; // [30])

[//]: # (- waitingTimeCost = 0.25;)

[//]: # ()
[//]: # (- avgSpeed in mil/h &#40;miles per hour&#41;)

[//]: # (- distanceCost in $/mil &#40;dollar per mile&#41;)

[//]: # (- stopOffCharge as an integer;)

[//]: # (- variableHandlingRate in lbs/hr &#40;pounds per hour&#41; [200 lbs/min])

[//]: # (- fixedHandlingTime in hr &#40;hour&#41;)

[//]: # (- maxNumberOfStops as a number)

[//]: # (- waitingTimeCost in $ &#40;dollars&#41;;)

## Installation

### Steps
1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/your-repo.git
    ```
2. Navigate to the project directory:
    ```bash
    cd your-repo
    ```
3. Build the project:
    ```bash
    mvn clean install
    ```
4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## Usage
1. Open your web browser and navigate to `http://localhost:8080`.
2. Upload your Excel file using the upload form.
3. Enter the required parameters.
4. Click the "Process" button.
5. Download the processed Excel file.

## Parameters
### Route
- `routeType` (pickThenDrop, default, firstInLastOut): Way to design route.
- `avgSpeed` (miles per hour): Average speed of the vehicle in miles per hour.
- `distanceCost` (dollars per mile): Cost incurred per mile traveled.
- `stopOffCharge` (integer): Additional charge for each intermediate stop-off point.
- `variableHandlingRate` (pounds per hour): Rate at which handling occurs.
- `fixedHandlingTime` (hours): Fixed time required for handling operations in hours.
- `maxNumberOfStops` (number): Maximum number of stops allowed.
- `waitingTimeCost` (dollars): Cost incurred for waiting time in dollars.

### Aggregation
- `enableAggregation` (true,false): Have to aggregate orders or not.
- `minTimeOverlap` (hours): Minimum time overlap allowed while aggregation.

### Particle Swarm Optimization
- `enablePSO` (true,false): Have to use PSO or not.
- `numParticles` (number): Number of particles.
- `maxIterations` (number): Maximum number of iterations for PSO.
- `inertiaWeight` (double): Inertia Weight.
- `cognitiveWeight` (double): Cognitive Weight.
- `socialWeight` (double): Social Weight.
- `locationMarginFactor` (double): Location margin factor for location plane.

## Example Usage with Parameters
1. Open your web browser and navigate to `http://localhost:8080`.
2. Upload your Excel file using the upload form.
3. Enter the required parameters:
   - `avgSpeed`: e.g., `50` (miles per hour)
   - `distanceCost`: e.g., `1.5` (dollars per mile)
   - `stopOffCharge`: e.g., `5` (integer)
   - `variableHandlingRate`: e.g., `61000` (pounds per hour)
   - `fixedHandlingTime`: e.g., `0.25` (hours)
   - `maxNumberOfStops`: e.g., `50` (number)
   - `waitingTimeCost`: e.g., `0.25` (dollars)
4. Click the "Process" button.
5. Download the processed Excel file.

## Technologies
- Spring Boot
- Maven
- Java
- Thymeleaf (or any other template engine you are using)
- Apache POI (for Excel processing)

## Contributing
Contributions are welcome! Please open an issue or submit a pull request.

### Steps to contribute:
1. Fork the repository.
2. Create a new branch:
    ```bash
    git checkout -b feature-branch
    ```
3. Make your changes.
4. Commit your changes:
    ```bash
    git commit -m "Description of changes"
    ```
5. Push to the branch:
    ```bash
    git push origin feature-branch
    ```
6. Open a pull request.

[//]: # (## License)

[//]: # (This project is licensed under the MIT License - see the [LICENSE]&#40;LICENSE&#41; file for details.)
