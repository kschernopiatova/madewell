package com.solvd.madewell.gui.pages;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.madewell.gui.components.FilterSidebar;
import com.solvd.madewell.gui.components.Header;
import com.solvd.madewell.gui.components.PageHeader;
import com.solvd.madewell.gui.components.ProductCard;
import com.solvd.madewell.gui.modals.RegistrationModal;
import com.solvd.madewell.gui.modals.ShippingModal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductGridPage extends AbstractPage {

    @FindBy(xpath = "//div[@role='banner']")
    private Header header;

    @FindBy(xpath = "//div[@class = 'search-result-options'][1]")
    private PageHeader pageHeader;

    @FindBy(xpath = "//div[contains(@class,'sidebarleft')]")
    private FilterSidebar filters;

    @FindBy(xpath = "//div[@id='search-result-content']/ul/li")
    private List<ProductCard> products;

    @FindBy(xpath = "//div[@class='eswModal']")
    private ShippingModal shippingModal;

    @FindBy(xpath = "//div[contains(@class,'registration ')]")
    private RegistrationModal registrationModal;

    public ProductGridPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get("url") + "/womens/clothing");
    }

    public ProductPage clickProductByTitle(String title) {
        ProductCard productCard = getProductByTitle(title);
        productCard.openProductPage();
        return new ProductPage(getDriver());
    }

    public ProductCard getProductByTitle(String title) {
        return products.stream()
                .filter(productCard -> title.equals(productCard.getProductTitle()))
                .findFirst().orElse(null);
    }

    public void closeModals() {
        if (shippingModal.isUIObjectPresent())
            shippingModal.closeModal();
        if (registrationModal.isUIObjectPresent())
            registrationModal.closeModal();
    }

}
