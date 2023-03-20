#Author:Syed Ahsan Abbas
#Date: 19-03-2023
#Website: https://www.saucedemo.com/
Feature: Checkout Cart Functionality

  Scenario Outline: Verify that user should Checkout Cart successfully
    Given User is navigate to Login Page
    When User enters valid <username> and <password>
    And Clicks on Login button
    And Clicks Add to Cart on Sauce Labs Backpack
    And Open my Shopping Cart
    Then User should see the Sauce Labs Backpack in Shopping Cart and clicks continue for checkout
    And User should enter <firstname>, <lastname> and <postalcode>
    And Clicks Continue button
    And Clicks Finish button
    

    Examples: 
      | username      | password     | firstname | lastname | postalcode|
      | standard_user | secret_sauce | ahsan		 | abbas    | 75850  |
