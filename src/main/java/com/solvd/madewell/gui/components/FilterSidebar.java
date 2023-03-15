package com.solvd.madewell.gui.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilterSidebar extends AbstractUIObject {

    @FindBy(xpath = ".//div[contains(@class,'is-category') and not(contains(@class,'lily'))]")
    private List<FilterItem> filterItems;

    public FilterSidebar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
