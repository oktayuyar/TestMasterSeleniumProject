package com.oktay.sahabt.hepsiburada.constants;

public interface General_Constants {
    // BaseTest Constants
    String DRIVER_NAME = "webdriver.chrome.driver";
    String DRIVER_PATH= "/home/oktay/ChromeDriver/chromedriver";
    String URL_HEPSIBURADA = "http://www.hepsiburada.com";
    String URL_DEFACTO = "http://www.defacto.com.tr";

    // LoginPage,RegisterPage Constants
    String EMAIL = "oktyuyar@gmail.com";
    String PASSWORD = "q1w2e3." ;

    // HomePage Constants
    String POPUP_CLASS_NAME = "insider-opt-in-notification-button";
    String MY_ACCOUNT_XPATH =  "//div[@id='myAccount']/a[2]" ;
    String LOGIN_XPATH = "/html//a[@id='login']";
    String REGISTER_XPATH = "/html//a[@id='register']";
    String LOGIN_PAGE_TITLE = "Üye Giriş Sayfası";
    String LOGIN_PAGE_ERROR_MESSAGE = "Login Ssyfası açılamadı!" ;
    String LOGIN_PAGE_SUCCESS_MESSAGE = "Login Sayfası açıldı." ;
    String REGISTER_PAGE_TITLE = "Hemen Kayıt Ol!";
    String REGISTER_PAGE_ERROR_MESSAGE = "Üye Kayıt Sayfası açılamadı!" ;
    String REGISTER_PAGE_SUCCESS_MESSAGE = "Üye Kayıt Sayfası açıldı." ;

}
