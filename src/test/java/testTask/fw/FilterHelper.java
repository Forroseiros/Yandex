package testTask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testTask.models.Item;

public class FilterHelper extends HelperBase {

    public FilterHelper(WebDriver wd) {
        super(wd);
    }

    public String getItemNameFromListByOrder(int number) {
        return wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet']["+number+"]//h3")).getText();
    }

    public void filterItem(Item item) {
        click(By.cssSelector("[data-id='button-all']")); // закрытие всплывающего окна
       /* Actions actions = new Actions(wd);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();*/ // to move page down
        click(By.cssSelector("[href='/catalog--"+ item.getItemType() +"']"));
        type(By.cssSelector("#glpricefrom"), item.getPriceFrom());
        type(By.cssSelector("#glpriceto"), item.getPriceTo());
        click(By.xpath("//span[text()='"+ item.getBrand() +"']"));
    }

    public void typeInSearchInputField(String itemName) {
        type(By.cssSelector("#header-search"),itemName);
        click(By.cssSelector("[type='submit']"));
    }
}
