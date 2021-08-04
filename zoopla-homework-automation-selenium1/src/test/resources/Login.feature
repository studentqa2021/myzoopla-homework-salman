Feature: login function testing
Description: pass must be 6 characture
#Background:common steps
Scenario: As Automation user,i can Successfully login with valid credential

Given open browser and send URL
When lolgin with valid credentials
Then  Check login was success
