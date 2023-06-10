package Pages;

import Core.Utils.LoggingUtils;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.devtools.v85.log.Log;

import static com.codeborne.selenide.Selenide.$;

public class AccountsPages extends LoginPages {

    public NavBarForm navBarForm = new NavBarForm();
    public AccountsForm accountsForm = new AccountsForm();

    public static class NavBarForm {
        private static SelenideElement accountsButton() {
            return $("[data-id='Account']").should(Condition.visible);
        }

        ////////////////////////////////////////////////////

        public void clickAccountsTab() {
            LoggingUtils.log("Click on 'Accounts' tab");
            accountsButton().click();
        }
    }

    public static class AccountsForm {
        private static SelenideElement accountsForm() {
            return $(".test-listViewManager").should(Condition.visible);
        }
        private static SelenideElement actionBodyForm() {
            return $(".actionBody").should(Condition.visible);
        }

        private static SelenideElement newButton() {
            return accountsForm().$("[title='New']");
        }

        private static SelenideElement accountNameInput() {
            return actionBodyForm().$("[data-field-id='RecordNameField2']");
        }

        private static SelenideElement phoneInput() {
            return actionBodyForm().$("[data-field-id='RecordPhoneField2']");
        }

        private static SelenideElement saveButton() {
            return $("[apiname='SaveEdit']");
        }

        private static SelenideElement accountLine(String accountName) {
            return $("[title='" + accountName + "']");
        }

        private static SelenideElement editButton() {
            return $("[name='Edit']");
        }

        ////////////////////////////////

        public AccountsForm clickNewButton() {
            LoggingUtils.log("Click 'New' button");
            newButton().click();
            return this;
        }

        public AccountsForm clickEditButton() {
            LoggingUtils.log("Click 'Edit' button");
            editButton().click();
            return this;
        }

        public AccountsForm fillInAccountNameInput(String accountName) {
            LoggingUtils.log("Fill in 'Account name' input");
            accountNameInput().$("input").setValue(accountName);
            return this;
        }

        public AccountsForm fillInPhoneInput(String phone) {
            LoggingUtils.log("Fill in 'Phone' input");
            phoneInput().$("input").setValue(phone);
            return this;
        }

        public AccountsForm openAccount(String accountName) {
            LoggingUtils.log("Open account with Name: " + accountName);
            accountLine(accountName).click();
            return this;
        }

        public void clickSaveButton() {
            LoggingUtils.log("Click 'Save' button");
            saveButton().click();
        }

        public boolean isAccountNameContainsRightData(String accountName) {
            return accountNameInput().has(Condition.text(accountName));
        }

        public boolean isPhoneContainsRightData(String phone) {
            return phoneInput().has(Condition.text(phone));
        }
    }
}
