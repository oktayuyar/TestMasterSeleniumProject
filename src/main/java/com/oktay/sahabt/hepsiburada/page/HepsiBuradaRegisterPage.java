package com.oktay.sahabt.hepsiburada.page;

import com.oktay.sahabt.hepsiburada.constants.General_Constants;
import com.oktay.sahabt.hepsiburada.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HepsiBuradaRegisterPage extends BasePageUtil implements General_Constants{

    public HepsiBuradaRegisterPage(WebDriver driver) {
        super(driver);
    }

    public void register() {
        setText(REGISTER_FIRST_NAME,NAME);
        setText(REGISTER_LAST_NAME,SURNAME);
        setText(REGISTER_EMAIL_TEXTBOX,EMAIL);
        setText(REGISTER_PASSWORD_TEXTBOX,PASSWORD);
        setText(REGISTER_PASSWORD_REPEAT_TEXTBOX,PASSWORD);
        clickElement(REGISTER_BUTTON);
        sleep(3);
        clickElement(AFTER_REGISTER_POPUP);

        Assert.assertTrue(REGISTER_ERROR_MESSAGE, getTitle().contains(HOME_PAGE_TITLE));
        log.info(REGISTER_SUCCESS_MESSAGE);

    }
}
