/*
 * @(#) Chrome.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package com.foundation.gui.core.selenium.webdrivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Chrome class.
 *
 * @author Andres Burgos
 * @version 1.0.0
 */
public class Chrome {

  /**
   * Initializes Chrome driver.
   * @return ChromeDriver.
   */
    public WebDriver initDriver() {
        ChromeDriverManager.getInstance().version("76.0.3809.126").setup();
        return new ChromeDriver();
    }
}
