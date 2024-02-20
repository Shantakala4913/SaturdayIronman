@regression @api
Feature: Petstore API Testing

Scenario: Pet CRUD API
	
	Given Create pet
	When Update pet
	Then Get pet
	And Delete pet
	
# Scenario: User CRUD API
	
#	Given Create user
#	When Update user
#	Then Get user
#	And Delete user

# C = CREATE 		-> POST
# R = RETRIEVE	-> GET
# U = UPDATE		-> PUT
# D = DELETE		-> DELETE