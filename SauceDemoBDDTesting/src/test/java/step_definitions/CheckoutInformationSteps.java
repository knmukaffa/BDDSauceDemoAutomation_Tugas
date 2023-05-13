package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.example.PageObject.CheckoutInformationPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutInformationSteps {
    private WebDriver webDriver;

    public  CheckoutInformationSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User already on checkout information page")
    public void verifyCheckoutInfoPage() throws InterruptedException {
        CheckoutInformationPage checkoutInfo = new CheckoutInformationPage(webDriver);
        Assert.assertTrue(checkoutInfo.verifyCheckoutInformationPage());
    }
    @When("User input \"(.*)\" as firstName and input \"(.*)\" as lastName and input \"(.*)\" as zipCode")
    public void inputInformation(String firstName, String lastName, String zipCode) throws InterruptedException {
        CheckoutInformationPage checkoutInfo = new CheckoutInformationPage(webDriver);
        checkoutInfo.setFirstName(firstName);
        checkoutInfo.setLastName(lastName);
        checkoutInfo.setZipCode(zipCode);
        checkoutInfo.clickContinue();
    }
}
