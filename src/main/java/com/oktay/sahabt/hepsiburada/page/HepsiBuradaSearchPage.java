package com.oktay.sahabt.hepsiburada.page;

import com.oktay.sahabt.hepsiburada.constants.General_Constants;
import com.oktay.sahabt.hepsiburada.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HepsiBuradaSearchPage extends BasePageUtil implements General_Constants {

    public HepsiBuradaSearchPage(WebDriver driver) {
        super(driver);

    }
    // Alert işlemlerini yaz
    public HepsiBuradaSearchPage findMausePage(){
        clickElement(ELECTRONIC_XPATH);
        sleep(2);
        clickElement(COMPUTER_TABLET_XPATH);
        sleep(2);
        clickElement(INPUT_OUTPUT_DEVICES_XPATH);
        sleep(2);
        clickElement(MAUSE_XPATH);
        sleep(2);
        clickItemOfPaginations(getItemOfPaginations());

        return new HepsiBuradaSearchPage(driver);
    }

    public void showMauseDetails() {
        sleep(2);
        clickElement(MAUSE_DETAIL_XPATH);
    }

    public void searchMausePage(){
        setText(PRODUCT_ID,PRODUCT_VALUE);
        submit(PRODUCT_ID);
        sleep(2);
        clickElement(LOGITECH_MAUSE_XPATH);
        sleep(3);
        clickElement(SHOPPING_CART_ID);
        sleep(2);
        clickElement(INCREASE_CART_XPATH);
        sleep(2);
        clickElement(INCREASE_CART_XPATH);
        sleep(2);
        clickElement(COMPLETE_SHOPPING_XPATH);
    }
}
