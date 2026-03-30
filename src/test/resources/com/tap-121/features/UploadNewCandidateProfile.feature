
@feature_upload_new_candidate_profile
Feature: UploadNewCandidateProfile

  Background: 
    Given the user is logged in as a recruiter
    And the user is on the Profile section

  @successful_upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid candidate profile file
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user should see a success confirmation message
    And the uploaded profile should appear in the candidate list

  Examples:
    | valid_candidate_profile_file |
    | valid_candidate_profile.pdf   |
    | valid_candidate_profile.docx  |

@valid-upload-first-profile
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload (cloud) icon
  And the user browses and selects the <candidate_profile_file>
  And the user clicks on the Upload button
  And the user waits for the upload to complete and confirms success
  Then the user should see a confirmation message for the <candidate_profile_file> upload

Examples:
  | candidate_profile_file               |
  | first valid candidate profile file    |
  | second valid candidate profile file   |

Then both profiles should appear in the candidate list

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid candidate profile file in PDF format
    And the user clicks on the Upload button
    Then a success confirmation message is displayed
    And the uploaded profile appears in the candidate list

  Examples:
    | file_format |
    | PDF         |

  @valid-long-filename
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file with a long filename
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the profile section is displayed
    And the upload dialog opens
    And the selected long filename file is shown in the dialog
    And the upload button is clickable
    And a success confirmation message is displayed
    And the uploaded profile appears in the candidate list

    Examples:
      | long_filename                                           |
      | This_is_a_very_long_filename_for_a_candidate_profile_document.pdf |

  @successful_upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid candidate profile file in DOCX format
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed
    And the uploaded profile appears in the candidate list

  Examples:
    | valid_candidate_profile_file |
    | candidate_profile.docx       |

  @upload_candidate_profile
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file with spaces in the filename
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user should see a success confirmation message
    And the uploaded profile should appear in the candidate list

  Examples:
    | filename                     |
    | John Doe Resume.pdf         |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects the candidate profile file "<candidate_profile_file>"
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the profile section should be displayed
    And the upload dialog should open
    And the selected file "<candidate_profile_file>" should be shown in the dialog
    And the upload button should be clickable
    And a success confirmation message should be displayed
    And the uploaded profile should appear in the candidate list

    Examples:
      | candidate_profile_file       |
      | John_Doe_Resume.pdf         |

  @upload-profile-with-hyphens
  Scenario Outline: Upload New Candidate Profile
    When the admin clicks on the upload (cloud) icon
    And the admin browses and selects a candidate profile file with hyphens in the filename
    And the admin clicks on the Upload button
    And the admin waits for the upload process to complete
    Then the uploaded profile appears in the candidate list

  Examples:
    | filename                     |
    | John-Doe-Resume.pdf         |
