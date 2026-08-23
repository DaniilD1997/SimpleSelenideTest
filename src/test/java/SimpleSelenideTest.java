import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class SimpleSelenideTest {
    private SelenideElement btnLK= $x("//button[@class=\"v-btn v-btn--elevated v-theme--light bg-primary v-btn--density-default v-btn--size-default v-btn--variant-elevated app-customizer-toggler\"]");
    private SelenideElement btnResetPassword = $x("//a[@class=\"cursor-pointer text-primary\"]");
    private SelenideElement mailBox = $x("//input[@class=\"v-field__input\"]");
    private SelenideElement btnSendStatus = $x("//button[@class=\"v-btn v-btn--block v-btn--elevated v-theme--light bg-primary v-btn--density-default v-btn--size-default v-btn--variant-elevated\"]");
    private SelenideElement sendOS = $x("//p[@class=\"text-center text-success text-body-1 mb-0\"]");


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
        sendOS.should(Condition.text("Сообщение успешно отправлено на указанный электронный адрес"));//1
    }
}
