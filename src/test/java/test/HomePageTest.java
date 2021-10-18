package test;

import org.testng.annotations.Test;

import pages.HomePage;

import org.testng.AssertJUnit;

public class HomePageTest extends AutomationPractiseTestBase {

    @Test
    public void shouldDisplay7ProductsInBestSellerBlock(){
        HomePage homePage = new HomePage(this.driver);
        AssertJUnit.assertEquals(homePage.getBestSellerProductListCount(), 7);
    }

}
