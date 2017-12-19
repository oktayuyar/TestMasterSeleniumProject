package com.oktay.sahabt.hepsiburada.constants;

import org.openqa.selenium.By;

public interface General_Constants {
    // BaseTest Constants
    String DRIVER_NAME = "webdriver.chrome.driver";
    String DRIVER_PATH= "/home/oktay/ChromeDriver/chromedriver";
    String URL_HEPSIBURADA = "http://www.hepsiburada.com";

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
    String COMPUTER_TABLET_PAGE_TITLE ="Bilgisayar Fiyatları ve Modelleri";
    String COMPUTER_TABLET_PAGE_MESSAGE= "Bilgisayar ve Tablet kategorisine tıklandı";
    String COMPUTER_TABLET_PAGE_ERROR_MESSAGE ="Bilgisayar ve Tablet kategorisine tıklanamadı!";
    By INPUT_OUTPUT_DEVICES_XPATH =By.xpath("/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//div[@class='items-container']/ul[@class='items']/li[@alt='Çevre Birimleri']/a[@href='/cevre-birimleri-c-3013120']");
    String INPUT_OUTPUT_DEVICES_PAGE_TITLE ="Klavye, Mouse, Tarayıcı";
    String INPUT_OUTPUT_DEVICES_PAGE_MESSAGE= "Çevre Birimleri kategorisine tıklandı";
    String INPUT_OUTPUT_DEVICES_ERROR_MESSAGE ="Çevre Birimleri kategorisine tıklanamadı!";
    String MOUSE_PAGE_TITLE ="En Ucuz ve İndirimli Mouse Modelleri";
    String MOUSE_PAGE_MESSAGE= "Mouse kategorisine tıklandı";
    String MOUSE_ERROR_MESSAGE ="Mouse kategorisine tıklanamadı!";

    By MOUSE_XPATH = By.xpath("/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//div[@class='items-container']/ul[@class='items']/li[@alt='Mouse']/a[@href='/mouse-c-52']");
    By PAGE_NAVIGATION= By.className("page");
    By MOUSE_DETAIL_XPATH = By.cssSelector("[href=\"\\/razer-lancehead-tournament-edition-rgb-optik-gaming-mouse-p-HBV000006FUU9\"] .product-title span");
    String MOUSE_DETAIL_PAGE_TITLE ="Razer Lancehead Tournament Edition RGB Optik Gaming Mouse";
    String MOUSE_DETAIL_PAGE_MESSAGE= "Razer Lancehead Tournament Edition RGB Optik Gaming Mouse Detayları";
    String MOUSE_DETAIL_ERROR_MESSAGE ="Razer Lancehead Tournament Edition RGB Optik Gaming Mouse tıklanamadı!";

    By PRODUCT_ID = By.id("productSearch");
    String MOUSE_PRODUCT_VALUE = "BD300723";
    String LOGITECH_MOUSE_PAGE_TITLE ="Logitech® M185 Nano Optik Kablosuz Mouse Mavi (910-002236)";
    String LOGITECH_MOUSE_PAGE_MESSAGE= "Logitech® M185 Nano Optik Kablosuz Mouse Mavi (910-002236) bulundu";
    String LOGITECH_MOUSE_ERROR_MESSAGE ="Logitech® M185 Nano Optik Kablosuz Mouse Mavi (910-002236) bulunamadı!";
    By LOGITECH_MOUSE_XPATH= By.xpath("//div[@id='productresults']/div[2]/div/div/div[@class='box-container loader']//ul/li[1]//a[@href='/logitech-m185-nano-optik-kablosuz-mouse-mavi-910-002236-p-BD300723']//button[@class='add-to-basket button small']");

    By SHOPPING_CART_ID = By.id("shoppingCart");
    By INCREASE_CART_XPATH = By.xpath("/html//form[@id='form-item-list']/ul[@class='cart-item-list']//button[@title='Arttır']");
    By COMPLETE_SHOPPING_XPATH =By.xpath("//div[@id='short-summary']//button[@class='btn btn-primary full']/span[@class='text']");
    String SHOPPING_CART_PAGE_TITLE = "Sepetim";
    String SHOPPING_CART_PAGE_MESSAGE = "Sepetim açıldı";
    String SHOPPING_CART_PAGE_ERROR_MESSAGE = "Sepetim açılamadı!";

