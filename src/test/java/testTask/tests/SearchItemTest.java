package testTask.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testTask.models.Item;

public class SearchItemTest extends TestBase {

    @Test
    public void itemTest() throws InterruptedException {
        app.select().goToMarket();
        app.select().switchToNextTab();
        app.select().selectElectronicaDepartment();

        app.filter().filterItem(new Item().setItemType("smartfony/16814639/list?glfilter=4940921%3A13475069&hid=91491").setPriceFrom
                ("20000").setPriceTo("35000").setBrand("Apple"));
        app.filter().refresh();
        app.select().pause();

        String itemName = app.filter().getItemNameFromListByOrder(2);

        app.filter().typeInSearchInputField(itemName);
        String foundItemName = app.filter().getItemNameFromListByOrder(1);
        Assert.assertEquals(foundItemName, itemName);
    }


}
