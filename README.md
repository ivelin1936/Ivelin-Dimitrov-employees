# Ivelin-Dimitrov-employees
Couple of employees who have worked together on common projects for the longest time

It's given a text file in format ```EmpID, ProjectID, DateFrom, DateTo```
Example data: 
   ```
      143, 12, 2013-11-01, 2014-01-05
      218, 10, 2012-05-16, NULL
      143, 10, 2009-01-01, 2011-04-27
      ...
   ```
   
* 1) To write an application that finds the couple of employees who have worked together on common projects for the longest time.
* 2) DateTo can accept value „NULL“ (this is equal to „today“).
* 3) The data can be passed to the program from a text file
* 4) The program have to be started without the need to do any code changes, after “checkout” on the code and import in IDE, the program        have to run and show the result in to the console
* 5) Comply with the “code convention”, depending on the programming language:
      a. Java - (http://www.oracle.com/technetwork/java/codeconvtoc-136057.html )
* 6) The solution to the problem to be put in github
      a. Repository Name to be „FirstName-LastName-employees (example: ivan-ivanov-employess)

# Assignment Guide

This is a small object-oriented project - console application. Reading data from text file ```employees.txt```, which is placed in resource package ```TeamLongestPeriod/src/resources/```. Calculates longest overlap and printing the team (couple of employees), which has longest total overlap on common projects for the longest time.

## Getting Started
### Application is supposed to be run using an IDE

* Clone repository: using client for the Git version control system. [TortoiseGit](https://tortoisegit.org/)
* Import project
* Use [JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)

#### Repository URL
```
https://github.com/ivelin1936/Ivelin-Dimitrov-employees.git
```

## Describe Functionality

The functionality of the software involves shopping in store system. The main logic cicling around the discount cards. As you see the cards are the main entities of the program. Every card has and initial discount rate, and keep information for it's owner's turnover for the previous month. On base of it's previous month turnover, the card discount rate change. With this information, pay-desk can calculate the discount of the current purchase and the total purchase value.
How it's work:
MarketStore class have main() method, with which we can run the console application. 
For every shopping tour, need to create a cart instance, in which we can collect all our wished stuffs for buying. 
Every stuff is an instance of the item's class. Item's class is just a date class, which keep the information about the items like a price and name.
To finish the purchase we need to have and discount card, for the demo, discount card accept from constructor a turnover value for the previous month.
In the end with pay desk we can finalize our purchase and get in back an invoice of the purchase when invoke pay() method. 
PayDesk has a private constructor (we can't instance it), because it work with a static method pay(), can be called without creating an object of class because it's associated to the class in which is reside not to the objects of that class.

## Technologies

* Java - [JDK11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)

## IDE 

* IntelliJ Idea Ultimate - [JetBrains](https://www.jetbrains.com/idea/)

## Version

1.0-SNAPSHOT

## Author

**Ivelin Dimitrov** 
* [GitHub](https://github.com/ivelin1936)
* [LinkedIn](https://www.linkedin.com/in/ivelin-dimitrov-42b13a151/)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
