Feature:JBK Offline application
@pawan
Scenario Outline: login test

Given user should be on login page
When user enters valid credentials "<uname>" and "<pass>"
Then user should be on home page

Examples:
| uname | pass |
|kiran@gmail.com|123456|
|pawan@gmail.com|654321|
|   |    |
|@#$%#!|*&^%$|

Scenario: logo test
Given user should be on login page
Then user should see JBK logo