package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {
    public static WebDriver driver;

    public CheckoutOverviewPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyCheckoutOverviewPage;

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement verifyTotalPrice;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishBtn;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement itemPrice;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement tax;

    public boolean verifyCheckoutOverviewPage(){
        return verifyCheckoutOverviewPage.isDisplayed();
    }

    public String pricePlusTax(){
        String a = itemPrice.getText().replace("Item total: $", "");
        String b = tax.getText().replace("Tax: $","");
        Double  harga = Double.valueOf(a);
        Double pajak = Double.valueOf(b);
        Double total = harga + pajak;
        String c = String.valueOf(total);
        return c;
    }

    public String verifyTotalPrice(){
        return verifyTotalPrice.getText().replace("Total: $","");
    }

    public void clickFinishBtn (){
        finishBtn.click();
    }
}
