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
@tag
Feature: Find Greatest Cricketer
  To find greatest cricketer in ODI, Test and T20 formats

  
  @tag2
  Scenario Outline: Find Greatest Cricketer Scenario
    Given Format is "<Format>"
    When I want to know who is the greatest cricketer
    Then System or Application should answer me as "<Player>"

    Examples: 
      | Format  | Player |
      | Test |     Rahul Dravid | 
      | ODI |     Sachin Tendulkar | 
      | T20 |    Virat Kohli |
      
