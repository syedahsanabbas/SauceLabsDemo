#Author:Syed Ahsan Abbas
#Date: 19-03-2023
#Website: https://www.saucedemo.com/
Feature: User Login Functionality

  Scenario Outline: Verify that user should login with valid credentials
    Given User is navigate to Login Page
    When User enters valid <username> and <password>
    And Clicks on Login button
    Then User should Login successfully

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |