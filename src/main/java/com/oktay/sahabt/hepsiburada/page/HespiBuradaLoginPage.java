package com.oktay.sahabt.hepsiburada.page;

import com.oktay.sahabt.hepsiburada.constants.General_Constants;
import com.oktay.sahabt.hepsiburada.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HespiBuradaLoginPage extends BasePageUtil  implements General_Constants {

    public HespiBuradaLoginPage(WebDriver driver) {
        super(driver);
    }

    public void login() {
        setText(EMAIL_TEXTBOX,EMAIL);
        setText(PASSWORD_TEXTBOX,PASSWORD);
        clickElement(SUBMIT_BUTTON);
        sleep(3);

        Assert.assertTrue(LOGIN_ERROR_MESSAGE, getTitle().contains(HOME_PAGE_TITLE));
        log.info(LOGIN_SUCCESS_MESSAGE);
    }
}
