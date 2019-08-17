Feature: searches
  @smoke
  Scenario: search for product
    Given user is on home page
    When user search for product " "
    Then user can able to see respective products