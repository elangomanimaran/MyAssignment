Feature: create new sales account from the existing use
Scenario: login with the user account
Given Launch the browser
And  open the url
And  enter the user name
And  enter the password
And click login
And click on togglemenu
And click view all option
And click sales option
And click on accounts tab
And click on new account
And Enter account name
And select owenership as public
When click save button
Then verify account name
