package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By searchIcon =
            By.xpath("(//android.widget.ImageView[@resource-id='org.wikipedia:id/navigation_bar_item_icon_view'])[3]");

    private final By searchCard =
            By.xpath("//androidx.cardview.widget.CardView[@resource-id='org.wikipedia:id/search_card']");

    public void clickSearchIcon() {
        click(searchIcon);
    }

    public void clickSearchBox() {
        click(searchCard);
    }

}