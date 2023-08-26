@Contacts
Feature: Contacts functionality

@Smoke
Scenario: Verify user is able to navigate contacts list
Given If user is on homepage
When Click on login link
And Enter login details
And Click on contacts link
And Verify contacts list page
Then click on logout