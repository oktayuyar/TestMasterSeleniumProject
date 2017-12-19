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
        driver.findElement(By.cssSelector("._mCS_9 li:nth-of-type(1) gt")).click();
        sleep(2);
        driver.findElement(By.cssSelector("._mCS_17 li:nth-of-type(8) gt")).click();
        sleep(2);
        driver.findElement(By.cssSelector("#facetAccordion .panel-default:nth-of-type(5) [data-toggle]")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@id='fx_c']/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Mavi']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@id='fx_c']/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Çivit Mavisi']")).click();
        sleep(2);
        driver.findElement(By.xpath("/html//section[@id='fixed']//a[@href='/cift-cepli-dar-kalip-gomlek-780010']/figure//h2[.='Çift Cepli Dar Kalıp Gömlek']")).click();
        sleep(2);
        driver.findElement(By.xpath("/html//section[@id='fixed']/div[5]/div/div//ul[@class='productSizes productWidthHeight top15']/li[4]/a[@href='javascript:;']/span[.='L']")).click();
        sleep(2);
        setText(By.id("Quantity"),"2");
        sleep(3);
        driver.findElement(By.id("addToCart")).click();
        sleep(2);
        driver.findElement(By.id("popupBasket_ComplateShopping")).click();
        sleep(2);
        driver.findElement(By.id("ComplateShoppingDown")).click();
        sleep(2);
    }

}
