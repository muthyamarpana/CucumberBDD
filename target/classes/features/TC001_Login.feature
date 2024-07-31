Feature: Login Action
Scenario: Verify Login for Valid data and check Login Successful
Given user is on home page
When user clicks on Signin link
Then next page is displayed check title
When user enters valid username valid password
And click on Submit button
Then check user account display a message as login successful
And logout 