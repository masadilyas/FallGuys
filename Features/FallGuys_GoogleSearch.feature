@googlesearch @smoketest
Feature: google search

@googleSimpleSearch
Scenario Outline: simple search 

Given I am on the google homepage 
When I enter search "<terms>"
And I click on google search button
Then I receive related search results 

Examples:
|term								|
|Quality Assurance	|
|Software Testing		|