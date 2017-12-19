package com.oktay.sahabt.defacto.page;

import com.oktay.sahabt.defacto.constants.General_Constants;
import com.oktay.sahabt.defacto.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DefactoPaymentPage extends BasePageUtil implements General_Constants {

    public DefactoPaymentPage(WebDriver driver) {
        super(driver);
    }

    public void complatePayment(){
        setAddressInformation();
        setCardInformation();
    }

    public void setAddressInformation(){
    /*
    setText(By.id("Address_AddressTypeId"),"Ev");
        sleep(2);
        setText(By.id("Address_AddressCityId"),"Hatay");
        sleep(2);
        setText(By.id("Address_AddressCountyId"),"Antakya");
        sleep(2);
        setText(By.id("Address_AddressPostalCode"),"31200");
        sleep(2);
        setText(By.id("Address_AddressText"),"Bozcaada");
        sleep(2);
        setText(By.id("Address_AddressFirstName"),NAME);
        sleep(2);
        setText(By.id("Address_AddressLastName"),SURNAME);
        sleep(2);
        setText(By.id("Address_AddressMobilePhone"),"5382997022");
        sleep(2);
        setText(By.id("Address_AddressIdentityNumber"),"43882239212");
        sleep(2);
        driver.findElement(By.xpath("/html//form[@id='AddressForm']/div[@class='form-group row top15']//input[@value='Kaydet']")).click();
    */
        sleep(2);
        driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div[@class='cursor-pointer']//b[.='Adrese Teslimat']")).click();
        sleep(2);
        driver.findElement(By.xpath("/html/body/section/div[3]//button[@name='ClickCollectID']")).click();
        sleep(2);
    }

    private void setCardInformation() {
        setText(By.id("Payment_CardNumber1"),"4506344220167840");
        sleep(2);
        setText(By.id("Payment_ExpireMonth"),"10");
        sleep(2);
        setText(By.id("Payment_ExpireYear"),"2020");
        sleep(2);
        setText(By.id("Payment_SecurityCode"),"290");
        sleep(2);
        driver.findElement(By.id("IsCreditCardContractEnable")).click();
        sleep(2);
        driver.findElement(By.id("IsMasterPassEnable")).click();
        sleep(2);
        driver.findElement(By.xpath("/html//div[@id='MasterPassIsActive']/div[3]//div[@class='form-horizontal']/div[10]//input[@name='accountAliasName']")).sendKeys("Oktayy Uyar");
        sleep(2);
        driver.findElement(By.xpath("/html//button[@id='CreditCardBtn']"));
    }
}
