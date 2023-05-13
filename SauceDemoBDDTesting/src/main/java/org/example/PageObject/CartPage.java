package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver driver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyCartPage;

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement remove;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutBtn;

    public  boolean verifyCartPage(){
        return verifyCartPage.isDisplayed();
    }

    public void removeItem(){
        remove.click();
    }

    public void clickCheckout(){
        checkoutBtn.click();
    }
}
