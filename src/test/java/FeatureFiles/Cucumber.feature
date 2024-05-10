
Feature: web application Login

  # Background is used to run the pre-requisits steps required for below scenarios this works with in the file
#Background:
#Given user need to login the page
#When enter username and password
#Then user entered the website

  
@SmokeTest  
Scenario: Adimi login
    
 Given user is on NetBanking landing page
 When user login into application with username "sai" and password "1234"
 Then home page is displayed
 Then cards are displayed


#Parameterisation to iterate multiple times
@RegressionTest
Scenario Outline: User login
  
 Given user is on NetBanking landing page
 When user login into application with username <Username> and password <Password>
 Then home page is displayed
 Then cards are displayed
  
Examples:
 |Username  | Password  |
 | Sai      |  1234     |
 | NS       |  1987     | 
 
 
 # Multiple data can be passed using below way
 @SmokeTest @RegresionTest
Scenario: Admin user login

  Given User is on login page
  When Enter user details
  |Naga  |
  |Sai   |
  |Sai@gmail.com|
  |9876543321| 
  Then home page is displayed
   
  
  
  