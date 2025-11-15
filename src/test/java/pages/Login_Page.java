package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Login_Page {
    Page page;

    private Locator userName;
    private Locator password;
    private Locator loginBtn;


    public Login_Page(Page page) {
        this.page = page;
        this.userName = page.locator("//input[@id='user-name']");
        this.password = page.locator("//input[@id='password']");
        this.loginBtn = page.locator("//input[@id='login-button']");

    }

    public void loginWithValidCredential() {
        userName.fill("standard_user");
        password.fill("secret_sauce");
        loginBtn.waitFor();
        loginBtn.click();
    }
}
