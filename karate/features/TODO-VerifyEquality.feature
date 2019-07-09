Feature: TODO API Verificator

Background:
    * url 'https://jsonplaceholder.typicode.com/todos/1'

Scenario: Verify First Todo is equals to "delectus aut autem"
    Given request
    When method get
    Then status 200    
    And match response == { userId: 1, id: 1, title: "delectus aut autem", completed: false }

Scenario: Verify First Todo is equals to the sum of its parts
    Given request
    When method get
    Then status 200    
    And match response.userId == 1
    And match response.id == 1
    And match response.title == "delectus aut autem"
    And match response.completed == false

