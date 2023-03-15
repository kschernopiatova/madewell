package com.solvd.madewell.gui.modals;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegistrationModal extends AbstractUIObject {

    @FindBy(xpath = ".//button[contains(@class,'close')]")
    private ExtendedWebElement closeButton;

    public RegistrationModal(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void closeModal() {
        closeButton.click();
    }
}
