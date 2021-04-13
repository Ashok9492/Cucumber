Feature: Contact us

Scenario: Contact us page
	Given User on homepage
 When user clicks contact us button
 Then user select subject heading
 Then user enters email
 And user enters orderReference
 Then user clicks send button 
 Then  Close the browser