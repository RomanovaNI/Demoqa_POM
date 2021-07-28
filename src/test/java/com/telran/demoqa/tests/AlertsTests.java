package com.telran.demoqa.tests;

import com.telran.demoqa.pages.AlertsPage;
import com.telran.demoqa.pages.HomePage;
import com.telran.demoqa.pages.SidePanelPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        new HomePage(driver).goToAlertFrameAndWindowIcon();
        new SidePanelPage(driver).selectAlerts();
    }

    @Test
    public void alertWaitTest(){
        new AlertsPage(driver).clickOnAlertBtn2AndWait();
    }

    @Test
    public void cancelAlertTest(){
        new AlertsPage(driver).clickOnAlertBtn3().clickOnCancelBtn("Cancel");
        Assert.assertTrue(new AlertsPage(driver).getConfirmResult().contains("Cancel"));

    }
    @Test
    public void alertSendTextTest(){
        new AlertsPage(driver).clickOnAlertBtn4().sendTextToAlert("hi");

        Assert.assertTrue(new AlertsPage(driver).getConfirmLastResult().contains("hi"));


    }

    @Test
    public void alertAcceptTest(){
        new AlertsPage(driver).clickOnFirstAlertBtn();
    }
}
