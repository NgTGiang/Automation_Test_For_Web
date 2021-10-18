package test;

import org.testng.annotations.Test;

import pages.DressCategoryPage;
import pages.HomePage;

import org.testng.AssertJUnit;

public class DressCategoryPageTest extends AutomationPractiseTestBase {
    @Test
    public void shouldDisplaySubCategoriesCorrectly(){
        HomePage homePage = new HomePage(this.driver);
        DressCategoryPage dressCategoryPage = homePage.navigateToDressCategory();
        AssertJUnit.assertTrue(dressCategoryPage.isSubCategiesDiplayCorrectly());
    }
}
