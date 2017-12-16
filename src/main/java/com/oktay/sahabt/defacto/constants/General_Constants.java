package com.oktay.sahabt.defacto.constants;

import org.openqa.selenium.By;

public interface General_Constants {
    // BaseTest Constants
    String DRIVER_NAME = "webdriver.chrome.driver";
    String DRIVER_PATH= "/home/oktay/ChromeDriver/chromedriver";
    String URL_DEFACTO = "http://www.defacto.com.tr";

    // LoginPage,RegisterPage Constants
    String NAME = "Oktay";
    String SURNAME = "Uyar" ;
    String EMAIL = "oktyuyar@gmail.com";
    String PHONE = "5382997022";
    String PASSWORD = "q1w2e3." ;

    // Regıster Page Constants
    By REGISTER_FIRST_NAME = By.id("RegisterModel_CustomerFirstName");
    By REGISTER_LAST_NAME = By.id("RegisterModel_CustomerLastName");
    By REGISTER_EMAIL_TEXTBOX = By.id("RegisterModel_CustomerEmail");
    By REGISTER_PHONE_TEXTBOX = By.id("RegisterModel_CustomerMobilePhone");
    By REGISTER_DAY_COMBOBOX =By.id("RegisterModel_CustomerBirthDateDay");
    By REGISTER_MOUNTH_COMBOBOX =By.id("RegisterModel_CustomerBirthDateMonth");
    By REGISTER_YEAR_COMBOBOX =By.id("RegisterModel_CustomerBirthDateYear");
    By REGISTER_GENDER_COMBOBOX = By.xpath("/html//form[@id='RegisterForm']//select[@name='RegisterModel.Gender']");
    By REGISTER_PASSWORD_TEXTBOX = By.id("RegisterModel_CustomerPassword");
    By REGISTER_PASSWORD_REPEAT_TEXTBOX = By.id("RegisterModel_CustomerPasswordConfirm");

    By REGISTER_RULES_XPATH = By.xpath("/html//input[@id='RegisterModel_CustomerIsSmsSubscriberAndIsSubscriber']");
    By REGISTER_TERMS_XPATH = By.xpath("/html//input[@id='RegisterModel_CustomerIsApprovedContract']");


    By REGISTER_BUTTON = By.xpath("/html//input[@id='RegisterBtn']");
    String REGISTER_ERROR_MESSAGE = "Kayıt Yapılamadı!";
    String REGISTER_SUCCESS_MESSAGE = "Kayıt Başarılı Bir Şekilde Yapıldı Anasayfadasınız." ;

    // HomePage Constants
    String POPUP_CLASS_NAME = "sp-fancybox-skin";
    String LOGIN_XPATH = "/html/body//section[@class='nav-group']/nav[@role='navigation']//div[@role='toolbar']/div[4]/a[@href='/Login']";
    String REGISTER_XPATH = "/html/body//section[@class='nav-group']/nav[@role='navigation']//div[@role='toolbar']//a[@href='/Login/Register']";
    String LOGIN_PAGE_TITLE = "DeFacto ile Kadın ve Erkek Giyimde Akdeniz Modası";
    String LOGIN_PAGE_ERROR_MESSAGE = "Giriş Ssyfası açılamadı!" ;
    String LOGIN_PAGE_SUCCESS_MESSAGE = "Giriş Sayfası açıldı." ;
    String REGISTER_PAGE_TITLE = "DeFacto ile Kadın ve Erkek Giyimde Akdeniz Modası";
    String REGISTER_PAGE_ERROR_MESSAGE = "Üye Kayıt Sayfası açılamadı!" ;
    String REGISTER_PAGE_SUCCESS_MESSAGE = "Üye Kayıt Sayfası açıldı." ;

    // LoginPage Constants
    By LOGIN_EMAIL_TEXTBOX =By.id("LoginModel_Email");
    By LOGIN_PASSWORD_TEXTBOX =By.id("LoginModel_Password");
    By SUBMIT_BUTTON = By.id("LoginBtn");
    String LOGIN_ERROR_MESSAGE = "Giriş Yapılamadı!";
    String HOME_PAGE_TITLE = "Türkiye'nin En Büyük Online Alışveriş Sitesi";
    String LOGIN_SUCCESS_MESSAGE = "Giriş Başarılı Bir Şekilde Yapıldı Anasayfadasınız." ;


}
