Feature:Register Functionality


  @Smoke @Regression @Accounts
  Scenario: Registering and logging in to the site

    Given Navigate to Parabank
    When Click on the register button
    Then Fill in login information
    And User should login successfully


