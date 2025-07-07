package pageobject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public SelenideElement loginButton = $x("//button[text()='Войти в аккаунт']");
    public SelenideElement personalCabinetButton = $("[href='/account']");

    public void clickLogin() {
        loginButton.click();
    }
    public void clickPersonalCabinet() {
        personalCabinetButton.click();
    }
}

