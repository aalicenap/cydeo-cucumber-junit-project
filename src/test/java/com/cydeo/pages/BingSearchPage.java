package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingSearchPage {
    //- Create the constructor and initialize the driver with object
    public BingSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    // Use @FindBy instead of findElement()
    @FindBy(xpath = "//textarea[@id='sb_form_q']")
    public WebElement searchBox;
}
