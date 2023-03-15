package com.solvd.madewell.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.madewell.gui.components.Header;
import com.solvd.madewell.gui.components.ProductVariation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends AbstractPage {

    @FindBy(xpath = "//div[@role='banner']")
    private Header header;

    @FindBy(xpath = "//h1")
    private ExtendedWebElement title;

    @FindBy(xpath = "//div[@class='product-price']/span")
    private ExtendedWebElement price;

    @FindBy(xpath = "//div[@class='product-variations']/div")
    private List<ProductVariation> productVariations;

    @FindBy(xpath = "//button[contains(@class,'add-to-cart')]")
    private ExtendedWebElement cartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(title);
    }

    public String getProductName() {
        return title.getText();
    }
}
