# Writing a README sample

**Version 1.0.0**

Code and document samples for the writing a README test 

----

## Contributors

- Sebastian Tasi <tasi.sebastian@gmail.com>

---

## License & copyright

© Sebastian Tasi, London 



*Project Title 
Software QA Engineer Coding Challenge - TRowePrice Cucumber - v1

*Installation guide:* 
This is a maven project. so It's assumed that the host running this code have Java and maven installed and already set. 
Here is the guide for maven installation just in case : https://maven.apache.org/install.html

Project get all dependencies from maven repository. So no additional installation needed.

*Below are the dependencies are being used for this project 

Cucumber-Junit,
Cucumber-java,
ApachePOI,
RestAssured,
TestNG,
Selenium,
Bonigarcia Webdriver 

*Credentials  
TRowePrice Cucumber use public key and private key to authorize the request. to externalize the data a configuration reader utility are created to read configuration.properties. 
Due to sensitive nature of the keys , user is expected to provide his/her own key while running the tests. 

*Build and run your project 
This is maven project and tests are written in Cucumber Gherkin language . so we use maven command line commands to run the project as below to pick up tests:  
mvn clean test

Framework can be built with using TestNg or Junit  but preferred to use Cucumber BDD.
It is created basic Page Object Model design pattern but it can improve if needed.
