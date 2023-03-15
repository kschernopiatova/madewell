package com.solvd.madewell.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FilterItem extends AbstractUIObject {

    @FindBy(xpath = "./h3")
    private ExtendedWebElement filterName;

    @FindBy(xpath = ".//ul[not(contains(@class,'level-1'))]/li")
    private ExtendedWebElement filterOptions;

    public FilterItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