    String IPHONE_PRODUCT_VALUE = "HBV000007PV9M";
    By IPHONE_XPATH= By.xpath("//div[@id='productresults']/div[2]/div/div/div[@class='box-container loader']//ul//a[@href='/apple-iphone-8-plus-64-gb-apple-turkiye-garantili-p-HBV000007PV9M']//div[@class='owl-stage']/div[2]/img[@alt='Apple iPhone 8 Plus 64 GB (Apple Türkiye Garantili)']");
    By ADD_TO_CART_ID = By.id("addToCart");
    By IPHONE_DETAIL_XPATH = By.xpath("//div[@id='productresults']/div[2]/div/div/div[@class='box-container loader']//ul//a[@href='/apple-iphone-8-plus-64-gb-apple-turkiye-garantili-p-HBV000007PV9M']/div[@class='product-detail']");
    String SHOE_PRODUCT_VALUE = "Ayakkabı";
    String MAN_PRODUCT_TITLE= "Erkek Ürünleri";
    String MAN_PRODUCT_PAGE_MESSAGE = "Erkek Ürünlerine başarılı bir şekilde tıklandı";
    String MAN_PRODUCT_PAGE_ERROR_MESSAGE = "Erkek Ürünleri tıklanamadı!";
    String MAN_SHOE_MODELS_TITLE= "Erkek Ayakkabı Modelleri" ;
    String MAN_SHOE_MODELS_MESSAGE ="Erkek ayakkabı modelleri tıklandı";
    String MAN_SHOE_MODELS_ERROR_MESSAGE ="Erkek ayakkabı modelleri tıklanamadı!";
    String DAILY_MAN_SHOE_MODELS_TITLE= "Günlük Erkek Ayakkabı Modelleri";
    String DAILY_MAN_SHOE_MODELS_MESSAGE ="Günlük erkek ayakkabı modelleri tıklandı";
    String DAILY_MAN_SHOE_MODELS_ERROR_MESSAGE ="Erkek ayakkabı modelleri tıklanamadı!";
    String BRAND_OF_SHOE_VALUE = "Dockers";



    By MAN_XPATH=By.xpath("//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//div[@class='items-container']/ul[@class='items']/li[@alt='Erkek']/a[@href='/erkek-giyim-modelleri-c-12087177']/span[1]");
    By MAN__SHOE_XPATH=By.xpath("//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//div[@class='items-container']/ul[@class='items']/li[@alt='Erkek Ayakkabı']/a[@href='/ayakkabi-c-60000117']/span[1]");
    By DAILY_SHOE_XPATH = By.xpath("/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//div[@class='items-container']/ul[@class='items']/li[@alt='Günlük Ayakkabı']/a[@href='/erkek-gunluk-ayakkabilar-c-60000126']");
    By SEARCH_BRAND_OF_SHOE_XPATH = By.xpath("/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div/div[@class='loader']/ol[@class='filters-container']/li[@class='box-container brand']//input[@placeholder='Marka ara']");
    By SELECT_BRAND_OF_SHOE_XPATH = By.xpath("//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div/div[@class='loader']/ol[@class='filters-container']/li[@class='box-container brand']/ol/li[@alt='Dockers']/label/span[@class='filter-text']");
    By MIN_SHOE_PRICE_XPATH = By.xpath("/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div/div[@class='loader']/ol[@class='filters-container']/li[@class='box-container fiyat']//input[@placeholder='En az']");
    String  MIN_SHOE_PRICE_VALUE = "250";
    String  MAX_SHOE_PRICE_VALUE = "500";
    By MAX_SHOE_PRICE_XPATH = By.xpath("/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div/div[@class='loader']/ol[@class='filters-container']/li[@class='box-container fiyat']//input[@placeholder='En çok']");
    By SEARCH_PRICE_XPATH = By.xpath("/html//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div/div[@class='loader']/ol[@class='filters-container']/li[@class='box-container fiyat']//button");
    By SHOE_COLOR_XPATH = By.xpath("//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//ol[@class='filters-container']/li[@class='box-container color-palette renk']/ol/li[@alt='Kahverengi']/label");
    By SHOE_NUMBER_XPATH = By.xpath("//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//ol[@class='filters-container']/li[@class='box-container numara']/ol/li[@alt='44']/label");
    By SHOE_STORE_XPATH =By.xpath("//div[@id='productResult']//section[@class='page-options']/div[@class='filter-box-container']/div[2]/div//ol[@class='filters-container']/li[@class='box-container satici']/ol/li[@alt='Moda Ateşi']/label");
    By SELECTED_SHOE_XPATH = By.xpath("//div[@id='productresults']/div[3]/div/div/div[@class='box-container loader']//ul/div/li/div/a[@href='/dockers-6p-220370-m-k-kah-ayakkabi-p-HBV000002NL6N?magaza=Moda%20Ate%C5%9Fi']//span[@class='price product-price']");
    String SELECTED_SHOE_MESSAGE = "Dockers 6P 220370 M K Kah Ayakkabı ayakkabı seçildi!";
    String SELECTED_SHOE_ERROR_MESSAGE = "İstenilen ayakkabı seçilemedi!";
    String SELECTED_SHOE_TITLE = "Dockers 6P 220370 M K Kah Ayakkabı" ;

