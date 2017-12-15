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
    public void hepsiBuradaFindMauseTest(){
        hepsiBuradaSuccessLoginTest();
        new HepsiBuradaSearchPage(driver).findMausePage().showMauseDetails();
    }

    @Test
    public void hepsiBuradaSearchMauseTest(){
        hepsiBuradaSuccessLoginTest();
        new HepsiBuradaSearchPage(driver).searchMausePage();
    }
}
