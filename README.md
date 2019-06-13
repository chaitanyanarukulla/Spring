# Lab 11: Spring for Full-Stack Web Apps

## Description
- Create a new Spring application. Select Spring Web Starter and Spring Dev Tools as dependencies. This project is designed to create routes and test that functionality of those routes. 

## API
- ```/hello```
  - will print a hello message to the page
- ```/capitalize/parameter```
  - will capitalize whatever word you pass into the parameter
- ```/reverse```
  - will reverse the words in the sentence
  - in order to see this functionality, you must type ```localhost:8080/reverse?sentence=<put sentence here```>
-```/album/new```
  - will add Albums to the database
  - will redirect to album page


## Directions
- from IntelliJ
  - open application
  - run the App.java
- from Command Line
  - test
    - ```./gradlew test```
  - run
    - ```./gradlew runBoot```
    - proceeed in broswer to following routes
      - ```localhost:8080/hello```
      - ```localhost:8080/capitalize/<anyword you want>```
      - ```localhost:8080/reverse?sentence=<put sentence here>```
      - ```localhost:8080/reverseER?sentence=<put sentence here>```
      - ```localhost:8080/album/new```