    //Payment
    String DELIVERY_PAGE_ERROR_MESSAGE = "Teslimat sayfası gelmedi!";
    String DELIVERY_PAGE_SUCCESS_MESSAGE = "Teslimat sayfasına başarılı bir şekilde geçildi";
    String DELIVERY_PAGE_TITLE ="Teslimat Bilgileri";
    String PAYMENT_PAGE_ERROR_MESSAGE = "Ödeme sayfasına gelmedi!";
    String PAYMENT_PAGE_SUCCESS_MESSAGE = "Ödeme sayfasına başarılı bir şekilde geçildi";
    String PAYMENT_PAGE_TITLE ="Ödeme Bilgileri";
    By NAME_TEXTBOX = By.id("first-name");
    By SURNAME_TEXTBOX = By.id("last-name");
    By ADDRESS_TEXTBOX = By.id("address");
    By ADDRESS_NAME_TEXTBOX = By.id("address-name");
    By PHONE_TEXTBOX = By.id("phone");
    By TOWN_DROPDOWN_MENU_XPATH= By.xpath("//form[@id='form-address']//div[@class='box-content']/section[2]/div[3]/div[@class='controls']/div/button[@title='ADALAR']/span[@class='filter-option pull-left']");
    By CONTINUE_PAYMENT_XPATH= By.xpath("//div[@id='short-summary']//button[@class='btn btn-primary full']/span[@class='text']");
    String ADDRESS_VALUE= "Adalar";
    String ADDRESS_NAME_VALUE ="Adalar İstanbul";
    String PHONE_VALUE = "05382997000";


    By CARD_NUMBER_ID = By.id("card-no");
    String CARD_NUMBER = "4506344220167040";
    By CARD_NAME_XPATH = By.xpath("/html//input[@id='holder-Name']");
    String CARD_NAME = "Oktay Uyar";
    By MOUNTH_XPATH = By.xpath("/html//form[@id='form-credit-card']//div[@class='date-col group']/div[1]/div/button[@title='Ay']/span[@class='filter-option pull-left']");
    By SELECTED_MOUNTH_XPATH = By.xpath("/html//form[@id='form-credit-card']//div[@class='date-col group']/div[1]/div/div/ul[@role='menu']/li[@rel='10']/a[@class='']");
    By YEAR_XPATH = By.xpath("/html//form[@id='form-credit-card']//div[@class='date-col group']/div[2]/div/button[@title='Yıl']/span[@class='filter-option pull-left']");
    By SELECTED_YEAR_XPATH = By.xpath("/html//form[@id='form-credit-card']//div[@class='date-col group']/div[2]/div/div/ul[@role='menu']/li[@rel='6']/a[@class='']");
    By CCV_ID = By.id("cvc");
    String CCV= "173";
    By CONTINUE_XPATH =By.xpath("/html//div[@id='short-summary']//button[@class='btn btn-primary full']");

    String  PAYMENT_INFORMATION_TITLE = "Ödeme Bilgileri";
    String PAYMENT_INFORMATION_PAGE_ERROR_MESSAGE ="Ödeme Bilgileri Sayfası gelmedi!";
    String PAYMENT_INFORMATION_PAGE_MESSAGE = "Ödeme Bilgileri Sayfasına başarılı bir şekilde geçildi!";


}
