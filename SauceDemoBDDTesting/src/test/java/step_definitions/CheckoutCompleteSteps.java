package step_definitions;

import cucumber.api.java.en.And;
import org.example.PageObject.CheckoutCompletePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutCompleteSteps {
    private WebDriver webDriver;

    public CheckoutCompleteSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User complete Order")
    public void verifyOrderComplete(){
        CheckoutCompletePage checkoutComplete = new CheckoutCompletePage(webDriver);
        Assert.assertTrue(checkoutComplete.verifyOrderConfirmed());
    }
}
