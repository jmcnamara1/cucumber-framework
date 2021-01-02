@exampleTest
Feature: A an example feature file

  Scenario: An example scenario
    Given I send a send get request to "http://www.google.com"
    Then I validate the response code is 200