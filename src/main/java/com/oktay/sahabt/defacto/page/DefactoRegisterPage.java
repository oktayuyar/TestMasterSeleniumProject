package com.oktay.sahabt.defacto.page;

import com.oktay.sahabt.defacto.constants.General_Constants;
import com.oktay.sahabt.defacto.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DefactoRegisterPage extends BasePageUtil implements General_Constants {

    public DefactoRegisterPage(WebDriver driver) {
        super(driver);
    }

    public void register() {
        setText(REGISTER_FIRST_NAME,NAME);
        setText(REGISTER_LAST_NAME,SURNAME);
        setText(REGISTER_EMAIL_TEXTBOX,EMAIL);
        setText(REGISTER_PHONE_TEXTBOX,PHONE);
        setText(REGISTER_DAY_COMBOBOX,"22");
        setText(REGISTER_MOUNTH_COMBOBOX,"8");
        setText(REGISTER_YEAR_COMBOBOX,"1994");
        setText(REGISTER_GENDER_COMBOBOX,"Erkek");
        setText(REGISTER_PASSWORD_TEXTBOX,PASSWORD);
        setText(REGISTER_PASSWORD_REPEAT_TEXTBOX,PASSWORD);
        clickElement(REGISTER_RULES_XPATH);
        clickElement(REGISTER_TERMS_XPATH);
        clickElement(REGISTER_BUTTON);

    }
}
