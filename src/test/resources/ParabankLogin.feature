Feature: Parabank login testing
#Descriprion: User should already have an account in Parabank
#Background:
@smoke @regression @positive
Scenario Outline: As a user, I want to login to the Parabank site with valid credentials
Given Open the browser
And pass the Parabank URL "<URL>"
When Enter the username "<username>"
And Enter the password "<password>"
And Click on login button
Then Validate login is successful
Given Quit all browser

Examples: 
|URL                                                            | username   | password   |
|https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC | barsuchina | Barsuchina |
 
@regression @negative
Scenario Outline: As a user, I will see error message while trying to login only with username and no password
Given Open the browser
And pass the Parabank URL "<URL>"
When Enter the username "<username>"
And Click on login button
Then Validate error message is displayed
Given Quit all browser
Examples: 
|URL                                                            | username   | 
|https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC | barsuchina | 