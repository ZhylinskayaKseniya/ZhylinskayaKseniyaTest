package Core;

import Core.ConfigModules.DriverDetails;
import com.codeborne.selenide.Configuration;

public class DriverConfigurator {

    public static synchronized void configureSelenide(DriverDetails driverConfig) {
        Configuration.timeout = 40000;
        Configuration.baseUrl = driverConfig.getAppURL();
        Configuration.browserSize = driverConfig.getBrowserWindowSize();
        Configuration.savePageSource = false;
        Configuration.screenshots = true;
        Configuration.headless = false;//todo switch after debug, should be true
        Configuration.browser = System.getProperty("browser", "chrome").toLowerCase();
    }
}
