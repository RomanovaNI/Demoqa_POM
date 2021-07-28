package com.telran.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanelPage extends PageBase{
    public SidePanelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindowsIcon;


    public BrowserWindowsPage selectBrowserWindows (){
        clickWithAction(browserWindowsIcon, 0, 300);
        return new BrowserWindowsPage(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alertsIcon;


    public AlertsPage selectAlerts (){
        clickWithAction(alertsIcon, 0, 300);
        return new AlertsPage(driver);
    }
}
