package com.telran.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h5[contains(.,'Book Store Application')]")
            //xpath = "//div[@class='category-cards']/div[.='Book Store Application']"
    WebElement BookStoreApp;

    public BooksPage clickAvatarIcon(){
        clickWithAction(BookStoreApp,0,700);


        return new BooksPage(driver);
    }

    @FindBy(xpath = "//div[@class='category-cards']/div[.='Alerts, Frame & Windows']")
    WebElement alertFrameAndWindowIcon;

    public SidePanelPage goToAlertFrameAndWindowIcon(){
        clickWithAction(alertFrameAndWindowIcon,0,300);


        return new SidePanelPage(driver);
    }

    //avatar mx-auto white
    //login
}
