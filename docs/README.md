# Welcome to Karate vs Rest-Assured!
![Image](images/main.png)
Postman is dead, Long live [Insert your pick here]


## Motivation


Modern development stacks are becoming increasingly reliant on splitting Backend development from FrontEnd development, this paradigm brings several improvements to development teams:

- Improved speed to market
- Isolated points of failure
- Multi-front deliveries
- API based products

Those improvements need new ways to manage aspects of the development cycle, like Product creation, API Testing, Security, Deployments and so on.

In this article I want to talk about one of the most powerful techniques that modern teams are using, API Testing. 

Backend Teams are creating API's at a blazing pace today, QA Engineers rely on tools like Postman to verify complete product functionalities using API endpoints. This approach gives a lot of benefits:

- Faster results: Teams can have quick feedback of the API in a matter of minutes.
- Scalability: Faster feedback allows team to deploy faster
- Visual Interface: GUI to simplify test creation.
- Higher Coverage: API Tests are more stable than UI tests, and also are more real-life than unit tests, so having a strong API testing suite is highly recommended.

But this approach brings a big problem, test creation becomes a responsibility of QA engineers alone. teams lose the power of having developers creating tests that are close to the source, with all of the knowledge the developer has over the API Endpoint.

We will talk about how to give back power to developers to test their own Endpoints and will face two of the most interesting API Testing tools in the market: **Karate** and **Rest-Assured**

## The Candidates

 [REST-Assured](http://rest-assured.io/) is one of the most established API testing tools in the market. It has a powerful Java Based API that leverages **Hamcrest** as the matcher tool and a simple set of methods that allows method chaining and **Pseudo-Gherkin** Syntax.

[Karate](https://intuit.github.io/karate/) in the other hand is a Gherkin Based API testing tool, ideal for quick prototyping and simpler testing that can become as deep as you want, includes a simple quickstart mode, integrated dashboards and other goodies that are dragging attention from the Testing community.
 
## Let's get our hands dirty

The file explorer is accessible using the button in left corner of the navigation bar. You can create a new file by clicking the **New file** button in the file explorer. You can also create folders by clicking the **New folder** button.

## The results

All your files and folders are presented as a tree in the file explorer. You can switch from one to another by clicking a file in the tree.

## The recommendations

As we have seen both testing tools have their strengths and weaknesses, and each one can easily empower your team. I will try to give you some quick notes on each framework:

Use **Karate** when:

- You want a **quickstart** to do API Tests, without major hassle
- Your team doesn't have **Java background**, or want to work with **Gherkin**
- You have your Product Owners empowered in code and can write some tests in Gherkin
- You are comfy enough with the standard reports, and don't want to put time in enhanced reporting


Use **REST-Assured** when:

- Your team has a good **Java Expertise**
- You want to give more responsibility over test creation to developers (Improving the quality assistance methodology)
- You need/want to use improved matchers offered by **Hamcrest**
- Your API needs you to know intricate logic that is easier to write in Java

## The repo

All of the tests, and code examples can be found in this repo:

[Karate vs Rest-Assured](https://github.com/gorillalogic/karate-rest_assured)

The [Karate](https://github.com/gorillalogic/karate-rest_assured/tree/master/karate) Folder contains all of the feature files used during the example, and also the Karate.jar binary file for quickstart.

The [Rest-Assured](https://github.com/gorillalogic/karate-rest_assured/tree/master/rest-assured) folder contains a quick Maven project to start testing using Rest-Assured and also all of the examples we saw during this article.