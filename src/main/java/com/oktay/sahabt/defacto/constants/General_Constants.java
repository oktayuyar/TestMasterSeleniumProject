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
    String LOGIN_PAGE_TITLE = "Alışverişe Devam Et!";
    String LOGIN_PAGE_ERROR_MESSAGE = "Giriş Sayfası açılamadı!" ;
    String LOGIN_PAGE_SUCCESS_MESSAGE = "Giriş Sayfası açıldı." ;
    String REGISTER_PAGE_TITLE = "DeFacto ile Kadın ve Erkek Giyimde Akdeniz Modası";
    String REGISTER_PAGE_ERROR_MESSAGE = "Üye Kayıt Sayfası açılamadı!" ;
    String REGISTER_PAGE_SUCCESS_MESSAGE = "Üye Kayıt Sayfası açıldı." ;
    By HOME_PAGE_MAN_XPATH = By.xpath("//div[@id='navbar-collapse-grid']/ul[@class='nav navbar-nav']//span[.='ERKEK']");
    String CLICK_MAN_LOG_INFO = "Erkeğe tıklandı.";

    // LoginPage Constants
    By LOGIN_EMAIL_TEXTBOX =By.id("LoginModel_Email");
    By LOGIN_PASSWORD_TEXTBOX =By.id("LoginModel_Password");
    By SUBMIT_BUTTON = By.id("LoginBtn");
    String LOGIN_ERROR_MESSAGE = "Giriş Yapılamadı!";
    String HOME_PAGE_TITLE = "DeFacto ile Kadın ve Erkek Giyimde Akdeniz Modası";
    String LOGIN_SUCCESS_MESSAGE = "Giriş Başarılı Bir Şekilde Yapıldı. Anasayfadasınız." ;

    // Search Page
    By CLOTHING_CSS_SELECTOR = By.cssSelector("._mCS_9 li:nth-of-type(1) gt");
    By SHIRT_CSS_SELECTOR = By.cssSelector("._mCS_17 li:nth-of-type(8) gt");
    By MODEL_CSS_SELECTOR=By.cssSelector("#facetAccordion .panel-default:nth-of-type(5) [data-toggle]");
    By COLOR_OF_SHIRT_XPATH=By.xpath("//div[@id='fx_c']/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Mavi']");
    By ANOTHER_COLOR_OF_SHIRT_XPATH=By.xpath("//div[@id='fx_c']/div/div/div/div[@class='mCSB_container']/div[@id='boutique-category']/ul[@class='navbar-default']//gt[.='Çivit Mavisi']");
    By SELECTED_SHIRT_XPATH=By.xpath("/html//section[@id='fixed']//a[@href='/cift-cepli-dar-kalip-gomlek-780010']/figure//h2[.='Çift Cepli Dar Kalıp Gömlek']");
    By SIZE_OF_SHIRT_XPATH =By.xpath("/html//section[@id='fixed']/div[5]/div/div//ul[@class='productSizes productWidthHeight top15']/li[4]/a[@href='javascript:;']/span[.='L']");
    By QUANTITY_ID = By.id("Quantity");
    By ADD_TO_CARD_ID = By.id("addToCart");
    By POPUP_COMPLATE_SHOPPING_ID =By.id("popupBasket_ComplateShopping");
    By COMPLATE_SHOPPING_ID =By.id("ComplateShoppingDown");
    String CLOTHING_LOG_INFO="Giyim kategorisine tıkladınız";
    String SHIRT_LOG_INFO = "Gömlek kategorisine tıkladınız";
    String COLOR_LOG_INFO="Mavi Renk seçeneğine tıkladınız";

    // Payment Page
    By CLICK_FOR_SET_ADDRESS_INFORMATION_XPATH = By.xpath("/html/body/section/div[2]/div[1]/div[@class='cursor-pointer']//p[@class='no-margin pb10 pt6']");
    By ADDRESS_TYPE_ID =By.id("Address_AddressTypeId");
    By ADDRESS_CITY_ID =By.id("Address_AddressCityId");
    By ADDRESS_COUNTY_ID =By.id("Address_AddressCountyId");
    By ADDRESS_POSTAL_CODE_ID =By.id("Address_AddressPostalCode");
    By ADDRESS_TEXT_ID =By.id("Address_AddressText");
    By ADDRESS_FIRST_NAME_ID =By.id("Address_AddressFirstName");
    By ADDRESS_LAST_NAME_ID =By.id("Address_AddressLastName");
    By ADDRESS_MOBILE_PHONE_ID =By.id("Address_AddressMobilePhone");
    By ADDRESS_IDENTITY_NUMBER_ID =By.id("Address_AddressIdentityNumber");
    By SAVE_ADDRESS_INFORMATION_XPATH = By.xpath("/html//form[@id='AddressForm']/div[@class='form-group row top15']//input[@value='Kaydet']");
    By SELECT_TYPE_OF_DELIVERY_XPATH= By.xpath("/html/body/section/div[2]/div[1]/div[@class='cursor-pointer']//b[.='Adrese Teslimat']");
    By CLICK_GO_TO_PAY_XPATH=By.xpath("/html/body/section/div[3]//button[@name='ClickCollectID']");
    By PAYMENT_CARD_NUMBER_ID = By.id("Payment_CardNumber1");
    By PAYMENT_EXPIRE_MONTH_ID= By.id("Payment_ExpireMonth");
    By PAYMENT_EXPIRE_YEAR_ID= By.id("Payment_ExpireYear");
    By PAYMENT_SECURITY_CODE_ID= By.id("Payment_SecurityCode");
    By CREDIT_CARD_CONTRACT_ENABLE_ID= By.id("IsCreditCardContractEnable");
    By MASTER_PASS_ENABLE_ID= By.id("IsMasterPassEnable");
    By ACCOUNT_ALIAS_NAME_XPATH= By.xpath("/html//div[@id='MasterPassIsActive']/div[3]//div[@class='form-horizontal']/div[10]//input[@name='accountAliasName']");
    By CREDIT_CARD_BUTTON= By.xpath("/html//button[@id='CreditCardBtn']");
    String ADDRESS_LOG_INFO= "Sisteme kayıtlı adresiniz bulunmaktadır.Bir sonraki adıma geçebilirsiniz.";
    String DELIVERY_ADDRESS_LOG_INFO="Teslimat Adresi Sayfasındayız";
    String PAYMENT_LOG_INFO= "Ödeme Sayfasındayız";
    String SUCCESS_LOG_INFO="Ödeme adımlarını başarı ile geçtiniz.Siparişiniz alınmıştır.";
}
