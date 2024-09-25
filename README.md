# Weekly Fitness Tracker

## Introduction

For the IT4045 Final Project, our group has developed the Weekly-Fitness-Tracker application. This app is designed to help users monitor their physical activity and set weekly fitness goals, offering an intuitive way to track workouts and maintain a consistent exercise routine. The Weekly-Fitness-Tracker allows users to log their exercises, including workout type, duration, intensity, and calories burned, while setting personal goals on a weekly basis. It provides visual progress charts, helping users stay motivated and adjust their fitness routines as needed. The app also offers personalized fitness tips and reminders to help users stay on track with their weekly goals.
 
## Storyboard
[Storyboard link] (TASK)
 
## Requirements
 As a user, I want to be able to see information about my fitness progress so that I can compare my weekly activity and achievements to other participants and track how close I am to reaching my fitness goals or rewards 
 set by the app. 
 
 Example 1: View Weekly Fitness Statistics
<br>Given: A user has successfully logged workouts and fitness data for the current week.
<br>When: The user navigates to the "Weekly Progress" page.
<br>Then: The Weekly-Fitness-Tracker app will display the user's workout data (e.g., number of workouts, duration, calories burned) and compare it to the weekly goals set by the user.


 Example 2: View Reward Progress and Eligibility
<br>Given: The app tracks user progress towards various fitness rewards (e.g., completing a certain number of workouts, calories burned, steps taken).
<br>When: The user navigates to the "Rewards" page.
<br>Then: The app will display the user’s progress towards each reward, including a list of earned rewards and a progress bar or percentage for unachieved rewards.


 Example 3: Custom Regiment
<br>Given:Custom Regiment  
<br>When: Users inputs custom regiment 
<br>Then: App returns a table with the regiment


 Example 4: Handle No Data Logged
<br>Given: The user has not logged any fitness data or workouts for the current week.
<br>When: The user tries to view their weekly progress or leaderboard status.
<br>Then: The app will display a message stating "No data available. Please log your workouts to track progress," and no further data will be shown until valid data is logged.


 Example 5: Viewing Current Workout Regimen
<br>Given: The user has logged into the Weekly-Fitness-Tracker app and has a defined workout regimen.
<br>When: The user navigates to the "Current Workout Regimen" section of the app.
<br>Then: The app will display the user's current workout plan, including the types of exercises, scheduled days, durations, and any specific goals for each workout. The user should also see any notes or recommendations related to the workout regimen, such as suggested warm-up exercises or cooldown stretches.  
## Class Diagram
 ![Class Diagram] (TASK)
 
### Class Diagram Description
IFundraiserEntryService - Interface declaring all necessary methods for FundraiserEntry related functionality.
<br>FundraiserEntryService - Contains implementation for all mentods in IFundraiserEntryService
<br>FundraiserEntryServiceStub - Implements IFundraiserEntryService's methods with hardcoded return values for initial ui development
<br>FundraiserEntry - carries FundraiserEntry data between processes
<br>IFundraiserEntryDAO - Interface declaring the methods needed for FundraiserEntry's data access object
<br>FundraiserEntryDAO - Implements IFundraiserEntryDAO allowing access to FundraiserEntry records in the database
## JSON Schema
This is what we plan to export to another app.

>{
>    "fundraiser": {
>        "id": "123456",
>        "title": "Girl Scout Cookie Sale",
>        "username": "sampleusername",
>        "description": "Fundraiser description",
>        "imageURL": "Sample URL"
>    }}
 
## Roles
 
Devops/Product Owner/Scrum Master/GitHub Admin: Melanie Peck <br>
UI Specialist: Robert Ballou and Taka Kiuchi <br>
Business Logic / Persistence: Edward Barch and Fatuma Abdullahi

## Project Link
(Task)

<br><br>*As a group, we have decided to meet Wednesday at 7PM using teams.*
