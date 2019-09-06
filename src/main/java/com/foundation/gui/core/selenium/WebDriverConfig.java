package com.foundation.gui.core.selenium;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class WebDriverConfig {

    private int implicitWaitTime;
    private int explicitWaitTime;
    private String browser;
    private static WebDriverConfig readConfiguration;
    private Properties properties;
    private InputStream inputProperties;

    private static WebDriverConfig instance;

    protected WebDriverConfig() {
        initialize();
    }

    public static WebDriverConfig getInstance() {
        if (instance == null) {
            instance = new WebDriverConfig();
        }
        return instance;
    }

    public void initialize() {
        try {
            inputProperties = new FileInputStream("config.properties");
            properties = new Properties();
            properties.load(inputProperties);
            implicitWaitTime = Integer.parseInt(properties.getProperty("implicitWaitTime"));
            explicitWaitTime = Integer.parseInt(properties.getProperty("explicitWaitTime"));
            browser = properties.getProperty("browser");
        } catch (Exception e) {
            try {
                inputProperties.close();
            } catch (Exception ex) {
                //TODO
            }
            //TODO
        }
    }

    public int getImplicitWaitTime() {
        return implicitWaitTime;
    }

    public int getExplicitWaitTime() {
        return explicitWaitTime;
    }

    public String getBrowser() {
        return browser;
    }
}
