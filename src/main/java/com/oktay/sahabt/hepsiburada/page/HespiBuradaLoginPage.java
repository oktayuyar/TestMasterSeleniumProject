package com.oktay.sahabt.hepsiburada.page;

import com.oktay.sahabt.hepsiburada.constants.General_Constants;
import com.oktay.sahabt.hepsiburada.util.BasePageUtil;
import org.openqa.selenium.WebDriver;

public class HespiBuradaLoginPage extends BasePageUtil  implements General_Constants {

    public HespiBuradaLoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {

    }
}
