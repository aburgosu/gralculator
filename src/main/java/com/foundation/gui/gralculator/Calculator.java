package com.foundation.gui.gralculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calculator {
    private WebDriver driver;

    public Calculator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "expr")
    WebElement result;

    public String getValue(){
        return result.getAttribute("value");
    }

    public void doOperation(int a, int b, String operator) {
        String operation = a + operator + b + "=";
        driver.manage().window().maximize();
        for (int i = 0; i <= operation.length() - 1; i++) {
            driver.findElement(By.linkText(operation.substring(i, i + 1))).click();
        }
    }
}