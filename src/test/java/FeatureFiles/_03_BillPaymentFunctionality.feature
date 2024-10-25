Feature: : Bill Payment Functionality

  Background:
    Given The user navigates to the ParaBank website
    When  The user types username and password and clicks on the login button
    Then  The user should login successfully
    Given Navigate to Bill Pay

  Scenario Outline: Paying Bills
    When Send payee name as "<payeeName>" amount as "<amount>"
    When Send required fields and click send payment button
    Then User should be payed successfully
    And Navigate to Accounts Overview
    When Click the account number
    Then Check the payment information "<payeeName>" and "<amount>"
    Examples:
      | payeeName                  | amount |
      | Enerjisa Elektrik Faturası | 7      |
      | İski Su Faturası           | 10     |
      | İGDAŞ Doğalgaz Faturası    | 14     |