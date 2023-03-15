package com.solvd.madewell.gui.modals;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ShippingModal extends AbstractUIObject {

    @FindBy(xpath = ".//button")
    private ExtendedWebElement continueShoppingButton;

    public ShippingModal(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void closeModal() {
        continueShoppingButton.click();
    }
}
