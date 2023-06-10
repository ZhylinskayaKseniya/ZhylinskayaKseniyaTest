package Pages;

import Core.Utils.LoggingUtils;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPages{

    public LoginForm loginForm = new LoginForm();

    public static class LoginForm {
        private static SelenideElement loginForm() {
            return $("#theloginform").should(Condition.visible);
        }

        private static SelenideElement userNameInput() {
            return loginForm().$("#username");
        }

        private static SelenideElement passwordInput() {
            return $("#password");
        }


        private static SelenideElement loginButton() {
            return loginForm().$("#Login");
        }

        ////////////////////////////////////////////////////

        public LoginForm fillInUserNameInput(String userName) {
            LoggingUtils.log("Fill in 'User name' input");
            userNameInput().setValue(userName);
            return this;
        }
        public LoginForm fillInPasswordInput(String password) {
            LoggingUtils.log("Fill in 'Password' input");
            passwordInput().setValue(password);
            return this;
        }

        public void clickLoginButton() {
            LoggingUtils.log("Click 'Login' button");
            loginButton().click();
        }
    }
}
