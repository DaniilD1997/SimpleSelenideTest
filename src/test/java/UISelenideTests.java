import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UISelenideTests {
    SimpleSelenideTest simpleSelenideTest = new SimpleSelenideTest();

    @BeforeEach
    public void openPage(){
        Selenide.open("https://staff-go.ru");
    }


    @Test
    public void reserPasswordTest(){
        simpleSelenideTest.resetPasswordTest()
                .clickResetPassword()
                .checkMailBox("test@mail.ru")
                .sendEmail()
                .assertResetPassword();
    }

    @Test
    public void switchTheme(){
        String color = "dark";
        String propertyName = "color-scheme";
        simpleSelenideTest.listTopics()
                .darkTheme()
                .assertPageColor(propertyName, color);

    }

}
