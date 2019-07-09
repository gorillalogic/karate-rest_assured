Feature: TODO API Verificator

Background:
    * url 'https://jsonplaceholder.typicode.com/todos/1'

Scenario: Verify First Todo title contains "delectus"
    Given request
    When method get
    Then status 200    
    And match response contains { title: "#regex ^(\\w+[delectus]).+"}
