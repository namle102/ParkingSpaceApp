# ParkingSpaceBookingApp
This is a Maven-based Java application for managing parking space bookings at York University.

## Project Structure
- src/main/java/       – Source code
- src/test/java/       – Manual test code
- randoop-tests        – Randoop auto-generated test code
- src/main/resources/  – CSV data files
- pom.xml              – Maven configuration

## How to Test
### Manual Tests (src/test/java)
```bash
mvn clean test -Dtest="**/yorku/eecs3311/**/*Test.java"
```

### Randoop Tests (randoop-tests)
```bash
mvn clean test -Dtest="**/yorku/eecs3311/randoop/*Test0.java"
```

## How to run PIT test
Follow the instructions from https://github.com/pitest/pitclipse
### Manual Tests (src/test/java) from Eclipse
1. Open the project in Eclipse.
2. Right click src/test/java → Run As → Run Configurations
3. Right click PIT Mutation Test → New Configuration
4. Select Run mutations against a package or directory
5. Change the directory to src/test/java
6. At the bottom in Preferences, change the Excluded classes field to yorku.eecs3311.model.*,yorku.eecs3311.controller.*, yorku.eecs3311.Database, yorku.eecs3311.Main,yorku.eecs3311.Subject, yorku.eecs3311.Subscriber, yorku.eecs3311.manager.ManagerCLI*
7. Click Run

### Randoop Tests (randoop-tests) from Eclipse
1. Open the project in Eclipse.
2. Right click src/test/java → Run As → Run Configurations
3. Right click PIT Mutation Test → New Configuration
4. Select Run mutations against a package or directory
5. Change the directory to randoop-tests
6. At the bottom in Preferences, change the Excluded classes field to yorku.eecs3311.model.*,yorku.eecs3311.controller.*, yorku.eecs3311.Database, yorku.eecs3311.Main,yorku.eecs3311.Subject, yorku.eecs3311.Subscriber, yorku.eecs3311.manager.ManagerCLI*
7. Click Run


## How to Run
*Make sure it can access the CSV files in src/main/resources.*
### Option 1: Run from Eclipse
1. Open the project in Eclipse.
2. Go to src/main/java/yorku/eecs3311/Main.java
3. Right-click Main.java → Run As → Java Application

### Option 2: Run from Terminal
1. Open a terminal in the project folder.
2. Build the project: mvn clean package
3. Run the app: java -jar target/ParkingSpaceBookingApp-0.0.1-SNAPSHOT.jar
