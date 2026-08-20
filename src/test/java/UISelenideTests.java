import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UISelenideTests {

    @Test
    public void authorizationTest(){
        Selenide.open("https://staff-go.ru");
        SimpleSelenideTest autorization = new SimpleSelenideTest();
        autorization.resetPasswordTest()
                .clickResetPassword()
                .checkMailBox("test@mail.ru")
                .sendEmail()
                .assertResetPassword();
    }
}
