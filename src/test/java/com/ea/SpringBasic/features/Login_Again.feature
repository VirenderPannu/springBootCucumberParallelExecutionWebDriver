Feature: LoginFeature Again
  This feature deals with the login functionality of the application

        Scenario: Login with correct username and password 3
            Given I click login in Home Page
              And I enter the following for Login
                  | username | password  |
                  | admin    | password3 |
              And I click login button
             Then I should see the userform page
              And I click logout link


        Scenario: Login with correct username and password 4
            Given I click login in Home Page
              And I enter the following for Login
                  | username | password  |
                  | admin    | password4 |
              And I click login button
             Then I should see the userform page

