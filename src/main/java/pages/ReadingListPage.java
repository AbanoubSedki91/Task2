package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class ReadingListPage extends BasePage
{
    private final By listName =
            By.id("org.wikipedia:id/text_input");

    private final By okButton =
            By.id("android:id/button1");

    private final By movedMessage =
            By.id("org.wikipedia:id/snackbar_text");

    private final By viewListButton =
            By.id("org.wikipedia:id/snackbar_action");

    private final By readingListContainer =
            By.id("org.wikipedia:id/page_list_item_container");

    private final By articleTitle =
            By.xpath("//android.widget.TextView[@text='Artificial intelligence']");

    public void enterListName(String name)
    {
        sendKeys(listName, name);
    }

    public void clickOK()
    {
        click(okButton);
    }

    public String getMovedMessage()
    {
        return getText(movedMessage);
    }

    public void clickViewList()
    {
        click(viewListButton);
    }

    public boolean isReadingListOpened()
    {
        return isDisplayed(readingListContainer);
    }

    public void openSavedArticle()
    {
        click(articleTitle);
    }
}
