package com.oktay.sahabt.hepsiburada.page;

import com.oktay.sahabt.hepsiburada.constants.General_Constants;
import com.oktay.sahabt.hepsiburada.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HepsiBuradaSearchPage extends BasePageUtil implements General_Constants {

    public HepsiBuradaSearchPage(WebDriver driver) {
        super(driver);

    }
    // Alert işlemlerini yaz
    public HepsiBuradaSearchPage findMousePage(){
        clickElement(ELECTRONIC_XPATH);
        sleep(2);
        clickElement(COMPUTER_TABLET_XPATH);
        sleep(2);
        clickElement(INPUT_OUTPUT_DEVICES_XPATH);
        sleep(2);
        clickElement(MOUSE_XPATH);
        sleep(2);
        clickItemOfPaginations();
        sleep(3);

        return new HepsiBuradaSearchPage(driver);
    }

    public void showMouseDetails() {
        sleep(2);
        clickElement(MOUSE_DETAIL_XPATH);

    }

    public void searchMouse(){
        setText(PRODUCT_ID,MOUSE_PRODUCT_VALUE);
        submit(PRODUCT_ID);
        sleep(2);
        clickElement(LOGITECH_MOUSE_XPATH);
        sleep(3);
        getBadgets();
        sleep(2);
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
        getBadgets();
        sleep(2);
        clickElement(ADD_TO_CART_ID);
        sleep(3);
        clickElement(COMPLETE_SHOPPING_XPATH);
        sleep(3);

        Assert.assertTrue(DELIVERY_PAGE_ERROR_MESSAGE, getTitle().contains(DELIVERY_PAGE_TITLE));
        log.info(DELIVERY_PAGE_SUCCESS_MESSAGE);

        return new HepsiBuradaPaymentPage(driver);
    }

    public void searchShoe(){
        setText(PRODUCT_ID,SHOE_PRODUCT_VALUE);
        submit(PRODUCT_ID);

        clickElement(MAN_XPATH);
        Assert.assertTrue(MAN_PRODUCT_PAGE_ERROR_MESSAGE, getTitle().contains(MAN_PRODUCT_TITLE));
        log.info(MAN_PRODUCT_PAGE_MESSAGE);

        clickElement(MAN__SHOE_XPATH);
        Assert.assertTrue(MAN_SHOE_MODELS_ERROR_MESSAGE, getTitle().contains(MAN_SHOE_MODELS_TITLE));
        log.info(MAN_SHOE_MODELS_MESSAGE);

        clickElement(DAILY_SHOE_XPATH);
        Assert.assertTrue(DAILY_MAN_SHOE_MODELS_ERROR_MESSAGE, getTitle().contains(DAILY_MAN_SHOE_MODELS_TITLE));
        log.info(DAILY_MAN_SHOE_MODELS_MESSAGE);

        sleep(2);
        setText(SEARCH_BRAND_OF_SHOE_XPATH,BRAND_OF_SHOE_VALUE);
        sleep(2);
        clickElement(SELECT_BRAND_OF_SHOE_XPATH);
        getTitle();
        getFılters();
        setText(MIN_SHOE_PRICE_XPATH,MIN_SHOE_PRICE_VALUE);
        setText(MAX_SHOE_PRICE_XPATH,MAX_SHOE_PRICE_VALUE);
        sleep(2);
        clickElement(SEARCH_PRICE_XPATH);
        getFılters();
        sleep(2);
        clickElement(SHOE_COLOR_XPATH);
        sleep(2);
        getFılters();
        clickElement(SHOE_NUMBER_XPATH);
        sleep(2);
        getFılters();
        clickElement(SHOE_STORE_XPATH);
        sleep(2);
        getFılters();
        sleep(3);
        clickElement(SELECTED_SHOE_XPATH);
        sleep(2);
        Assert.assertTrue(SELECTED_SHOE_ERROR_MESSAGE, getTitle().contains(SELECTED_SHOE_TITLE));
        log.info(SELECTED_SHOE_MESSAGE);
    }

}
