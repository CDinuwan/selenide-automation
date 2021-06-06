package selenide;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class SelenideTest {

    @Test
    public void automationTesting(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cdinuwan\\Desktop\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        open("https://explorecalifornia.org/contact.htm");
        $("#name").should(appear);
//        $("#comments").should(appear);

        $("#name").setValue("Chanuka Dinuwan");
//        $("#comments").selectOptionContainingText("Texas");
        $("#backpack").click();
        $(By.name("newsletter")).selectRadio("yes");

        $("#name").shouldHave(value("Chanuka Dinuwan"));
        String state=$("#state").getSelectedText();
        assert(state).equals("Texas");

        $("#backpack").shouldBe(selected);
        $(By.name("newsletter")).shouldHave(value("yes"));
    }
}
