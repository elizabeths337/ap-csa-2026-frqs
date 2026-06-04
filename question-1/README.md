# **Question 1**
## This question consists of two parts; part-1a and part-1b, separated in each file

## *Part 1-a*
* This method checks the availabilty of a username, and if the user requested username can be used.
* If a username is already taken, there will be modifications to the user (adding +1 to the end of the user) until a user is available.
* If the inital name entered is available, then no modifications will be done.
* The available user will be set to the private instance variable username of the Account class.
* **Nothing is returned.**

## *Part 1-b*
* This method returns removes hyphens from a username and the character before it.
* If the username begins/ends with a hyphen, contains consecutive hyphens(--) or is less than 2, the username is unchanged.
* When looping through the substring, if the current character is a hyphen, shorten the string to remove the last character.
* Else, add the substirng to the a new string.
* **Username is unchanged and a new string with the modified username is returned** 
