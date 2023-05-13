package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInformationPage {
    public static WebDriver driver;

    public CheckoutInformationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyCheckoutInformationPage;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement zipCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueBtn;

    public  boolean verifyCheckoutInformationPage(){
        return verifyCheckoutInformationPage.isDisplayed();
    }

    public void setFirstName(String first){
        firstName.sendKeys(first);
    }

    public void setLastName(String last){
        lastName.sendKeys(last);
    }

    public void setZipCode(String zip){
        zipCode.sendKeys(zip);
    }
    public void clickContinue(){
        continueBtn.click();
    }
}
