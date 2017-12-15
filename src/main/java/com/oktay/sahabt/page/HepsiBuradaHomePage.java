package com.oktay.sahabt.page;

import com.oktay.sahabt.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HepsiBuradaHomePage extends BasePageUtil{

    public HepsiBuradaHomePage(WebDriver driver) {
        super(driver);
    }

    public HespiBuradaLoginPage callLoginPage() {
        sleep(3);
        clickElement(By.className("insider-opt-in-notification-button"));
        clickElement(By.id("myAccount"));
        clickElement(By.id("login"));
        return new HespiBuradaLoginPage(driver);
    }
}
