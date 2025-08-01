package utils;

import com.codeborne.selenide.Configuration;

public class BrowserConfig {
    public static void setUp(String browser) {
        Configuration.browser = browser;
        Configuration.timeout = 8000;
        Configuration.browserSize = "1920x1080"; // Новый способ, вместо startMaximized
    }
}

