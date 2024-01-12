@adminTests
Feature: as an admin, I should be able to create a student

  @adminTest1
  Scenario: verify admin can create one student
    Given admin is logged in to the system
    When admin goes to students page
    Then admin clicks on create new student button
    And admin creates a student
    Then verify student is created

  @adminTest1
  Scenario: verify admin can create one student
    Given admin enters username
    Then admin enters password
    Then admin clicks on login
    And admin goes to students page
    Then admin clicks on create new student button
    And admin sends this data
      |  |  |  |  |  |  |
    And admin click on create student
    #Then verify student is created



   @adminTest2
  Scenario: verify admin can create multiple students
    Given admin is logged in to the system
    When admin goes to students page
    And admin clicks on create new student button
    And admin creates 5 students
    Then verify 5 students are created







