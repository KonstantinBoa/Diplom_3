package pageobject;


import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;


import static com.codeborne.selenide.Selenide.*;

public class ConstructorPage {
    public SelenideElement bunsTab = $x("//span[text()='Булки']/ancestor::div[contains(@class,'tab_tab__1SPyG')]");
    public SelenideElement saucesTab = $x("//span[text()='Соусы']/ancestor::div[contains(@class,'tab_tab__1SPyG')]");
    public SelenideElement fillingsTab = $x("//span[text()='Начинки']/ancestor::div[contains(@class,'tab_tab__1SPyG')]");
    // Кнопка "Оформить заказ"
    public SelenideElement orderButton = $x("//button[contains(@class,'button_button_type_primary_107Bx') and contains(text(), 'Оформить заказ')]");
}
