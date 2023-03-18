#Author:Syed Ahsan Abbas
#Date: 19-03-2023
#Website: https://www.saucedemo.com/

Feature: Login Functionality

  Scenario: Verify that user should login successfully with valid credentials
    Given User is navigate to Login Page
    When User enters valid username and password
    And Clicks on Login button
    Then User is login successfully
    