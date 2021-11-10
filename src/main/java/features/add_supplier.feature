Feature: Itau Test

Scenario: Add Supplier

Given that I have logged into the system
And click the accounts
And click the suppliers
And click the Add button
And fill out the form
When I click submit button
Then I must validate the email field is required