package test;

import org.testng.annotations.Test;

import pages.HomePage;
import testdata.ProductData;

import org.testng.AssertJUnit;

public class OrderSuccessfullyPageTest extends AutomationPractiseTestBase {

    @Test(dataProvider = "products", dataProviderClass = ProductData.class)
    public void shouldOrderSuccessfully(String productName) throws Exception {
        HomePage homePage = new HomePage(this.driver);
        String expectedSuccessMessage = "Your order on My Store is complete.";

        String actualSuccessMessage = homePage.navigateToWomenCategory()
                                                .selectProduct(productName)
                                                .addProductToCart()
                                                .proceedToCheckout()
                                                .proceedToCheckout()
                                                .createNewEmail()
                                                .registerNewEmail()
                                                .proceedToCheckout()
                                                .proceedToCheckout()
                                                .checkOut()
                                                .confirmOrder()
                                                .getSuccessMessage();
        AssertJUnit.assertEquals(actualSuccessMessage, expectedSuccessMessage);

    }

}
