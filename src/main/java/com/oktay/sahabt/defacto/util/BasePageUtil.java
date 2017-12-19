package com.oktay.sahabt.defacto.util;

import com.oktay.sahabt.defacto.constants.General_Constants;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePageUtil implements General_Constants {

    protected WebDriver driver;
    protected final Logger log = Logger.getLogger(getClass().getName());

    public BasePageUtil(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickElement(By by) {
        find(by).click();
    }

    public void click(By by){ driver.findElement(by).click(); }

    public void submit(By by) {
        driver.findElement(by).submit();
    }

    public void setText(By by,String value){
        driver.findElement(by).sendKeys(value);
    }

    // Elementin bulunduğu lokasyona gidiyor
    public WebElement find(By by){
        WebElement element=driver.findElement(by);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        return element;
    }

    public List<WebElement> getFılters(){
        List<WebElement> items=driver.findElements(By.className("appliedFilter"));
        log.info("Uygulanan Filtreler");
        for(WebElement e: items){
            System.out.println(e.getText());
        }
        return items;
    }

    public void getBadgets(){

        String badge="";
        String badges;
        System.out.println("\nProduct Featured Details\n");
        List<WebElement> allBadges = driver.findElements(By.xpath("//div[@id='badges']/div/a/span/img"));
        for (WebElement e : allBadges)
        {
            badges = e.getAttribute("src");

            if (badges.contains("icon_1497508515143.png"))
                badge += "hepsiexpress Bugün Teslimat Seçeneği";
            else if (badges.contains("kolay_iade.png"))
                badge += "Kolay İade";
            else if (badges.contains("fast_shipping.png"))
                badge += "Süper Hızlı";
            else if (badges.contains("world_25.png"))
                badge += "25TL World Puan WORLD";
            else if (badges.contains("sinirli_stok.png"))
                badge += "Sınırlı Stok";
            else if (badges.contains("freeshipping_1511595771936.png"))
                badge += "Kargo Bedava";
            else if (badges.isEmpty()){
                badge += "Product Featured Details is Empty";
            }
            else{
                badge = badges;
            }

            log.info(badge);
        }
    }

    public void controlSearchWithProductId(String productId){
        if(driver.getCurrentUrl().contains("q="+productId)){
            log.info(productId+" nolu ürün başarılı bir şekilde aratıldı.");
        }
        else {
            log.fatal(productId+" nolu ürün aratılamadı!");
        }
    }

    // ekranı aşağıdan yukarı kaydırmak için
    public void swipeUp(){
        ((JavascriptExecutor) driver).executeScript("scroll(0,2500);");
    }

    public void clickItemOfPaginations(){
        for (int i=2;i<8;i++) {
            swipeUp();
            sleep(3);
            swipeUp();
            clickElement(By.className("page-"+i));
        }
    }

    public void sleep(int second){
        try {
            Thread.sleep(second*1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

}
