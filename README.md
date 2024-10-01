# Selenium Automation Framework with Java, Maven, and TestNG

This project is a Selenium-based test automation framework that uses Java, Maven, and TestNG. It is designed to automate
web application testing, allowing for fast, scalable, and repeatable testing workflows.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Setup](#setup)
- [Execution](#execution)
- [Reporting](#reporting)

---

## Prerequisites

Ensure that the following are installed on your system:

- **Java Development Kit (JDK 8 or higher)**
    - Download and install from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
    - Verify installation:
      ```bash
      java -version
      ```
- **Apache Maven**
    - Download and install Maven from [here](https://maven.apache.org/install.html).
    - Verify installation:
      ```bash
      mvn -version
      ```
- **Google Chrome Browser**
    - Download and install from [here](https://www.google.com/chrome/).

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Brandon-Chawane/Bitcube-Assessment.git

## Setup

1.TestNG Configuration:

TestNG is used to run the test cases. Make sure that the testng.xml file is correctly configured to point to your test
classes.
If necessary, modify the testng.xml file located in the root directory to include tests

``` xml
<suite name="Suite">
  <test name="TestName">
    <classes>
       <class name="Test.TC001">
                <methods>
                    <include name="titleValidationTest"/>
                    <include name="privacyURLTest"/>
                    <include name="termsURLTest"/>
                </methods>
            </class>
    </classes>
  </test>
</suite>
```

## Execution

### Running Tests

You can run the tests via Maven or through your IDE.

1. Using Maven:
   To execute the tests from the terminal, use:

``` bash
mvn clean test
```

2. Using TestNG Plugin in IDE:
   If you're using IntelliJ IDEA or Eclipse, you can directly run the tests from the testng.xml file but navigating to
   the top of the page and run as "current file".

3. Navigate to the top of any page, in the run/debug configuration drop down menu, select Maven Bitcube-Assessment and
   click run



## Reporting

After test execution, TestNG will generate reports in the test-output directory. You can view the report by opening reports/report.html in a browser.
This is Extent Reports.