package step_definitions;

import cucumber.api.java.en.Then;
import org.example.PageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    private WebDriver webDriver;

    public  CartSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on cart page")
    public void verifyCartPage() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.verifyCartPage());
    }
    @Then("User remove item Test.allTheThings")
    public void removeItem() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.removeItem();
    }

    @Then("User click checkout button")
    public void clickCheckout(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickCheckout();
    }
}
