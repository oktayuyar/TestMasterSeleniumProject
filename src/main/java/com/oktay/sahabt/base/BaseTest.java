package com.oktay.sahabt.base;

import com.oktay.sahabt.constants.General_Constants;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements General_Constants{

    public WebDriver driver;

    @Before
    public void setup() {
        System.setProperty(DRIVER_NAME, DRIVER_PATH);
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(URL_HEPSIBURADA);
    }

}
