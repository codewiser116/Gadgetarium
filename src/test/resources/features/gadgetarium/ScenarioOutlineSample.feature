Feature: Print numbers from 1 to 5

  @scenarioOutlineTest
  Scenario: print numbers
    Given user logs in
    When user goes to home page
    Then print number 1
    Then print number 2
    Then print number 3
    Then print number 4
    Then print number 5

  @scenarioOutlineTest2
  Scenario: multiline parameters
    Given user logs in
    When user goes to home page
    Then print number <numberToPrint>
      | 1 |
      | 2 |
      | 3 |
      | 4 |
      | 5 |


    @userTest
  Scenario: verify different types of users can login thru main page
    Given user is on homepage
#    Then user logs in to system
#      | admin   |
#      | student |
#      | teacher |





