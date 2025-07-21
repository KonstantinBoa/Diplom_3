package tests;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import pageobject.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTest {

    @Before
    public void setUp() {
        Configuration.browserSize = "1920x1080";
        open("https://stellarburgers.nomoreparties.site/register");
    }

    @Test
    public void registrationWithValidData() {
        RegistrationPage regPage = new RegistrationPage();
        regPage.setName("TestUser123");
        regPage.setEmail("testuser" + System.currentTimeMillis() + "@mail.ru");
        regPage.setPassword("Qwerty123");
        regPage.submitRegistration();

        // Проверка, что ты перешел на страницу входа после регистрации
        $("h2").shouldHave(text("Вход"));
    }
}
