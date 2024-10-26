Feature: Inter Account Functionality

  Background:
    Given Navigate to ParaBank
    When  The user types username and password and clicks on the login button
    Then  The user should login successfully


  Scenario: Create a Transfer Funds
    When Create a Transfer Funds
    Then selects a sender and receiver account. in the amount field enters the amount and clicks the button
    And Success message should be displayed
    And Navigate to Accounts Overview
    And The user clicks on the recipient account number. list the transfer date and the amount of money received in the account. credit verifies
