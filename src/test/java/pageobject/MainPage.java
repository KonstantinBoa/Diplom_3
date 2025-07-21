package pageobject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    // Кнопка "Лента заказов" (feed)
    public SelenideElement feedButton = $("a.AppHeader_header__link__3D_hX[href='/feed']");
    // Кнопка "Личный кабинет"
    public SelenideElement personalCabinet = $("a.AppHeader_header__link__3D_hX[href='/account']");
    // Кнопка "Войти в аккаунт" (на главной, если не авторизован)
    public SelenideElement loginButton = $("button.button_button_type_primary__1O7Bx"); // работает и для формы логина и для "Войти в аккаунт"
    // Логотип (SVG)
    public SelenideElement logo = $("a.AppHeader_header__link__3D_hX[href='/']");
    // Ссылка "Конструктор" (главная)
    public SelenideElement constructorLink = $("a.AppHeader_header__link__3D_hX[href='/']");
}
