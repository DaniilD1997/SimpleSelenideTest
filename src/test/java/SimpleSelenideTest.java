import com.codeborne.selenide.Condition;
import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Selenide.*;

public class SimpleSelenideTest {
    private SelenideElement btnLK= $x("//button[@class=\"v-btn v-btn--elevated v-theme--light bg-primary v-btn--density-default v-btn--size-default v-btn--variant-elevated app-customizer-toggler\"]");
    private SelenideElement btnResetPassword = $x("//a[@class=\"cursor-pointer text-primary\"]");
    private SelenideElement mailBox = $x("//input[@class=\"v-field__input\"]");
    private SelenideElement btnSendStatus = $x("//button[@class=\"v-btn v-btn--block v-btn--elevated v-theme--light bg-primary v-btn--density-default v-btn--size-default v-btn--variant-elevated\"]");
    private SelenideElement sendOS = $x("//p[@class=\"text-center text-success text-body-1 mb-0\"]");
    private SelenideElement btnTheme = $x("//button[@class=\"v-btn v-btn--icon v-theme--light v-btn--density-default v-btn--size-default v-btn--variant-text me-3\"]//i");
    private SelenideElement btnDarkTheme = $x("//div[@class='v-list-item v-list-item--link v-theme--light v-list-item--density-compact v-list-item--one-line rounded-0 v-list-item--variant-text text-capitalize'][2]");
    private SelenideElement pageColor = $x("//style[@id=\"vuetify-theme-stylesheet\"]");
    private SelenideElement btv =   $(":root");

    public SimpleSelenideTest resetPasswordTest(){
        btnLK.click();
        return this;
    }
    public SimpleSelenideTest clickResetPassword(){
        btnResetPassword.click();
        return this;
    }

    public SimpleSelenideTest checkMailBox(String email){
        mailBox.click();
        mailBox.sendKeys(email);
        return this;
    }

    public SimpleSelenideTest sendEmail(){
        btnSendStatus.click();
        return this;
    }

    public void assertResetPassword(){
        sendOS.should(Condition.text("Сообщение успешно отправлено на указанный электронный адрес"));//test
    }

    public SimpleSelenideTest listTopics(){
        btnTheme.click();
        return this;
    }

    public SimpleSelenideTest darkTheme(){
        btnDarkTheme.click();
        return this;
    }

    public void assertPageColor(String propertyName, String expectedColorTheme){
        // pageColor.should(Condition.text(color));
        btv.should(cssValue(propertyName, expectedColorTheme));
    }



}
