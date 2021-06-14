package testTask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testTask.fw.HelperBase;

import java.util.ArrayList;

public class SelectHelper extends HelperBase {
    public SelectHelper(WebDriver wd) {
        super(wd);

    }

    public void switchToNextTab() {
        ArrayList<String> availableTab = new ArrayList<>(wd.getWindowHandles());
        if(!availableTab.isEmpty()){
            wd.switchTo().window(availableTab.get(1));
        }
    }
    public void goToMarket() {
        click(By.cssSelector("[data-id='market']"));
    }
    public void selectElectronicaDepartment() {
        click(By.cssSelector("[href='/catalog--elektronika/54440']"));
    }

}
