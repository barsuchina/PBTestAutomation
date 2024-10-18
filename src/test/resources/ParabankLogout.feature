Feature: Logout Parabank test
#Descriprion: User should already have an account in Parabank
Background: User dhoul be logged in
Scenario: As a user, I want to logout from the Parabank site with valid credentials
Given Open the browser
And pass the Parabank URL
|https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC|
When Enter the username
|barsuchina|
And Enter the password
|Barsuchina|
And Click on login button
And Click on Logout button
Then Validate logout is successful
Given Quit all browser
