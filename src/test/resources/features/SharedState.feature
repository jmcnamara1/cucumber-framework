@test
Feature: Feature demonstrating shared state between step definition files

  Scenario: 1) Example scenario for sharing data between steps in different step def files
    Given I send a get request to postcode.io for the postcode "MK443NG"
    Then I check the response has the status code of 200


  Scenario: 2) Example scenario for sharing data between steps in different step def files
    Given I send a get request to postcode.io for the postcode "bob"
    Then I check the response has the status code of 404
