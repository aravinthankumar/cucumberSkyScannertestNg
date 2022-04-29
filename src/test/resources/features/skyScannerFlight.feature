Feature: To validate flight functionality of skyscanner application

Scenario Outline: To validate flights functionality of flights skyscanner application
Given The user should be skyscanner page
When The user has to click one way button
And The user should be enter "<From>" and "<To>"
And The user should be provide depart and return
And The user has to click cabin class and increase adult count
Then The user has to click  direct flight only


 Examples:
|From|To|
|chennai|madirai|