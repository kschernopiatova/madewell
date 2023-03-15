package com.solvd.madewell.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageHeader extends AbstractUIObject {

    @FindBy(xpath = ".//span[contains(@class,'checkbox')]")
    private List<ExtendedWebElement> availabilityCheckbox;

    @FindBy(xpath = ".//select")
    private ExtendedWebElement sortButton;

    @FindBy(xpath = ".//option")
    private List<ExtendedWebElement> sortOptions;

    public PageHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
