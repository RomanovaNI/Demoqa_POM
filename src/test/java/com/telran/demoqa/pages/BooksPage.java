package com.telran.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class BooksPage extends PageBase {
    public BooksPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "login")
    WebElement login;

    public LoginPage clickloginBtn() {
        clickOnElement(login);
        return new LoginPage(driver);
    }

    @FindBy(id = "searchBox")
    WebElement searchInput;

    public BooksPage typeInSearchFieldInput(String text) {

        //  pause(500);
        type(searchInput, text);
        return this;
    }

    @FindBy(xpath = "//span[@class='mr-2']/a")
    WebElement nameOfBook;

    public String takeNameOfBook() {
        pause(500);
        return driver.findElement(By.xpath("//span[@class='mr-2']/a")).getText();
    }

    @FindBy(css = ".rt-tr-group:nth-child(1) .rt-td:nth-child(2)")
    WebElement firstTitle;

    public String verifyEmptyField() {
        return firstTitle.getText();
    }



    public BooksPage clickByFirstBook() {
        nameOfBook.click();
        return this;
    }

    @FindBy(css = ".text-right.fullButton")
   // @FindBy(id = "addNewRecordButton")
    WebElement addToCollectionButton;


    public BooksPage addToYourCollection() {
        clickWithAction(addToCollectionButton, 0,500);
        pause(500);
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy (css=".show #item-3")
    WebElement profileBtn;

    public ProfilePage clickOnProfileButton() {
        clickWithAction(profileBtn, 0, 700);

        return new ProfilePage(driver);
    }
}


