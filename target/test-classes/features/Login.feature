Feature: Application Login

Scenario: Login with valid credentials
Given Open any Browser
And Navigate to login page
When User enters username as "Badalsingh123456789@gmail.com" and password as "Mynextpc@07" into the fields
And User clicks on Login button
Then Verify user is able to successfully login