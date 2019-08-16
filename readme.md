
# API-Test-Investment-Simulator

This project consists of demonstrating API testing for Banco Sicredi in the investment simulation application.
This project includes a project format for API testing with the RestAssured framework.

### Description

The tests were all done using the GET method, believing that the API is mocked, since we have no positive responses to the other request methods.

### Project

Here's a look at what the project contains:

```
.
└── src
   └── main
       └── java
           ├── core
           │   └── BaseTest.java
           ├── project_constants
           │   └── Constants.java
           │── suite
           │   └── TestNG.xml
           │── test
           │   └── SimuladorTest.java
           └── util
               ├── ExtentManager.java
               ├── ExtentTestManager.java
               └── TestListener.java
```

We'll break it down below.

#### core.BasePage

The **BaseTest** instantiates **RestAssured** and performs all initial configuration before test classes run.

#### project_constants.Constants

All static and fixed project data are in this package.

#### suite.TestNG

From the project directory, **maven** performs the tests indicated in this suite.

#### test.*

This package is the key, where all the tests to be performed are described.

#### util.*

The classes in this package are dedicated to test report generation.
