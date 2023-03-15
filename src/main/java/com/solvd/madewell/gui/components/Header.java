package com.solvd.madewell.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Header extends AbstractUIObject {

    @FindBy(xpath = ".//div[contains(@class,'logo')]/a")
    private ExtendedWebElement logo;

    @FindBy(xpath = ".//ul[contains(@class,'nav-menu')]/li[@class='nav-item']")
    private List<ExtendedWebElement> menuItems;

    @FindBy(xpath = ".//div[contains(@class,'menu-utility')]//li[contains(@class,'search')]")
    private ExtendedWebElement searchField;

    @FindBy(xpath = ".//div[contains(@class,'menu-utility')]//li[contains(@class,'user')]")
    private ExtendedWebElement logInButton;

    @FindBy(xpath = ".//div[@id='mini-cart']")
    private ExtendedWebElement bagButton;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
