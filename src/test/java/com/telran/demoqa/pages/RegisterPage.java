package com.telran.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends  PageBase{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "firstname")
    WebElement firstName;

    @FindBy (id = "lastname")
    WebElement lastName;

    @FindBy (id = "userName")
    WebElement userName;

    @FindBy(id = "password")
    WebElement pswd;

    @FindBy(xpath = "//iframe[@title=\"reCAPTCHA\"]")
    WebElement checkBox;

    @FindBy(id = "register")
    WebElement regBtn;

    public RegisterPage fillRegForm(String fName, String lName, String uName, String password){
        type (firstName, fName);
        type(lastName,lName);
        type(userName,uName);
        type(pswd, password);
        clickOnElement(checkBox);
        pause(500);
        clickOnElement(regBtn);

        return this;
    }


}
