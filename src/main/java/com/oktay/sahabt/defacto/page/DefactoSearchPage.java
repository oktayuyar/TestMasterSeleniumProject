package com.oktay.sahabt.defacto.page;

import com.oktay.sahabt.defacto.util.BasePageUtil;
import com.oktay.sahabt.defacto.constants.General_Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DefactoSearchPage extends BasePageUtil implements General_Constants{

    public DefactoSearchPage(WebDriver driver) {
        super(driver);
    }

    public DefactoPaymentPage searchShirtAndGoPayment(){
        searchShirt();
        return new DefactoPaymentPage(driver);

    }

    public void searchShirt(){
        sleep(2);
        click(CLOTHING_CSS_SELECTOR);
        sleep(2);
        if(getTitle().contains("giyim"))
            log.info(CLOTHING_LOG_INFO);
        click(SHIRT_CSS_SELECTOR);
        sleep(2);
        if(getTitle().contains("gömlek"))
            log.info(SHIRT_LOG_INFO);
        click(MODEL_CSS_SELECTOR);
        sleep(2);
        click(COLOR_OF_SHIRT_XPATH);
        sleep(2);
        if(getTitle().contains("mavi"))
            log.info(COLOR_LOG_INFO);
        click(ANOTHER_COLOR_OF_SHIRT_XPATH);
        sleep(3);
        click(SELECTED_SHIRT_XPATH);
        sleep(3);
        click(SIZE_OF_SHIRT_XPATH);
        sleep(2);
        setText(QUANTITY_ID,"1");
        sleep(3);
        click(ADD_TO_CARD_ID);
        sleep(5);
        click(POPUP_COMPLATE_SHOPPING_ID);
        sleep(3);
        click(COMPLATE_SHOPPING_ID);
        sleep(2);
    }

}
