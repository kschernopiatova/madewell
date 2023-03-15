import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.madewell.gui.pages.ProductGridPage;
import com.solvd.madewell.gui.pages.ProductPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductGridTest implements IAbstractTest {

    private static final String PRODUCT_NAME = "Brightside One-Shoulder Tank";

    @Test
    public void openProductPageTest() {
        SoftAssert softAssert = new SoftAssert();
        ProductGridPage productGridPage = new ProductGridPage(getDriver());
        productGridPage.open();
        productGridPage.closeModals();
        ProductPage productPage = productGridPage.clickProductByTitle(PRODUCT_NAME);
        softAssert.assertTrue(productPage.isPageOpened(), "Product page isn't opened!");
        softAssert.assertEquals(productPage.getProductName(), PRODUCT_NAME, "Wrong product page is opened!");
        softAssert.assertAll();
    }
}
