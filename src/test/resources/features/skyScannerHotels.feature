Feature: To validate flight functionality of skyscanner application

Scenario Outline: To validate hotels functionality of flights skyscanner application
Given The user should be skyscanners page
When The user has to click one Hotels button
And The user should be enter "<Hotels>" and
And The user should be provide checkin and checkout 
And The user has to click rooms and increase adult count
And The user has to click 4stars
Then The user has to search hotels

 Examples:
|Hotels|
|madurai|