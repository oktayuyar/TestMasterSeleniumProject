package com.oktay.sahabt.hepsiburada.util;

import com.oktay.sahabt.hepsiburada.constants.General_Constants;
import org.openqa.selenium.*;
import org.apache.log4j.Logger;
import java.util.List;

public class BasePageUtil implements General_Constants{

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

    public List<WebElement> getBadgets(){
        List<WebElement> items=driver.findElements(By.className("badge-box"));
        log.info("Badgets");
        for(WebElement e: items){
            System.out.println(e.getText());
        }
        return items;
    }

    // ekranı aşağıdan yukarı kaydırmak için
    public void swipeUp(){
    }

    public void clickItemOfPaginations(){
        for (int i=2;i<8;i++) {
            swipeUp();
            sleep(3);
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
