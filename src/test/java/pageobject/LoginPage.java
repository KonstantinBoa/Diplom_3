package pageobject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    // Инпут Email
    public SelenideElement emailInput = $x("//label[text()='Email']/following-sibling::input");
    // Инпут Пароль
    public SelenideElement passwordInput = $x("//label[text()='Пароль']/following-sibling::input");
    // Кнопка "Войти"
    public SelenideElement loginButton = $x("//button[contains(text(),'Войти')]");

    public void setEmail(String email) { emailInput.setValue(email); }
    public void setPassword(String password) { passwordInput.setValue(password); }
    public void submitLogin() { loginButton.click(); }
}
