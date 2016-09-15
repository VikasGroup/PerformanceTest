Feature: Page loard time test

@test
Scenario Outline: Time for page loard
Given User opens worldplan home "<page>" on browser
And Calculate the page load time
And User click on IR login button
And Calculate landing Page load time
And User click on Virtual office button
And Calculate the Login Page load time
When User enter "<userName>" and "<password>" and click on login
And User calculate load time for qnet ltd page after closing the popup
And User click on shop button 
Then User calculate the time for product page loading
And User create a report
And Check report
Examples:
   | page                   |  userName   |   password   |
   |http://www.qnet.net/	| HZ097243    |   testpw     |