package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.SalesPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SalesSteps {
    private WebDriver webDriver;

    public  SalesSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on sales page")
    public void verifySalesPage(){
        SalesPage salesPage = new SalesPage(webDriver);
        Assert.assertTrue(salesPage.verifySalesPage());
    }

    @When("User sort product by \"(.*)\"")
    public void sorting(String sort){
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.setSortProduct(sort);
    }

    @Then("User add item to cart")
    public void addItem() {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.clickAddCart1();
        salesPage.clickAddCart2();
    }

    @Then("User click cart button")
    public void goToChart() throws InterruptedException {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.clickCart();


    }

    @Then("User sort product list by \"(.*)\"")
    public void sortProduct(String sort) throws InterruptedException {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.setSortProduct(sort);


    }

    @And("User Pick 2 item to cart Sauce Labs Onesie and Sauce Labs Bike Light")
    public void addingItem() throws InterruptedException {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.clickAddCart1();

        salesPage.clickAddCart2();

    }

    @And("User pick product \"(.*)\"")
    public void clickProduct(String namaProduk) throws InterruptedException {
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.productAdd(namaProduk);

    }
}
