@test
Feature: A an example feature file - sending calls to https://api.postcodes.io/postcodes


  Scenario: Get information on multiple postcodes
    Given I send a post request to postcode.io to search for the following postcodes
      | OX49 5NU |
      | M32 0JG  |
      | NE30 1DP |
    Then I validate the postcode api response code is 200

  Scenario Outline: Get information on individual postcodes
    Given I send a get request to postcode.io for the postcode "<postCode>"
    Then I validate the postcode api response code is 200
    And I check the field "country" has the correct value of "England"
    And I check the field "region" has the correct value of "<region>"

    Examples:
      | postCode | region          |
      | MK454AE  | East of England |
      | B147AN   | West Midlands   |
      | EX230LT  | South West      |
