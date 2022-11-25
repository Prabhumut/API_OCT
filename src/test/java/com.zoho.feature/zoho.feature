Feature: Signin In Zoho Application

Scenario: User Signin In Zoho Application
Given user Launch The Web Application
When user Click The Free Sign Up Button Navigate To Create Account Page

Scenario: user New Create Acount page
Given user Enter The Email Id In Email Id Field
When user Enter The Password In Password Field
And user Enter The Phone Number In Phone Number Field
And user Click The I Agree Button 
Then user Click The Sign Up Button