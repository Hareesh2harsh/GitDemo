@Login
Feature: Login functionality

Background:
Given If user is on homepage

@Smoke
Scenario Outline: Verify user is able to login with valid credentials
When Click on login link
And  Enter username as "<Username>" and password as "<Password>"
Then Verify logout link
Examples:
      | Username | Password |
      |  demo    |  1234    |
      |  demm    |  1222    |
 
@Regression @Sanity     
Scenario: Verify user is able to generate qr code
When Click on login link
And Enter username as "demo" and password as "1234"
And Click on pay user
And Click on receive qr code
And Enter amount "143143"
And Click on generate qr button
Then verify QR code

@DB
Scenario: Verify database values
When Click on login link
And Enter username as "demo" and password as "1234"

#@Smoke @Sanity
#Scenario: Verify user is able to navigate contacts list
#Given If user is on homepage
#When Click on login link
#And Enter username as "demo" and password as "1234"
#And Click on contacts link
#Then Verify contacts list page