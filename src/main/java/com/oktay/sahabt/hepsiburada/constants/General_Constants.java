package com.oktay.sahabt.hepsiburada.constants;

import org.openqa.selenium.By;

public interface General_Constants {
    // BaseTest Constants
    String DRIVER_NAME = "webdriver.chrome.driver";
    String DRIVER_PATH= "/home/oktay/ChromeDriver/chromedriver";
    String URL_HEPSIBURADA = "http://www.hepsiburada.com";
    String URL_DEFACTO = "http://www.defacto.com.tr";

    // LoginPage,RegisterPage Constants
    String NAME = "OKtay";
    String SURNAME = "Uyar" ;
    String EMAIL = "oktyuyar@gmail.com";
    String PASSWORD = "q1w2e3." ;

    // Regıster Page Constants
    By REGISTER_FIRST_NAME = By.id("firstname");
    By REGISTER_LAST_NAME = By.id("lastname");
    By REGISTER_EMAIL_TEXTBOX = By.id("email-register");
    By REGISTER_PASSWORD_TEXTBOX = By.id("password-register");
    By REGISTER_PASSWORD_REPEAT_TEXTBOX = By.id("password-repeat");
    By REGISTER_BUTTON = By.xpath("//form[@id='form-user']//button[@type='submit']");
    By AFTER_REGISTER_POPUP = By.xpath("//div[@id='registrationPopup']/div[@class='buttons']/a[2]");
    String REGISTER_ERROR_MESSAGE = "Kayıt Yapılamadı!";
    String REGISTER_SUCCESS_MESSAGE = "Kayıt Başarılı Bir Şekilde Yapıldı Anasayfadasınız." ;

    // HomePage Constants
    String POPUP_CLASS_NAME = "insider-opt-in-notification-button";
    String MY_ACCOUNT_XPATH =  "//div[@id='myAccount']/a[2]" ;
    String LOGIN_XPATH = "/html//a[@id='login']";
    String REGISTER_XPATH = "/html//a[@id='register']";
    String LOGIN_PAGE_TITLE = "Üye Giriş Sayfası";
    String LOGIN_PAGE_ERROR_MESSAGE = "Giriş Ssyfası açılamadı!" ;
    String LOGIN_PAGE_SUCCESS_MESSAGE = "Giriş Sayfası açıldı." ;
    String REGISTER_PAGE_TITLE = "Hemen Kayıt Ol!";
    String REGISTER_PAGE_ERROR_MESSAGE = "Üye Kayıt Sayfası açılamadı!" ;
    String REGISTER_PAGE_SUCCESS_MESSAGE = "Üye Kayıt Sayfası açıldı." ;


    // LoginPage Constants
    By EMAIL_TEXTBOX = By.id("email");
    By PASSWORD_TEXTBOX = By.id("password");
    By SUBMIT_BUTTON = By.cssSelector("#form-login button");
    String LOGIN_ERROR_MESSAGE = "Giriş Yapılamadı!";
    String HOME_PAGE_TITLE = "Türkiye'nin En Büyük Online Alışveriş Sitesi";
    String LOGIN_SUCCESS_MESSAGE = "Giriş Başarılı Bir şekilde Yapıldı Anasayfadasınız." ;

}
