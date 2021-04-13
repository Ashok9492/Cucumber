Feature: Add to Cart

Scenario: Add to Cart

Given uSer on homepage
When user clicks on Women link
Then Women page should be displayed
Then user select blouse 
And user clicks on View larger and clicks close
Then user enter quantity
And selects size and colour
Then user clicks on Add to cart button
And user close the browser

