package com.oktay.sahabt.hepsiburada.util;

import com.oktay.sahabt.hepsiburada.constants.General_Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public List<WebElement> getItemOfPaginations(){
        List<WebElement> items=driver.findElements(PAGE_NAVIGATION);
        System.out.println(items.toArray());
        return items;
    }

    public void clickItemOfPaginations(List<WebElement> items){
        for (int i=0;i<items.size();i++) {
            sleep(10);
            items.get(i).click();

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
