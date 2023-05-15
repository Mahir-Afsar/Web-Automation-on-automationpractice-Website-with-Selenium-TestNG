# Web Automation on Automationpractice Website with Selenium TestNG

## What is Automation?

Automation is the process of using software tools and scripts to perform tasks that would typically be done manually by a human. In the context of software testing, automation involves using tools to execute test cases and compare the actual results with the expected results automatically.

## Why we use Selenium TestNG for Automation?

Selenium is a popular open-source testing tool widely used for automating web browsers. It allows developers and testers to automate web-based applications' testing across multiple browsers and platforms. Selenium provides a set of APIs to interact with web elements and manipulate their properties and behaviors, making it an ideal tool for automating UI tests.

TestNG is a testing framework for Java that is designed to be more flexible and powerful than JUnit. It supports a wide range of testing functionalities, including unit, integration, and end-to-end testing, as well as parallel execution, data-driven testing, and reporting. TestNG is often used with Selenium to create robust and scalable test automation frameworks.

## Technology used:
- Selenium Webdriver
- TestNG Framework
- Java
- Eclipse
- Allure
- Maven
- Page object Model (POM)

## Pre-requisite:
- Java Development Kit (JDK): Install the latest version of JDK on your machine.
- Maven: Download and install Maven on your machine. Make sure you have set the PATH environment variable to point to the Maven installation directory.
- TestNG: TestNG is a testing framework that can be used with Selenium to perform automated tests. You can either download TestNG from the official website or add it  as a dependency in your Maven project.
- Selenium WebDriver: WebDriver is a library used to automate web browser interactions. Add the WebDriver as a dependency in your Maven project.
- IDE: An Integrated Development Environment (IDE) is a software application that provides comprehensive facilities to computer programmers for software development. You can use any of the popular IDEs such as Eclipse, IntelliJ IDEA, or NetBeans

## How to run this project

- Clone this project
- Run as TestNG suite from testng.xml file
- For generating Allure Report:
  Go to project file and Run this command: ```allure serve```

## Scenerio:

- Go to the URl: http://automationpractice.pl/index.php
- Create two new accounts
- Login with the any of the new account
- Go to the Evening Dresses section and hover on any product
- Go to the Summer Dresses > Filter the list with white color > Add a dress from the filter list to the Cart
- Now checkout and select the payment process ‘Payment by check’ and confirm the order
- Sign out from the account
- Run the above cycle for another user

## Allure Report:



