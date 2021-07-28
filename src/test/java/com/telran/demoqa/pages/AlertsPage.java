package com.telran.demoqa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collection;

public class AlertsPage extends PageBase {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "alertButton")
    WebElement firstAlertBtn;

    public AlertsPage clickOnFirstAlertBtn(){
        firstAlertBtn.click();
        driver.switchTo().alert().accept();
        return this;

    }

    @FindBy(id = "timerAlertButton")
    WebElement timerAlertBtn;

    public AlertsPage clickOnAlertBtn2AndWait() {
        timerAlertBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 8);
        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
        myAlert.accept();

        return this;
    }

    @FindBy(id = "confirmButton")
    WebElement confirmBtn;

    public AlertsPage clickOnAlertBtn3() {
        confirmBtn.click();
        return this;
    }

    public AlertsPage clickOnCancelBtn(String text) {
        if (text != null && text.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        } else if (text != null && text.equals("Ok")) {
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(id = "confirmResult")
    WebElement confirmText;

    public String getConfirmResult() {
        return confirmText.getText();
    }

    @FindBy(id = "promtButton")
    WebElement promtBtn;

    public AlertsPage clickOnAlertBtn4() {
        promtBtn.click();
        return this;
    }

    public AlertsPage sendTextToAlert(String text) {
        if (text != null)
            driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
        return this;

    }

    @FindBy(xpath = "//span[@id='promptResult']")
    WebElement confirmLastText;


    public String getConfirmLastResult() {
       return confirmLastText.getText();
    }
}
