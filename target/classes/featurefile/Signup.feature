Feature: Signup to account
  
#Scenario Outline: Signup with examples key word
	#	Given user on homepage
   # When user clicks on login
   #Then user enters "<email>"
   #Then user clicks login button
   #And close the browser
   
   #Examples:
   #|      email    |
   #|Ashok@gmail.com|
   #|Ashokkkkkk@gmail.com|


Scenario Outline: Account Signup
   Given user on homepage
   When user clicks on login
   Then user enters "<email>"
   Then user clicks login button
   Then clicks on check box
   And user enters "<firstname>" "<Lastname>" "<password>" "<company>"
   Then  close the browser
   Examples:
   |    email       |firstname| Lastname  |password |company |
   | abd9492@gmail.com  |   ABd   |Devilliers | 12345   | puma   |
   |kohli222@gmail.com |   Kohli |  virat    | 12345   | adidas | 
   |Dwaynee@gmail.com| dwayne  | Johnon    | 12345   | Nike   | 
   
   

   
   
   
   
   
   
   
   
   
   
   
   
   