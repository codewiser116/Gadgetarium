Feature: admin should be able to create a teacher

  @adminCourse
  Scenario:
    Given admin logs in to studymate with "admin@codewise.com" and "codewise123"
    When admin goes to Courses page
    And admin creates a course
    Then verify the course is created