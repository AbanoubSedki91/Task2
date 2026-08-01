package pages;

import base.BasePage;
import org.openqa.selenium.By;
import utils.WaitUtils;

public class ArticlePage extends BasePage
{

    private final By saveButton =
            By.id("org.wikipedia:id/page_save");

    private final By saveMessage =
            By.id("org.wikipedia:id/snackbar_text");

    private final By addToListButton =
            By.id("org.wikipedia:id/snackbar_action");


    public void waitForArticleToLoad()
    {
        WaitUtils.waitForVisibility(saveButton);
    }

    public boolean isArticleOpened()
    {
        return isDisplayed(saveButton);
    }

    public void clickSaveButton()
    {
        click(saveButton);
    }

    public String getSaveMessage()
    {
        return getText(saveMessage);
    }

    public void clickAddToList()
    {
        click(addToListButton);
    }

}