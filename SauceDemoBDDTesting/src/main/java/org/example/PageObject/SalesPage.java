package org.example.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SalesPage {

    public static WebDriver driver;

    public SalesPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifySalesPage;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement sortContainer;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement addCart1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement addCart2;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement cart;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement sortProduct;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement cart1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement cart2;


    public  boolean verifySalesPage(){
        return verifySalesPage.isDisplayed();
    }

    public void clickAddCart1(){
        addCart1.click();
    }

    public void clickAddCart2(){
        addCart2.click();
    }

    public void clickCart(){
        cart.click();
    }

    public void setSortProduct(String sort){
        Select a = new Select(sortProduct);
        a.selectByVisibleText(sort);
    }


    public void productAdd(String namaProduk){
        String a = "//div[text()[contains(.,'"+ namaProduk +"')]]" +
                "/ancestor::div[@class='inventory_item_description']//*[contains(@id,'add-to-cart')]";
        driver.findElement(By.xpath(a)).click();
    }
}
