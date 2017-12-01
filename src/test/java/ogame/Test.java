package ogame;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test {


    @org.testng.annotations.Test
    public static void bot() throws InterruptedException {
        openOgame();
        signIn();
        $(By.id("menuTable")).find(By.tagName("li"), 5).click();
        buildAirShip1();


    }

    private static void buildAirShip1() throws InterruptedException {
        while (true) {
            if (Double.parseDouble($(By.id("resources_metal")).getText()) >= 3.000
                    && Double.parseDouble($(By.id("resources_crystal")).getText()) >= 1.5000) {
                $(By.id("button1")).click();
                $(By.id("number")).setValue("1");
                $(By.className("build-it")).click();
            }
            else{
                Thread.sleep(360000);
            }
        }
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
