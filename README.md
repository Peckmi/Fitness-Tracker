Introduction
For the IT4045 Final Project, our group decided to make a fundraiser manager. The fundraiser manager allows organizers to set up an online space for their fundraiser. This allows any participants the ability to see information about a fundraiser, compare how much they have sold compared to other participants, and see if / how many rewards they qualify for from the organizers. Organizers are able to edit information about their fundraiser, establish rewards / reward tiers, and edit members and member information.

Storyboard
Storyboard link

Requirements
As a user, I want to be able to see information about a fundraiser so that I can compare how much they have sold compared to other participants and see if / how many rewards they qualify for from the organizers.

Example 1
Given: A feed of fundraiser data are available
When: The user searches for a particular fundraiser (recognizable name)
Then: The fundraiser app will return any results and save in view list

Example 2
Given: Fundraiser data available
When: The user searches for “aaofdnoas” (not recognizable text)
Then: The fundraiser app will not return any results and not save in view list

Example 3
Given: The fundraiser app saved user’s searched fundraiser
When: The User clicks and views the fundraiser
Then: The user will see how much they have sold compared to other participants

Example 4
Given: The fundraiser app saved user’s searched fundraiser
When: The User clicks and views the fundraiser
Then: The user will see how many rewards they qualify for from the organizers

Example 5
Given: The user has previous fundraisers in the view list
When: Some of the previous fundraisers have expired
Then: The user can select expired fundraiser and click delete button to remove from the view list.

Class Diagram
Class Diagram

Class Diagram Description
IFundraiserEntryService - Interface declaring all necessary methods for FundraiserEntry related functionality.
FundraiserEntryService - Contains implementation for all mentods in IFundraiserEntryService
FundraiserEntryServiceStub - Implements IFundraiserEntryService's methods with hardcoded return values for initial ui development
FundraiserEntry - carries FundraiserEntry data between processes
IFundraiserEntryDAO - Interface declaring the methods needed for FundraiserEntry's data access object
FundraiserEntryDAO - Implements IFundraiserEntryDAO allowing access to FundraiserEntry records in the database

JSON Schema
This is what we plan to export to another app.

{ "fundraiser": { "id": "123456", "title": "Girl Scout Cookie Sale", "username": "sampleusername", "description": "Fundraiser description", "imageURL": "Sample URL" }}

Roles
Devops/Product Owner/Scrum Master/GitHub Admin: Jacob Gormly
UI Specialist: Rahul Shakya and Binod Dahl
Business Logic / Persistence: Amin Vedant and Juan Lopez Rosado

Project Link
https://github.com/gormlyja/FundraiserManager/projects/1
