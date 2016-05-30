Feature: ToolsQA store demo feature

@login @regression @smoke
Scenario: My Account test
    Given I'm in the ToolsQA Home Page
     When I click on  "My Account" link
     Then I should see "Your Account" tittled form page

@search @regression @smoke
Scenario: Search Item
    Given I'm in the ToolsQA Home Page
     When I type in "Iphone" in the Search Box
      And I press Enter Key
     Then I Should see the result page

@filter @regression
Scenario: Select item from results
    Given Im in the results page for "iphone"
     When I select "iPhone 5"
     Then I should see the "iPhone 5" product detail page

@filter @regression @DataDriven
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

@regression @wip
Scenario: Add to Cart
    Given I'm in the ToolsQA Home Page
     When I click on "Buy Now" link
      And I click on "Add to Cart" link
     Then I Should see "You just added "iPod Nano Blue" to your cart." message PopUp
      And I should Click on "Go to Checkout" button

@regression @wip
Scenario: Checkout Shopping Cart
    Given I'm in the ToolsQA Home Page
     When I click on "Shopping Kart" link
     Then I Should see checkout page
      And shop resume with Sub-Total