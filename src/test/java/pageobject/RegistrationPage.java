package pageobject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    // Имя
    public SelenideElement nameInput = $x("//label[text()='Имя']/following-sibling::input");
    // Email
    public SelenideElement emailInput = $x("//label[text()='Email']/following-sibling::input");
    // Пароль
    public SelenideElement passwordInput = $x("//label[text()='Пароль']/following-sibling::input");
    // Кнопка "Зарегистрироваться"
    public SelenideElement registerButton = $x("//button[contains(text(),'Зарегистрироваться')]");

    public void setName(String name) { nameInput.setValue(name); }
    public void setEmail(String email) { emailInput.setValue(email); }
    public void setPassword(String password) { passwordInput.setValue(password); }
    public void submitRegistration() { registerButton.click(); }
}
