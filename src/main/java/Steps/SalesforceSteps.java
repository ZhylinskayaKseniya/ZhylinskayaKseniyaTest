package Steps;


import Core.Utils.LoggingUtils;
import Core.Utils.ScreenshotUtils;
import Pages.LoginPages;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;

public class SalesforceSteps {

    public SalesforceSteps openLoginPage() {
        LoggingUtils.log("Open login page");
        open("https://login.salesforce.com/");
        ScreenshotUtils.makeScreenshot();
        return this;
    }

    public SalesforceSteps openPage(String pageName) {
        LoggingUtils.log("Open " + pageName);
        open(pageName);
        ScreenshotUtils.makeScreenshot();
        return this;
    }

    public void findSuccessMessage() {
        LoggingUtils.log("Find success message");
        $(".slds-theme--success").should(Condition.visible);
    }

    public SalesforceSteps login(String userName, String password) {
        LoggingUtils.log("Login into account with credentials: username: " + userName + "password: " + password);
        openLoginPage();
        new LoginPages().loginForm
                .fillInUserNameInput(userName)
                .fillInPasswordInput(password)
                .clickLoginButton();
        return this;
    }


}
