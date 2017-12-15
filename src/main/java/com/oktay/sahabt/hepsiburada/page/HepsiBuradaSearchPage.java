package com.oktay.sahabt.hepsiburada.page;

import com.oktay.sahabt.hepsiburada.constants.General_Constants;
import com.oktay.sahabt.hepsiburada.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HepsiBuradaSearchPage extends BasePageUtil implements General_Constants {

    public HepsiBuradaSearchPage(WebDriver driver) {
        super(driver);

    }

    public HepsiBuradaSearchPage searchPage(){
        clickElement(ELECTRONIC_XPATH);
        sleep(2);
        clickElement(COMPUTER_TABLET_XPATH);
        sleep(2);
        clickElement(INPUT_OUTPUT_DEVICES_XPATH);
        sleep(2);
        clickElement(MAUSE_XPATH);
        sleep(2);
        clickItemOfPaginations(getItemOfPaginations());
        sleep(2);
        return new HepsiBuradaSearchPage(driver);
    }

    public void showMauseDetails() {

    }
}
