package testTask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class HelperBase {
    public WebDriver wd;

    public HelperBase(WebDriver wd) {

        this.wd = wd;
    }

    public void pause() throws InterruptedException {
        Thread.sleep(2000);
    }

    public void refresh() {
        wd.navigate().refresh(); //refresh страницы, как enter при нажатии
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).click();
        wd.findElement(locator).sendKeys(text);
    }


    public void click(By locator) {
        wd.findElement(locator).click();
    }
}
