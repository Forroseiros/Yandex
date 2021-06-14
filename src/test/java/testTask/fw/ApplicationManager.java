package testTask.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    public WebDriver wd;
    SelectHelper select;
    FilterHelper filter;
    String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }


    public void init() {
        if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        }


        wd.navigate().to("https://yandex.ru/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);


        select = new SelectHelper(wd);
        filter = new FilterHelper(wd);

    }

    public SelectHelper select() {
        return select;
    }

    public FilterHelper filter() {
        return filter;
    }

    public void stop() {
        wd.quit();
    }
}
