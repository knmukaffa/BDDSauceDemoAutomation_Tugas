@Checkout
Feature: End to End Checkout
  As a User I Want to Checkout Product from SauceDemo Website

  Scenario: End to End Checkout
    Given User already on website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on sales page
    When User sort product by "Name (Z to A)"
    Then User add item to cart
    Then User click cart button
    Then User already on cart page
    Then User remove item Test.allTheThings
    Then User click checkout button
    And User already on checkout information page
    When User input "khairun" as firstName and input "khairun" as lastName and input "11111" as zipCode
    Then User already on checkout overview page
    And User already check the total price
    Then User finish checkout
    And User complete Order