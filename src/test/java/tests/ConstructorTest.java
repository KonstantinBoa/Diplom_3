package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.*;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Epic("Stellar Burgers UI")
@Feature("Constructor Tabs")
public class ConstructorTest {

    @Before
    public void setUp() {
        Configuration.browserSize = "1920x1080";
        open("https://stellarburgers.nomoreparties.site/");
        $x("//span[text()='Булки']").shouldBe(visible);
    }

    @Test
    public void goToBunsTabTest() {
        SelenideElement bunsTab = $x("//span[text()='Булки']/ancestor::div[contains(@class, 'tab_tab__1SPyG')]");
        step("Проверяем, что таб 'Булки' активен по умолчанию", () ->
                bunsTab.shouldHave(cssClass("tab_tab_type_current__2BEPc")));
    }

    @Test
    public void goToSaucesTabTest() {
        SelenideElement saucesTab = $x("//span[text()='Соусы']/ancestor::div[contains(@class, 'tab_tab__1SPyG')]");
        step("Клик по табу 'Соусы'", () -> saucesTab.click());
        step("Проверяем, что таб 'Соусы' активен", () ->
                saucesTab.shouldHave(cssClass("tab_tab_type_current__2BEPc")));
    }

    @Test
    public void goToFillingsTabTest() {
        SelenideElement fillingsTab = $x("//span[text()='Начинки']/ancestor::div[contains(@class, 'tab_tab__1SPyG')]");
        step("Клик по табу 'Начинки'", () -> fillingsTab.click());
        step("Проверяем, что таб 'Начинки' активен", () ->
                fillingsTab.shouldHave(cssClass("tab_tab_type_current__2BEPc")));
    }
}
