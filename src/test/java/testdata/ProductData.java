package testdata;

import org.testng.annotations.DataProvider;

import core.helper.JsonHelper;

public class ProductData {

    @DataProvider(name = "products")
    public static Object[][] productList(){
        return JsonHelper.ReadJsonFromFile("src/test/resources/products.json");
    }
}
