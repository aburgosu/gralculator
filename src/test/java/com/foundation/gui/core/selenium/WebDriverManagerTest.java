package com.foundation.gui.core.selenium;

import com.foundation.gui.gralculator.Calculator;
import com.foundation.gui.gralculator.Operator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WebDriverManagerTest {
    private Calculator calculator;
    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = WebDriverManager.getInstance().getWebDriver();
        driver.get("https://www.calculadora.org/");
        calculator = new Calculator(driver);
    }


    @Test
    public void addTextLink() {
        calculator.doOperation(2, 1, Operator.ADD.getOperator());
        assertThat(calculator.getValue(), is("3"));
    }

    @Test
    public void divTextLink() {
        calculator.doOperation(8, 2, Operator.DIV.getOperator());
        assertThat(calculator.getValue(), is("4"));
    }

    @Test
    public void multTextLink() {
        calculator.doOperation(2, 1, Operator.MULT.getOperator());
        assertThat(calculator.getValue(), is("2"));
    }

    @Test
    public void subsXPathInnerTxt() {
        calculator.doOperation(2, 1, Operator.SUB.getOperator());
        assertThat(calculator.getValue(), is("1"));
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}