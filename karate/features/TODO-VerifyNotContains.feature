Feature: TODO API Verificator

Background:
    * url 'https://jsonplaceholder.typicode.com/todos/1'

Scenario: Verify First Todo does not contains author field
    Given request
    When method get
    Then status 200    
    And match response.author == '#notpresent'

Scenario: Verify First Todo title field does not contain lorem
    Given request
    When method get
    Then status 200    
    And match response contains { title: "#regex ^((?!lorem).)*$"}