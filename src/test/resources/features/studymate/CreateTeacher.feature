Feature: admin should be able to create a teacher

  Background:
    Given admin logs in to studymate with "admin@codewise.com" and "codewise123"


  @adminCourse
  Scenario: verify admin can create a course
    When admin goes to Courses page
    And admin creates a course
    Then verify the course is created

  @adminTeacher
  Scenario: verify admin can create a teacher
    When admin goes to Courses page
    And admin creates a course
    Then verify the course is created
    Then admin goes to Teachers page
    And creates a teacher
    Then verify the teacher is created

