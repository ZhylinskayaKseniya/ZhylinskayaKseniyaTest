package Tests;

import Core.Entities.LoginUser;
import Steps.AccountsSteps;
import org.testng.annotations.Test;

public class Account {

    @Test(groups = "smoke", description = "Test case : A1\n[Create an account and verify it was created]")
    public void Create_account() {
        AccountsSteps i = new AccountsSteps();
        LoginUser.UserModel user = LoginUser.UserModel.loginUser();

        i.login(user.userName(), user.password());
        i.createAccount();
        i.findSuccessMessage();
        i.checkThatAccountWasCreated();
    }

    @Test(groups = "smoke", description = "Test case : A2\n[Edit an account]")
    public void Edit_account() {
        AccountsSteps i = new AccountsSteps();
        LoginUser.UserModel user = LoginUser.UserModel.loginUser();

        i.login(user.userName(), user.password());
        i.editAccount();
        i.findSuccessMessage();
        i.checkThatAccountWasEdited();
    }

}
