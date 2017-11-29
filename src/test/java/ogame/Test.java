package ogame;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test {


    @org.testng.annotations.Test
    public static void bot() {
        openOgame();
        signIn();

    }

    private static void openOgame() {
        Configuration.browser = "chrome";
        open("http://ru.ogame.gameforge.com");
    }

    private static void signIn() {
        $(By.id("loginBtn")).click();
        $(By.id("usernameLogin")).setValue("vladimircomment1995@gmail.com");
        $(By.id("passwordLogin")).setValue("EreOo1995");
        $(By.id("serverLogin")).selectOption("Polaris");
        $(By.id("loginSubmit")).click();
    }
}
