Feature: select product from the price list category

  @smoke
  Scenario: selecte price category from filter to see all products within this range
    Given customer is on result page
    When customer select price range from filter
    Then customer can see all products within that price range