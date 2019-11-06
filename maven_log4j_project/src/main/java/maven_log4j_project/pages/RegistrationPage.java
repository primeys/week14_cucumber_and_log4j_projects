package maven_log4j_project.pages;

import maven_log4j_project.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Util {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    By genderFieldMale = By.id("gender-male");
    By getGenderFieldFemale = By.id("gender-female");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By dayOfBirthField = By.name("DateOfBirthDay");
    By monthOfBirthField = By.name("DateOfBirthMonth");
    By yearOfBirthYear = By.name("DateOfBirthYear");
    By emailField = By.id("Email");
    By companyNameField = By.id("Company");
    By newsLetterTick = By.id("Newsletter");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerBtn = By.id("register-button");
    By registerPageText = By.xpath("//strong[contains(text(),'Your Personal Details')]");


    public void clickOnMale (){
        log.info("click on male gender Radio button");
        clickOnElement(genderFieldMale);
    }
    public void clickOnGender(String gender) {
        if (gender.equalsIgnoreCase("male")) {
            log.info("Click on male");
            clickOnElement(genderFieldMale);
        } else if (gender.equalsIgnoreCase("female")) {
            log.info("Click on female");
            clickOnElement(getGenderFieldFemale);
        }
    }

    public void enterFirstName(String firstName) {
        log.info("Enter first name");
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        log.info("Enter last name");
        sendTextToElement(lastNameField, lastName);
    }

    public void enterDayOfBirth(String day) {
        log.info("Select date of birth");
        sendTextToElement(dayOfBirthField,day );
    }

    public void enterMonthOfBirth(String month) {
        log.info("Select month of birth ");
        sendTextToElement(monthOfBirthField, month);
    }

    public void enterYearOfBirth(String year) {
        log.info("Select year of birth");
        sendTextToElement(yearOfBirthYear, year);
    }

    public void enterEmailAddress(String email) {
        log.info("Enter email address");
        sendTextToElement(emailField, email);
    }

    public void enterCompanyName(String companyName) {
        log.info("Enter company name");
        sendTextToElement(companyNameField, companyName);
    }

    public void newsLetter() {
        log.info("Click on newsLetter");
        clickOnElement(newsLetterTick);
    }

    public void enterPassword(String password) {
        log.info("Enter password");
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        log.info("Enter confirm password");
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnRegistrationBtn() {
        log.info("Click on register button");
        clickOnElement(registerBtn);
    }

    public String registerText() {
        log.info("Click on register text");
        return getTextFromElement(registerPageText);
    }
//    public String getPersonalDetailText(){
//        log.info("Verify Registration page text");
//        return getTextFromElement(registerPageText);
//    }
}
