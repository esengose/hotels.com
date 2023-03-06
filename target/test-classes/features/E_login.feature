@login_to_website
Feature: login_to_website




  Scenario:valid_credential
    Given User goes to "https://www.hotels.com"
    When User enters correct credentials
    Then user should login successfully
    Then close driver

  Scenario: invalid_mail
    When user enters incorrect email
    Then error message should be displayed
    Then close driver

  Scenario: invalid_password
    When user enters incorrect password
    Then error message should be displayed
    Then close driver

  Scenario: existing_mail
    When user signs up with existing mail
    Then error message should be displayed
    Then close driver



