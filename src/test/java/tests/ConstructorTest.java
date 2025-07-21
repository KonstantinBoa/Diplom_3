package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.*;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


@Epic("Stellar Burgers UI")
@Feature("Constructor Tabs")
public class ConstructorTest {

    @Before
    public void setUp() {
        Configuration.browserSize = "1920x1080";
        open("https://stellarburgers.nomoreparties.site/login");
        $("[name='name']").setValue("screwy4@yandex.ru");
        $("[type='password']").setValue("12345678");
        $("button.button_button_type_primary__1O7Bx").click();
    }

    @Test
    @Story("Go to buns tab")
    @Owner("Твоё Имя")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Клик по табу 'Булки' и проверка, что таб активен")
    public void goToBunsTabTest() {
        step("Клик по табу 'Булки'", () -> {
            $x("//span[text()='Булки']/ancestor::div[contains(@class,'tab_tab__1SPyG')]").click();
        });
        step("Проверка, что таб 'Булки' активен", () -> {
            $x("//span[text()='Булки']/ancestor::div[contains(@class,'tab_tab_type_current__2BEPc')]").shouldBe(visible);
        });
    }
}
