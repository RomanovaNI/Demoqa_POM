package com.telran.demoqa.tests;

import com.telran.demoqa.pages.HomePage;
import com.telran.demoqa.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTests extends TestBase{

    @Test
    public void loginPositiveTest(){
       new HomePage(driver).clickAvatarIcon().clickloginBtn().login("Natalia", "Natalia123%").verifyUserName("Natalia").logout();
      //new LoginPage(driver).login("Natalia", "Natalia123%").verifyUserName("Natalia").logout();
    }
}
