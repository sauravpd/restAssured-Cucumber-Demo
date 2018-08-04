Feature: Get book by ISBN 
Scenario: User calls web service to get a book by its ISBN number 
	Given a book exists with an isbn of "9781400069286" 
	When a user retrieves the book by isbn number 
	Then the status code is "200" 
	And response includes the following details 
		| items.volumeInfo.title 					| The Power of Habit	|
		| items.volumeInfo.authors				    | Charles Duhigg	|   