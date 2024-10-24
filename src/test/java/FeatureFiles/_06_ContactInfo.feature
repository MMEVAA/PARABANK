Feature:

  @Contact @Accounts
  Scenario:Update contact info

    Given Navigate to Parabank
    When Enter username and password and click login button
    Then Click the find Update Contact Info button
    Then Enter new user information
    Then Click on the update profile button
    And  Profile update should be done successfully


