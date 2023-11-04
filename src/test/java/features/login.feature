Feature: Login/Sign In

  @regression @smoke
  Scenario: User able to login with valid credentials
    Given I am at Raymour Homepage
    And I Dismiss the pop up page
    And I click on Account Dropdown Menu
    And I click on Sign In Button
    And I enter my valid email address
    And I enter my valid password
    When I click on Login Button
    Then I should be able to successfully login

   @regression
  Scenario: User should not be able to login with invalid email
    Given I am at Raymour Homepage
    And I Dismiss the pop up page
    And I click on Account Dropdown Menu
    And I click on Sign In Button
    And I enter my invalid email address
    And I enter my valid password
    When I click on Login Button
    Then I should not be able to successfully login

  @regression
  Scenario: User should not be able to login with invalid Password
    Given I am at Raymour Homepage
    And I Dismiss the pop up page
    And I click on Account Dropdown Menu
    And I click on Sign In Button
    And I enter my valid email address
    And I enter my invalid password
    When I click on Login Button
    Then I should not be able to successfully login

  @unit
  Scenario: User should not be able to login with invalid credentials
    Given I am at Raymour Homepage
    And I Dismiss the pop up page
    And I click on Account Dropdown Menu
    And I click on Sign In Button
    And I enter my invalid email address
    And I enter my invalid password
    When I click on Login Button
    Then I should not be able to successfully login