package com.oktay.sahabt.defacto.page;

import com.oktay.sahabt.defacto.constants.General_Constants;
import com.oktay.sahabt.defacto.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DefactoHomePage extends BasePageUtil implements General_Constants {

    public DefactoHomePage(WebDriver driver) {
        super(driver);
    }

    public DefactoLoginPage callLoginPage() {
        sleep(5);
        //clickElement(By.className(POPUP_CLASS_NAME));
        //sleep(2);
        clickElement(By.xpath(LOGIN_XPATH));
        sleep(5);
        Assert.assertTrue(LOGIN_PAGE_ERROR_MESSAGE, getTitle().contains(HOME_PAGE_TITLE));
        log.info(LOGIN_PAGE_SUCCESS_MESSAGE);
        return new DefactoLoginPage(driver);
    }

    public DefactoRegisterPage callRegisterPage(){
        sleep(2);
        //clickElement(By.className(POPUP_CLASS_NAME));
        clickElement(By.xpath(REGISTER_XPATH));

        Assert.assertTrue(REGISTER_PAGE_ERROR_MESSAGE, getTitle().contains(REGISTER_PAGE_TITLE));
        log.info(REGISTER_PAGE_SUCCESS_MESSAGE);
        return new DefactoRegisterPage(driver);
    }

    public DefactoSearchPage callSearchPage(){

        sleep(5);
        click(HOME_PAGE_MAN_XPATH);
        if(getTitle().contains("erkek"))
            log.info(CLICK_MAN_LOG_INFO);
        return new DefactoSearchPage(driver);
    }

}
