package com.tap-121.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap-121.pages.UploadNewCandidateProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class UploadNewCandidateProfile extends DriverFactory {
UploadNewCandidateProfilePage uploadNewCandidateProfilePage = new UploadNewCandidateProfilePage(driver);
@Given("the user is logged in as a recruiter")
public void the_user_is_logged_in_as_a_recruiter() {
uploadNewCandidateProfilePage.loginAsRecruiter();
}
@Given("the user is on the Profile section")
public void the_user_is_on_the_profile_section() {
uploadNewCandidateProfilePage.navigateToProfileSection();
}
@When("the user clicks on the upload (cloud) icon")
public void the_user_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the user browses and selects a valid candidate profile file {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file(String validCandidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(validCandidateProfileFile);
}
@When("the user clicks on the Upload button")
public void the_user_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the user waits for the upload process to complete")
public void the_user_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
}
@Then("the user should see a success confirmation message")
public void the_user_should_see_a_success_confirmation_message() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@Then("the uploaded profile should appear in the candidate list")
public void the_uploaded_profile_should_appear_in_the_candidate_list() {
uploadNewCandidateProfilePage.isProfileDisplayedInCandidateList();
}
@Then("the user should see a confirmation message for the {string} upload")
public void the_user_should_see_a_confirmation_message_for_the_upload(String candidateProfileFile) {
uploadNewCandidateProfilePage.isConfirmationMessageDisplayedForFile(candidateProfileFile);
}
@Then("the profile section is displayed")
public void the_profile_section_is_displayed() {
uploadNewCandidateProfilePage.isProfileSectionDisplayed();
}
@Then("the upload dialog opens")
public void the_upload_dialog_opens() {
uploadNewCandidateProfilePage.isUploadDialogOpen();
}
@Then("the selected long filename file is shown in the dialog")
public void the_selected_long_filename_file_is_shown_in_the_dialog() {
uploadNewCandidateProfilePage.isLongFilenameDisplayedInDialog();
}
@Then("the upload button is clickable")
public void the_upload_button_is_clickable() {
uploadNewCandidateProfilePage.isUploadButtonClickable();
}
@Then("the selected file {string} should be shown in the dialog")
public void the_selected_file_should_be_shown_in_the_dialog(String candidateProfileFile) {
uploadNewCandidateProfilePage.isFileDisplayedInDialog(candidateProfileFile);
}
@When("the user browses and selects a candidate profile file with spaces in the filename")
public void the_user_browses_and_selects_a_candidate_profile_file_with_spaces_in_the_filename() {
uploadNewCandidateProfilePage.selectCandidateProfileFile("John Doe Resume.pdf");
}
@When("the user browses and selects a candidate profile file with hyphens in the filename")
public void the_user_browses_and_selects_a_candidate_profile_file_with_hyphens_in_the_filename() {
uploadNewCandidateProfilePage.selectCandidateProfileFile("John-Doe-Resume.pdf");
}

@Given("the user browses selects a candidate profile file with a long filename")
public void the_user_browses_selects_a_candidate_profile_file_with_a_long_filename() {
uploadNewCandidateProfilePage.selectCandidateProfileFileWithLongFilename();
}
@Given("the user browses selects a valid candidate profile file in docx format")
public void the_user_browses_selects_a_valid_candidate_profile_file_in_docx_format() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileInDocx();
}
@Then("the upload dialog should open")
public void the_upload_dialog_should_open() {
uploadNewCandidateProfilePage.isUploadDialogOpen();
}
@When("the admin clicks on the upload (cloud) icon")
public void the_admin_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the user browses selects the candidate profile file {string}")
public void the_user_browses_selects_the_candidate_profile_file(String candidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidateProfileFile);
}
@When("the user waits for the upload to complete confirms success")
public void the_user_waits_for_the_upload_to_complete_confirms_success() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
uploadNewCandidateProfilePage.isUploadSuccessful();
}
@Then("both profiles should appear in the candidate list")
public void both_profiles_should_appear_in_the_candidate_list() {
uploadNewCandidateProfilePage.areBothProfilesDisplayed();
}
@Then("a success confirmation message is displayed")
public void a_success_confirmation_message_is_displayed() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@Given("the admin browses selects a candidate profile file with hyphens in the filename")
public void the_admin_browses_selects_a_candidate_profile_file_with_hyphens_in_the_filename() {
uploadNewCandidateProfilePage.selectCandidateProfileFileWithHyphens();
}
@When("the admin waits for the upload process to complete")
public void the_admin_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadProcessToComplete();
}
@Given("the user browses selects a valid candidate profile file")
public void the_user_browses_selects_a_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFile();
}
@When("the admin clicks on the upload button")
public void the_admin_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@Then("the uploaded profile appears in the candidate list")
public void the_uploaded_profile_appears_in_the_candidate_list() {
uploadNewCandidateProfilePage.isUploadedProfileDisplayed();
}
@Then("the upload button should be clickable")
public void the_upload_button_should_be_clickable() {
uploadNewCandidateProfilePage.isUploadButtonClickable();
}
@Given("the user browses selects a valid candidate profile file in pdf format")
public void the_user_browses_selects_a_valid_candidate_profile_file_in_pdf_format() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileInPdf();
}
@Then("the profile section should be displayed")
public void the_profile_section_should_be_displayed() {
uploadNewCandidateProfilePage.isProfileSectionDisplayed();
}
}