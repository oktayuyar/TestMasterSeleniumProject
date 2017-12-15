package com.oktay.sahabt.hepsiburada.page;

import com.oktay.sahabt.hepsiburada.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.oktay.sahabt.hepsiburada.constants.General_Constants;

public class HepsiBuradaHomePage extends BasePageUtil implements General_Constants {

    public HepsiBuradaHomePage(WebDriver driver) {
        super(driver);
    }

    public HespiBuradaLoginPage callLoginPage() {
        sleep(3);
        clickElement(By.className(POPUP_CLASS_NAME));
        clickElement(By.xpath(MY_ACCOUNT_XPATH));
        sleep(2);
        clickElement(By.xpath(LOGIN_XPATH));

        Assert.assertTrue(LOGIN_PAGE_ERROR_MESSAGE, getTitle().contains(LOGIN_PAGE_TITLE));
        log.info(LOGIN_PAGE_SUCCESS_MESSAGE);

        return new HespiBuradaLoginPage(driver);
    }

    public HepsiBuradaRegisterPage callRegisterPage(){
        sleep(3);
        clickElement(By.className(POPUP_CLASS_NAME));
        clickElement(By.xpath(MY_ACCOUNT_XPATH));
        sleep(2);
        clickElement(By.xpath(REGISTER_XPATH));

        Assert.assertTrue(REGISTER_PAGE_ERROR_MESSAGE, getTitle().contains(REGISTER_PAGE_TITLE));
        log.info(REGISTER_PAGE_SUCCESS_MESSAGE);

        return new HepsiBuradaRegisterPage(driver);
    }
}
