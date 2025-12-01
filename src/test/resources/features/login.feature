@smoke
Feature: Login

  Scenario: User is able to login with valid credentials
    Given the user goes to the login page
    When the user types "standard_user" username and "secret_sauce" password
    And the user clicks on the login button
    Then the user should be on the inventory page

  Scenario: Locked out user is not able to sign in with valid credentials
    Given the user goes to the login page
    When the user types "locked_out_user" username and "secret_sauce" password
    And the user clicks on the login button
    Then the user should be able to see "Epic sadface: Sorry, this user has been locked out." error message

