package com.oktay.sahabt.defacto.test;

import com.oktay.sahabt.defacto.base.BaseTest;
import com.oktay.sahabt.defacto.page.DefactoHomePage;
import org.junit.Test;

public class DefactoTest extends BaseTest{

    @Test
    public void defactoSuccessLoginTest(){
        new DefactoHomePage(driver).callLoginPage().login();
    }

    @Test
    public void defactoSuccessRegisterTest(){
        new DefactoHomePage(driver).callRegisterPage().register();
    }

    @Test
    public void defactoSearchShirtTest(){
        defactoSuccessLoginTest();
        new DefactoHomePage(driver).callSearchPage().searchShirtAndGoPayment().complatePayment();
    }
}
