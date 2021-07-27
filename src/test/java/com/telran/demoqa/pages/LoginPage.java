package com.telran.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "password")
    WebElement pswd;

    @FindBy(id = "login")
    WebElement loginBtn;

    @FindBy(id = "newUser")
    WebElement newUserBtn;


    public ProfilePage login(String name, String password) {
        type(userName,name);
        type (pswd,password);
        // clickWithAction(loginBtn,0,300);
        loginBtn.click();

        return new ProfilePage(driver);
    }

    public LoginPage loginNegative(String name, String password) {
        type(userName,name);
        type (pswd,password);
        loginBtn.click();

        return this;
    }

    public RegisterPage createNewUser(String name, String password){
        type(userName,name);
        type (pswd,password);
        // clickWithAction(loginBtn,0,300);
       newUserBtn.click();

        return new RegisterPage(driver);
    }


}
