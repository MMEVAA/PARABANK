Feature: Account Creation Functionality

  Background:
    Given Navigate to ParaBank
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Case 1: Checking Account
    When Open New Account from the website menu Clicks on the Account link in LefNav
    Then The user can select the account type as Current Checking from the drop-down menu. chooses. in Dialog
    And The user must have a minimum balance Min. Balance in the new bank account.receives a warning that it must be found mesage
    And The user selects the account to which they will transfer the minimum balance from the drop-down menu. in Dialog
    And The user clicks on the Open New Account button. in Dialog
    And The user confirms that the new bank account has been created successfully. verifies and sees the account number.

  Scenario: Case 2: Checking Account
    When Open New Account from the website menu Clicks on the Account link in LefNav
    Then The user can select the account type as Current Savings from the drop-down menu. chooses. in Dialog
    And The user must have a minimum balance Min. Balance in the new bank account.receives a warning that it must be found mesage
    And The user selects the account to which they will transfer the minimum balance from the drop-down menu. in Dialog
    And The user clicks on the Open New Account button. in Dialog
    And The user confirms that the new bank account has been created successfully. verifies and sees the account number.


