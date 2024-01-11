@smm
Feature: User should be able to go to Gadgetarium social media
  pages by clicking on social media buttons on main page

  Background:
    Given user is on "https://gadgetarium.us/" page


  @facebook
  Scenario: verify user is able to go to facebook page
    When user clicks on facebook button
    Then verify the url is "https://www.facebook.com/"


  @instagram
  Scenario: verify user is able to go to instagram page
    When user clicks on instagram button
    Then verify the url is "https://www.instagram.com/peaksoft.house/"

