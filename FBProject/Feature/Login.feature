@Login
Feature: User should able to login successfully

Scenario: Login Function should work properly as per requirements
Given open the browser
And navigate to "https://www.facebook.com/"
And Go to Username/Email and Password in the upper right corner 
When enter username "munawarh969@gmail.com" and password "Munawar969"
And click sign in button
Then user should be landed in homepage