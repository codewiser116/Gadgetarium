@test1
Feature: Online Movie Ticket Booking

  As a user
  I want to book movie tickets online
  So that I can easily secure seats for my desired movie show

  Background:
    Given the user is logged in to the movie booking website

  Scenario: Book a ticket for a specific movie
    Given there are "<tickets>" tickets available for the movie "<movieTitle>"
    When the user tries to book "<numberOfTickets>" tickets for the movie "<movieTitle>"
    Then the booking should be "<outcome>"

  Scenario: Booking tickets for a movie at a specific time
    Given "<movieTitle>" has a show at "<showTime>"
    When the user books a ticket for "<movieTitle>" at "<showTime>"
    And selects "<seatType>" seating
    Then the total price should be "<price>"

  Scenario Outline: Canceling a movie ticket
    Given the user has booked tickets for "<movieTitle>"
    When the user cancels the booking within the cancellation period
    Then the user should receive a "<refund>" refund

    Examples:
      | movieTitle          | showTime  | seatType  | price | tickets | numberOfTickets | outcome      | refund |
      | The Martian         | 20:00     | Standard  | $15   | 50      | 2               | successful   | full   |
      | Inception           | 18:00     | Premium   | $25   | 0       | 1               | unsuccessful | none   |
      | Interstellar        | 21:00     | VIP       | $30   | 30      | 5               | successful   | half   |
      | The Grand Budapest  | 19:00     | Standard  | $12   | 20      | 3               | successful   | none   |
