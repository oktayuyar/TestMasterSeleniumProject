package com.oktay.sahabt.hepsiburada.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.log4j.Logger;

public class BasePageUtil {

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

    public void quit(){
        driver.quit();
    }

    public void sleep(int second){
        try {
            Thread.sleep(second*1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

}
