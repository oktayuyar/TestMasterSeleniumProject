package com.oktay.sahabt.page;

import com.oktay.sahabt.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HepsiBuradaHomePage extends BasePageUtil{

    public HepsiBuradaHomePage(WebDriver driver) {
        super(driver);
    }

    public HespiBuradaLoginPage callLoginPage() {
        sleep(3);
        clickElement(By.className("insider-opt-in-notification-button"));
        clickElement(By.xpath("//div[@id='myAccount']/a[2]"));
        sleep(2);
        clickElement(By.xpath("/html//a[@id='login']"));
        Assert.assertTrue("Login failed!", getTitle().contains("Üye Giriş Sayfası"));
        if (getTitle().contains("Üye Giriş Sayfası")){
            log.info("Üye Giriş Sayfasına geldi.");
        }else {
            log.info("Üye Giriş Sayfası açılmadı!");
        }
        return new HespiBuradaLoginPage(driver);
    }

    public HespiBuradaLoginPage callRegisterPage(){
        callLoginPage();
        clickElement(By.cssSelector(".login-selections .control-group:nth-of-type(2) .text"));
        return new HespiBuradaLoginPage(driver);
    }
}
