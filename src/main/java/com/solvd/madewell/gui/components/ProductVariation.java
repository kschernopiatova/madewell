package com.solvd.madewell.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductVariation extends AbstractUIObject {

    @FindBy(xpath = "./h3/div[1]")
    private ExtendedWebElement variationName;

    @FindBy(xpath = ".//div[@class='selected-value']")
    private ExtendedWebElement selectedValue;

    @FindBy(xpath = ".//div[@class='value']//li")
    private ExtendedWebElement variationOptions;

    public ProductVariation(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
