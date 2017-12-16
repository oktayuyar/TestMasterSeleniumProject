package com.oktay.sahabt.hepsiburada.page;

import com.oktay.sahabt.hepsiburada.base.BaseTest;
import com.oktay.sahabt.hepsiburada.constants.General_Constants;
import com.oktay.sahabt.hepsiburada.util.BasePageUtil;
import org.junit.Assert;
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
        clickItemOfPaginations();
        sleep(3);

        return new HepsiBuradaSearchPage(driver);
    }

    public void showMauseDetails() {
        sleep(2);
        clickElement(MAUSE_DETAIL_XPATH);

    }

    public void searchMause(){
        setText(PRODUCT_ID,MAUSE_PRODUCT_VALUE);
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

    public HepsiBuradaPaymentPage searchIponeAndGoPayment(){
        setText(PRODUCT_ID,IPHONE_PRODUCT_VALUE);
        submit(PRODUCT_ID);
        sleep(2);
        clickElement(IPHONE_DETAIL_XPATH);
        sleep(3);
        clickElement(ADD_TO_CART_ID);
        sleep(3);
        clickElement(COMPLETE_SHOPPING_XPATH);
        sleep(3);

        Assert.assertTrue(PAYMENT_PAGE_ERROR_MESSAGE, getTitle().contains(PAYMENT_PAGE_TITLE));
        log.info(PAYMENT_PAGE_SUCCESS_MESSAGE);

        return new HepsiBuradaPaymentPage(driver);
    }

    public void searchShoe(){
        setText(PRODUCT_ID,"Ayakkabı");
        submit(PRODUCT_ID);

        clickElement(MAN_XPATH);
        Assert.assertTrue(REGISTER_ERROR_MESSAGE, getTitle().contains("Erkek Ürünleri"));
        log.info("Erkek ürünleri tıklandı");

        clickElement(MAN__SHOES_XPATH);
        Assert.assertTrue(REGISTER_ERROR_MESSAGE, getTitle().contains("Erkek Ayakkabı Modelleri"));
        log.info("Erkek ayakkabı modelleri tıklandı");

        clickElement(DAILY_SHOES_XPATH);
        Assert.assertTrue(REGISTER_ERROR_MESSAGE, getTitle().contains("Günlük Erkek Ayakkabı Modelleri"));
        log.info("Günlük Erkek ayakkabı modelleri tıklandı");

        sleep(2);
        setText(SEARCH_BRAND_OF_SHOES_XPATH,"Dockers");
        sleep(2);
        clickElement(SELECT_BRAND_OF_SHOES_XPATH);
        getTitle();
        getFılters();
        setText(MIN_SHOES_PRICE_XPATH,"250");
        setText(MAX_SHOES_PRICE_XPATH,"500");
        sleep(2);
        clickElement(SEARCH_PRICE_XPATH);
        getFılters();
        sleep(2);
        clickElement(SHOES_COLOR_XPATH);
        sleep(2);
        getFılters();
        clickElement(SHOES_NUMBER_XPATH);
        sleep(2);
        getFılters();
        clickElement(SHOES_STORE_XPATH);
        sleep(2);
        getFılters();
        sleep(3);
        clickElement(SELECTED_SHOES_XPATH);
        sleep(2);
        Assert.assertTrue(REGISTER_ERROR_MESSAGE, getTitle().contains("Dockers 6P 220370 M K Kah Ayakkabı"));
        log.info("Dockers 6P 220370 M K Kah Ayakkabı");
    }

}
