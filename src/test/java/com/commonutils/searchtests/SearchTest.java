package com.commonutils.searchtests;

import com.commonutils.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import searchmodule.pages.SearchPage;

public class SearchTest extends BaseTest {

    WebDriver driver;




    @Test
    public void searchTests() {

        SearchPage SearchPage = new SearchPage();

        SearchPage.goTo();

    }








}
