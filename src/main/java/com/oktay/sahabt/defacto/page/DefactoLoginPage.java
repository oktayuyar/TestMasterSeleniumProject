package com.oktay.sahabt.defacto.page;

import com.oktay.sahabt.defacto.constants.General_Constants;
import com.oktay.sahabt.defacto.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DefactoLoginPage extends BasePageUtil implements General_Constants {

    public DefactoLoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        sleep(5);
        setText(LOGIN_EMAIL_TEXTBOX,EMAIL);
        setText(LOGIN_PASSWORD_TEXTBOX,PASSWORD);
        clickElement(SUBMIT_BUTTON);

        System.out.println(driver.getTitle());


    }
}
