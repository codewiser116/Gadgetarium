Feature: as a user, I want to search for products in search field

  Background:
    Given user is on "amazon.com"
    When user enters product "iphone"
    Then verify search results display "iphone"



  Scenario: verify user can search for an item


  Scenario: verify user can search for an item 2
    Given user is on "amazon.com"
    When user enters product "iphone"
      | iphone |
      | apple  |
      | flower |
    Then verify search results display "iphone"
    Then verify search results display "iphone"

  Scenario Outline:  verify user can search for an item 3
    Given user is on "amazon.com"
    When user enters product "<product>"
    Then verify search results display "<product>"
    And user adds "<quantity>" "<product>"
    Examples:
      | product | quantity |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | geg     | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
      | apple   | 12       |
      | iphone  | 3        |
      | bread   | 10       |
