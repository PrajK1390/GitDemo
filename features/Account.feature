
Feature: Portal Login

Background:
Given Validate the browser
When Browser is triggered
Then Check if browser is started

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When user login into application with "Jin" and password "1234"
Then home page is populated
And cards displayed are "true"

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When user login into application with "John" and password "4321"
Then home page is populated
And cards displayed are "false"

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When user sign up with following details
| Jenny | abcd | john@gmail.com | Australia | 7381118982 |
Then home page is populated
And cards displayed are "false"

@PortalTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When user login in to application with <Username> and password <password>
Then home page is populated
And cards displayed are "true"

Examples: 
| Username | password |
| user1    | pass1    |
| user2    | pass2    |
| user3    | pass3    |

