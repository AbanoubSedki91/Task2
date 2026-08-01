package tests;

import base.BaseTest;
import constants.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import pages.ArticlePage;

public class WikipediaTest extends BaseTest
{

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    ArticlePage articlePage = new ArticlePage();

    @Test
    public void launchWikipediaApp()
    {

        homePage.clickSearchIcon();
        homePage.clickSearchBox();
        searchPage.searchFor(TestData.ARTICLE_NAME);
        searchPage.openFirstResult();
        articlePage.waitForArticleToLoad();
        Assert.assertTrue(articlePage.isArticleOpened());
        articlePage.clickSaveButton();
        Assert.assertEquals(articlePage.getSaveMessage(), "Saved Artificial intelligence. Do you want to add it to a list?");
        articlePage.clickAddToList();

    }

}