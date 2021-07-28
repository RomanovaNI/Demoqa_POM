package com.telran.demoqa.tests;

import com.telran.demoqa.pages.BooksPage;
import com.telran.demoqa.pages.HomePage;
import com.telran.demoqa.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationPageTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        new HomePage(driver).clickAvatarIcon();
        new BooksPage(driver).clickloginBtn();
    }

    @Test
    public void registrationUserTest(){
        int i= (int) ((System.currentTimeMillis()/1000)%3600);
        String uName="Nat"+i;

        new LoginPage(driver).createNewUser("Nata1", "Natalia123%")
                .fillRegForm("Nat","Sch","Nata1", "Natalia123%");
    }
}
