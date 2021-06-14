/*package testTask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class SearchItemTestBeforeCleaning {
    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        wd.navigate().to("https://yandex.ru/");

    }

    @Test
    public void itemTest() throws InterruptedException {
        click(By.cssSelector("[data-id='market']"));

        switchToNextTab();
        click(By.cssSelector("[href='/catalog--elektronika/54440']"));
        click(By.cssSelector("[data-id='button-all']")); // закрытие всплывающего окна
       /* Actions actions = new Actions(wd);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();*/ // to move page down
     /*   click(By.cssSelector("[href='/catalog--smartfony/16814639/list?glfilter=4940921%3A13475069&hid=91491']"));
        type(By.cssSelector("#glpricefrom"), "20000");
        type(By.cssSelector("#glpriceto"), "35000");
        click(By.xpath("//span[text()='Apple']"));
        wd.navigate().refresh(); //refresh страницы, как enter при нажатии
        Thread.sleep(2000);

        String itemName = wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet'][2]//h3")).getText();

        typeInSearchInputField(itemName);
        String foundItemName = wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet'][1]//h3")).getText();
        Assert.assertEquals(foundItemName,itemName);
    }

    private void typeInSearchInputField(String itemName) {
        type(By.cssSelector("#header-search"),itemName);
        click(By.cssSelector("[type='submit']"));
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).click();
        wd.findElement(locator).sendKeys(text);
    }

    public void switchToNextTab() {
        ArrayList<String> availableTab = new ArrayList<>(wd.getWindowHandles());
        if(!availableTab.isEmpty()){
            wd.switchTo().window(availableTab.get(1));
        }
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        wd.quit();
    }
}
*/