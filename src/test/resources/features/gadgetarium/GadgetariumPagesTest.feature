Feature: user should be able to go to all Gadgetarium pages

  @verifyPageUrls
  Scenario Outline: when user navigates to a page in Gadgetarium, the url must change
    Given user is on "https://gadgetarium.us/" page
    When user clicks on "<pageName>" page
    Then verify the url is "<pageUrl>"
    Examples:
      | pageName    | pageUrl                         |
      | About Store | https://gadgetarium.us/about    |
      | Delivery    | https://gadgetarium.us/delivery |
      | FAQ         | https://gadgetarium.us/fag      |
      | Contacts    | https://gadgetarium.us/contacts |


    @printUrlTitle
  Scenario Outline: verify different websites urls and titles
    Given user is on "<url>" page
    Then print webpage title
    Then print webpage url
    Examples:
      | url                       |
      | https://www.google.com/   |
      | https://www.amazon.com/   |
      | https://www.ebay.com/     |
      | https://www.facebook.com/ |
