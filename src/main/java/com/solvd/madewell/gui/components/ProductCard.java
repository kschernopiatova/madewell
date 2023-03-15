package com.solvd.madewell.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductCard extends AbstractUIObject {

    @FindBy(xpath = ".//ul[@class='swatch-list']//a")
    private List<ExtendedWebElement> colorSwatches;

    @FindBy(xpath = ".//div[@class='product-name']/a")
    private ExtendedWebElement productTitle;

    @FindBy(xpath = ".//span[contains(@class,'price')]")
    private ExtendedWebElement productPrice;

    public ProductCard(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void openProductPage() {
        productTitle.click();
    }

    public String getProductTitle() {
        return productTitle.getText();
    }
}
