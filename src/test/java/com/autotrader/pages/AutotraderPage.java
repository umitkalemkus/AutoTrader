package com.autotrader.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutotraderPage {

    WebDriver driver;


    public AutotraderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//*[contains(text(),'Find Cars by Budget')])[1]")
    public WebElement findCarsByBudget;


    @FindBy(xpath = "//button[@data-qaid='lnk-browseByStyle']")
    public WebElement shopVehiclesByStyle ;


    @FindBy(xpath = "//button[@data-qaid='lnk-browseByStyle']")
    public WebElement advancedSearch;


    @FindBy(id = "search" )
    public WebElement searchButton;

    @FindBy(xpath = "//select[@name=\"makeCode\"]")
    public WebElement anyMake;


    @FindBy(xpath = "//select[@name=\"ModelCode\"]")
    public WebElement AnyModel;






    public void VerificationByMakeByModelByAdvancedSearch (String expected){
        if(expected.equals(findCarsByBudget.getText())){
            String actual =findCarsByBudget.getText();
            Assert.assertEquals(expected,actual);
        }else if(expected.equals(shopVehiclesByStyle.getText())){
            String actual = shopVehiclesByStyle.getText();
            Assert.assertEquals(expected,actual);
        }else {
            String actual = advancedSearch.getText();
            Assert.assertEquals(expected,actual);
        }






    }

    public void searchButton() {
       Assert.assertTrue(searchButton.isEnabled());
    }


    public void VerifyAnyMakeAnyModel(String make , String Model ){
        Assert.assertTrue(anyMake.isEnabled());
        Assert.assertTrue(AnyModel.isEnabled());

    }






}
