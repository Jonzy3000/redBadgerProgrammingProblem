# redBadgerProgrammingProblem

This solution is written using Java8 and the project is managed using maven. Developed using intelliJ

### How To Run
1. Navigate to "redBadgerProgrammingProblem\src\main"
2. Run command `javac main/java/App.java`
3. Run command `java main.java.App main/resources/input1.txt`

   If you want to use a different inputs either edit this text file or change the argument

### Testing
There is a very basic test suite using JUNIT 1.5. You'll need to import the project into an IDE that supports maven projects and run the tests from there.
Or you can use the command line with maven `mvn clean test`


### Improvements and Issues
* The program does not try to verify the input is in the correct format, it just expects it to be that of the example in the coding challenge instructions. Anything else will break it
* The test suite is very minimal with only 2 inputs tested. There may be edge cases where this program will fail
* The tests could be refactored a little, especially the BlackBoxTests 


