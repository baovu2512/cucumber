@test
Feature: Usermanagement

  Scenario Outline: Log-in with SUP account
    Given I go into My Office page
    When I fill user name <username>
    And i fill pass word <password>
    Then I should see Usermanagement tab
    
    Examples:
    |username|password |
    |   		 |12345678 |
    |anpt 	 |12345678 |
    |daidh1  |12345678 |
    |daidh1  |				 |
    | 		   |         |
    |daidh1  |12345678 |
    |daidh1  |1234567  |
    
  	Scenario: Sign up
    Given I goto Usermanagement TAB
    When I click Create User button
    And I fill information for MOD user
    |user|pass|email|
    And i click Next
    Then i should see error message
    And I click to Create button
    Then I should see MOD user it is created