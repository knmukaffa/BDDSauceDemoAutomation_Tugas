$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/EndToEndCheckout.feature");
formatter.feature({
  "line": 2,
  "name": "End to End Checkout",
  "description": "As a User I Want to Checkout Product from SauceDemo Website",
  "id": "end-to-end-checkout",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Checkout"
    }
  ]
});
formatter.before({
  "duration": 7316579800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "End to End Checkout",
  "description": "",
  "id": "end-to-end-checkout;end-to-end-checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User already on website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User already on sales page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User sort product by \"Name (Z to A)\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User add item to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click cart button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User already on cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User remove item Test.allTheThings",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User click checkout button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User already on checkout information page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User input \"khairun\" as firstName and input \"khairun\" as lastName and input \"11111\" as zipCode",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User already on checkout overview page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User already check the total price",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User finish checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User complete Order",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 236913900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 309177000,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.verifySalesPage()"
});
formatter.result({
  "duration": 68557000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 22
    }
  ],
  "location": "SalesSteps.sorting(String)"
});
formatter.result({
  "duration": 139810100,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.addItem()"
});
formatter.result({
  "duration": 89209700,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.goToChart()"
});
formatter.result({
  "duration": 55986600,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.verifyCartPage()"
});
formatter.result({
  "duration": 30569400,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.removeItem()"
});
formatter.result({
  "duration": 39903300,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.clickCheckout()"
});
formatter.result({
  "duration": 51199200,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutInformationSteps.verifyCheckoutInfoPage()"
});
formatter.result({
  "duration": 24505200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "khairun",
      "offset": 12
    },
    {
      "val": "khairun",
      "offset": 45
    },
    {
      "val": "11111",
      "offset": 77
    }
  ],
  "location": "CheckoutInformationSteps.inputInformation(String,String,String)"
});
formatter.result({
  "duration": 294788900,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutOverviewSteps.checkoutOverviewPage()"
});
formatter.result({
  "duration": 20787500,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutOverviewSteps.verifyTotalPrice()"
});
formatter.result({
  "duration": 58217100,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutOverviewSteps.clickFinishButton()"
});
formatter.result({
  "duration": 43060800,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutCompleteSteps.verifyOrderComplete()"
});
formatter.result({
  "duration": 27488500,
  "status": "passed"
});
formatter.after({
  "duration": 668698200,
  "status": "passed"
});
});