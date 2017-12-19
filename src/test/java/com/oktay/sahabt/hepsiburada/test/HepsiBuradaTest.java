package com.oktay.sahabt.hepsiburada.test;

import com.oktay.sahabt.hepsiburada.base.BaseTest;
import com.oktay.sahabt.hepsiburada.page.HepsiBuradaHomePage;
import com.oktay.sahabt.hepsiburada.page.HepsiBuradaSearchPage;
import org.junit.Test;

public class HepsiBuradaTest extends BaseTest {

    @Test
    public void hepsiBuradaSuccessLoginTest(){
        new HepsiBuradaHomePage(driver).callLoginPage().login();
    }

    @Test
    public void hepsiBuradaSuccessRegisterTest(){
        new HepsiBuradaHomePage(driver).callRegisterPage().register();
    }

    @Test
    public void hepsiBuradaFindMouseTest(){
        hepsiBuradaSuccessLoginTest();
        new HepsiBuradaSearchPage(driver).findMousePage().showMouseDetails();
    }

    @Test
    public void hepsiBuradaSearchMouseTest(){
        hepsiBuradaSuccessLoginTest();
        new HepsiBuradaSearchPage(driver).searchMouse();
    }

    @Test
    public void hepsiBuradaSearchIphoneAndBuyTest(){
        hepsiBuradaSuccessLoginTest();
        new HepsiBuradaSearchPage(driver).searchIponeAndGoPayment().complatePayment();
    }

    @Test
    public void hepsiBuradaSearchShoeTest(){
        hepsiBuradaSuccessLoginTest();
        new HepsiBuradaSearchPage(driver).searchShoe();
    }
}
