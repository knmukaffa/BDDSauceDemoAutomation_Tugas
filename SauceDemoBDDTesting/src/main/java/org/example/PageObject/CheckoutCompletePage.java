package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {
    public static WebDriver driver;

    public CheckoutCompletePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement verifyOrderConfirmed;

    public boolean verifyOrderConfirmed(){
        return verifyOrderConfirmed.isDisplayed();
    }

}
