package tests;

import org.junit.Before;
import org.junit.Test;
import pageobject.MainPage;
import utils.BrowserConfig;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    @Before
    public void setUp() {
        BrowserConfig.setUp("chrome"); // или "yandex"
        open("https://stellarburgers.nomoreparties.site/");
    }

    @Test
    public void canLoginFromMainPage() {
        MainPage mainPage = new MainPage();
        mainPage.clickLogin();
        // Здесь продолжаешь тест: заполняешь поля, проверяешь результат
    }
}

