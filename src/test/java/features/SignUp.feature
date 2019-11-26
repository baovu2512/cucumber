#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
Feature: Sign Up

  @tag1
  Scenario: Sign up valid
    Given I go to My Office
     When I click to Don't have an Account? button
     Then I see sign up screen display
     When I fill out account information 
      | username | password | email | 
      | baovu    | vubao    | baovu | 
      And I click Next step button
     Then I see Company Information screen display
     When I fill out company information
      | company | address      | phonenumb  | role     | 
      | vsii    | 15 pham hung | 0912345678 | Producer | 
      And I click Complete button
  	Then I see Successfully form display
     
  #Examples:
  #|avatar|username|password|email| 
  #|			 |			  |				 |											|
  #|			 |hoaipt  |12345678|hoaiphan0210@gmail.com|
  #|321   |        |12345678|    									|
  #|			 |				|12345678|hoaiphan0210@gmail.com|
  #|			 |hoa		  |12345678|hoaiphan0210@gmail.com|
  #|			 |hoaipt	|12345678|hoaiphan0210					|
  #|			 |hoa		  |12345678|hoaiphan0210@gmail.com|
  #|			 |hoaipt	|1234567 |hoaiphan0210@gmail.com|
#
  #Then I should see empty field highlighted <avatar> <username> <pass> <email>
#	|avatar|username|password|email| 
  #|			 | x |||
  #|321   |User    |12345678|    									|
  #|			 |				|12345678|hoaiphan0210@gmail.com|
  #|			 |hoa		  |12345678|hoaiphan0210@gmail.com|
  #|			 |hoaipt	|12345678|hoaiphan0210					|
  #|			 |hoa		  |12345678|hoaiphan0210@gmail.com|
  #|			 |hoaipt	|1234567 |hoaiphan0210@gmail.com|
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
