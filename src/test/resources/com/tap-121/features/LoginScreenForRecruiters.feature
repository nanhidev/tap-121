
Feature: LoginScreenForRecruiters @feature_user_login

Background: 
  Given the recruiter is on the Login Screen

@valid-recruiter-login
Scenario Outline: Login Screen for Recruiters
  When I enter a valid email ID "<email>" in the Email ID field
  And I enter a valid password "<password>" in the Password field
  And I click on the 'Show Password' option
  And I click the Login button
  Then the recruiter should be redirected to the dashboard
  And the dashboard should load successfully without errors

Examples:
  | email                | password          |
  | recruiter@example.com | SecurePassword123 |

@valid-email-empty-password
Scenario Outline: Login Screen for Recruiters
  When the user enters a valid email ID in the Email ID field
  And the user leaves the Password field empty
  Then the Login button should be disabled
  When the user enters a valid password in the Password field
  Then the Login button should be enabled

  Examples:
    | email              | password      |
    | krishna@gmail.com  | password123   |

@toggle_password_visibility
Scenario Outline: Verify 'Show/Hide Password' functionality
  When I enter <password> in the Password field
  And I click on the 'Show Password' option
  Then the password should be visible
  And I click on the 'Hide Password' option
  Then the password should be hidden

Examples:
  | password      |
  | P@ssw0rd123   |

  @feature_user_login
  @valid-login
  Scenario Outline: Login Screen for Recruiters
    When the user enters "<email>" in the Email ID field
    And the user enters "<password>" in the Password field
    And the user checks the 'Remember Me' option
    And the user clicks the Login button
    Then the user should be redirected to the dashboard
    And the user closes the browser and reopens it
    And the user navigates back to the application
    Then the user should be automatically logged in upon returning to the application

    Examples:
      | email               | password           |
      | krishna@gmail.com   | ValidPassword123   |

  @valid-login
  Scenario Outline: Login Screen for Recruiters
    When I enter "<email>" in the Email ID field
    And I enter "<password>" in the Password field
    And I click the Login button
    Then the user should be redirected to the dashboard
    And the dashboard loads successfully without errors

    Examples:
      | email               | password         |
      | RECRUITER@MAIL.COM | correct_password  |
      | recruiter@mail.com  | correct_password  |

  @valid_login_special_characters
  Scenario Outline: Login Screen for Recruiters
    When I enter "<email>" in the Email ID field
    And I enter "<password>" in the Password field
    And I click the Login button
    Then the user should be redirected to the dashboard
    And the dashboard should load successfully without errors

    Examples:
      | email                     | password     |
      | krishna+test@gmail.com    | password123  |

  @feature_user_login
  @valid_login
  Scenario Outline: Login Screen for Recruiters
    When I enter "<email>" in the Email ID field
    And I enter "<password>" in the Password field
    And I click the Login button
    Then the user should be redirected to the dashboard
    And the dashboard should load successfully without errors

    Examples:
      | email                   | password     |
      | recruiter@example.com   | P@ssw0rd!    |

@valid_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard
  And the dashboard loads successfully without errors

Examples:
  | email                   | password      |
  | krishna123@gmail.com    | Password@123  |

@valid_recruiter_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard
  And the dashboard loads successfully without errors

Examples:
  | email                     | password     |
  | krishna.smith@gmail.com   | Password123  |
