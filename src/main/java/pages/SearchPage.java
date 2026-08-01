package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class SearchPage extends BasePage {

    private final By searchTextBox =
            By.xpath("//android.widget.AutoCompleteTextView[@resource-id='org.wikipedia:id/search_src_text']");

    private final By firstResult =
            By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]");


    public void searchFor(String article) {
        sendKeys(searchTextBox, article);
    }

    public void openFirstResult() {
        System.out.println("Clicking first search result...");
        click(firstResult);
        System.out.println("First result clicked.");

    }
}