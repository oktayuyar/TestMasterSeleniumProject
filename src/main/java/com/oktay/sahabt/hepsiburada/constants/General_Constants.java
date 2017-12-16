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

    // Search Page Constants
    By ELECTRONIC_XPATH =By.xpath("//li[@id='elektronik']//span[.='ELEKTRONİK']");
    By COMPUTER_TABLET_XPATH =By.xpath("//li[@id='elektronik']/div//ul[@class='nav-home']/li[1]/a[@href='/bilgisayarlar-c-2147483646']");
    By INPUT_OUTPUT_DEVICES_XPATH =By.xpath("/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//div[@class='items-container']/ul[@class='items']/li[@alt='Çevre Birimleri']/a[@href='/cevre-birimleri-c-3013120']");
    By MAUSE_XPATH = By.xpath("/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//div[@class='items-container']/ul[@class='items']/li[@alt='Mouse']/a[@href='/mouse-c-52']");
    By PAGE_NAVIGATION= By.id("pagination");
    By MAUSE_DETAIL_XPATH = By.xpath("//div[@id='productresults']/div[3]/div/div/div[@class='box-container loader']/div/ul//a[@href='/a4-tech-g3-200n-v-track-siyah-turuncu-kablosuz-mouse-p-BD801509']/figure/img[@alt='A4 Tech G3-200N V-Track Siyah Turuncu Kablosuz Mouse']");
    By PRODUCT_ID = By.id("productSearch");
    String MAUSE_PRODUCT_VALUE = "BD300723";
    By LOGITECH_MAUSE_XPATH= By.xpath("//div[@id='productresults']/div[2]/div/div/div[@class='box-container loader']//ul/li[1]//a[@href='/logitech-m185-nano-optik-kablosuz-mouse-mavi-910-002236-p-BD300723']//button[@class='add-to-basket button small']");
    By SHOPPING_CART_ID = By.id("shoppingCart");
    By INCREASE_CART_XPATH = By.xpath("/html//form[@id='form-item-list']/ul[@class='cart-item-list']//button[@title='Arttır']");
    By COMPLETE_SHOPPING_XPATH =By.xpath("//div[@id='short-summary']//button[@class='btn btn-primary full']/span[@class='text']");
    String IPHONE_PRODUCT_VALUE = "HBV000007PV9M";
    By IPHONE_XPATH= By.xpath("//div[@id='productresults']/div[2]/div/div/div[@class='box-container loader']//ul//a[@href='/apple-iphone-8-plus-64-gb-apple-turkiye-garantili-p-HBV000007PV9M']//div[@class='owl-stage']/div[2]/img[@alt='Apple iPhone 8 Plus 64 GB (Apple Türkiye Garantili)']");
    By ADD_TO_CART_ID = By.id("addToCart");
    By IPHONE_DETAIL_XPATH = By.xpath("//div[@id='productresults']/div[2]/div/div/div[@class='box-container loader']//ul//a[@href='/apple-iphone-8-plus-64-gb-apple-turkiye-garantili-p-HBV000007PV9M']/div[@class='product-detail']");
    String PAYMENT_PAGE_ERROR_MESSAGE = "ÖDeme sayfasına gelmedi!";
    String PAYMENT_PAGE_SUCCESS_MESSAGE = "Ödeme sayfasına başarılı bir şekilde gelindi";
    String PAYMENT_PAGE_TITLE ="Teslimat Bilgileri";

    //

}
