Feature: ToolsQA store demo feature

Scenario: My Account test
    Given I'm in the ToolsQA Home Page
     When I click on  "My Account" link
     Then I should see "Your Account" tittled form page

Scenario: Search Item
    Given I'm in the ToolsQA Home Page
     When I type in "Iphone" in the Search Box
      And I press Enter Key
     Then I Should see the result page

Scenario: Select item from results
    Given Im in the results page for "iphone"
     When I select "iPhone 5"
     Then I should see the "iPhone 5" product detail page

Scenario: Click Product category Item
    Given I'm in the ToolsQA Home Page
     When I hover on the Product category Button
     Then I should see a dropdown menu with the next categories
      |prod|
      |Accessories|
      |iMacs|
      |iPads|
      |iPhones|
      |iPods|
      |MacBooks|

