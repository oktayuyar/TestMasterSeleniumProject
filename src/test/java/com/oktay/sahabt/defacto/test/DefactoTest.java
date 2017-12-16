package com.oktay.sahabt.defacto.test;

import com.oktay.sahabt.defacto.base.BaseTest;
import com.oktay.sahabt.defacto.page.DefactoHomePage;
import org.junit.Test;

public class DefactoTest extends BaseTest{

    @Test
    public void hepsiBuradaSuccessLoginTest(){
        new DefactoHomePage(driver).callLoginPage().login();
    }

    @Test
    public void hepsiBuradaSuccessRegisterTest(){
        new DefactoHomePage(driver).callRegisterPage().register();
    }
}
