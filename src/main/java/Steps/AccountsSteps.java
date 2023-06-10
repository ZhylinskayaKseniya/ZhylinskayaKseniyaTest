package Steps;

import Core.Utils.LoggingUtils;
import Core.Utils.ScreenshotUtils;
import Pages.AccountsPages;
import Pages.LoginPages;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.open;

public class AccountsSteps extends SalesforceSteps {

    public AccountsSteps createAccount() {
        new AccountsPages().navBarForm.clickAccountsTab();
        new AccountsPages().accountsForm
                .clickNewButton()
                .fillInAccountNameInput("Zhylinskaya")
                .fillInPhoneInput("+48572237720")
                .clickSaveButton();
        return this;
    }

    public void checkThatAccountWasCreated() {
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(new AccountsPages().accountsForm.isAccountNameContainsRightData("Zhylinskaya"), "Account name isn't correct");
        sa.assertTrue(new AccountsPages().accountsForm.isPhoneContainsRightData("+48572237720"), "APhone isn't correct");
        sa.assertAll();
    }

    public AccountsSteps editAccount() {
        new AccountsPages().navBarForm.clickAccountsTab();
        new AccountsPages().accountsForm
                .openAccount("Zhylinskaya")
                .clickEditButton()
                .fillInAccountNameInput("Zhylinskaya changed")
                .fillInPhoneInput("+48572237722")
                .clickSaveButton();
        return this;
    }

    public void checkThatAccountWasEdited() {
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(new AccountsPages().accountsForm.isAccountNameContainsRightData("Zhylinskaya changed"), "Account name isn't correct");
        sa.assertTrue(new AccountsPages().accountsForm.isPhoneContainsRightData("+48572237722"), "APhone isn't correct");
        sa.assertAll();
    }

}
