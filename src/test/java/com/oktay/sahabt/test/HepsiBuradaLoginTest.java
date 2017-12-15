package com.oktay.sahabt.test;

import com.oktay.sahabt.base.BaseTest;
import com.oktay.sahabt.page.HepsiBuradaHomePage;
import org.junit.Test;

public class HepsiBuradaLoginTest extends BaseTest {

    @Test
    public void hepsiBuradaSuccessLoginTest(){
        new HepsiBuradaHomePage(driver).callLoginPage().login(EMAIL,PASSWORD);
    }

    @Test
    public void hepsiBuradaSuccessRegisterTest(){
        new HepsiBuradaHomePage(driver).callRegisterPage();
    }
}
