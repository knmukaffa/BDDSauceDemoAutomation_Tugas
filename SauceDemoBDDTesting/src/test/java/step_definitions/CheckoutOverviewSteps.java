package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.PageObject.CheckoutOverviewPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewSteps {
    private WebDriver webDriver;

    public CheckoutOverviewSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on checkout overview page")
    public void checkoutOverviewPage(){
        CheckoutOverviewPage checkoutView = new CheckoutOverviewPage(webDriver);
        Assert.assertTrue(checkoutView.verifyCheckoutOverviewPage());
    }

    @And("User already check the total price")
    public void verifyTotalPrice() throws InterruptedException {
        CheckoutOverviewPage checkoutView = new CheckoutOverviewPage(webDriver);
        Assert.assertEquals(checkoutView.verifyTotalPrice(),checkoutView.pricePlusTax());
    }
    @Then("User finish checkout")
    public void clickFinishButton() throws InterruptedException {
        CheckoutOverviewPage chekoutView = new CheckoutOverviewPage(webDriver);
        chekoutView.clickFinishBtn();
    }
}
