package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Log_out_page {
    Page page;
    private Locator hamburgerMenu;
    private Locator logoutBtn;

    public Log_out_page (Page page) {
        this.page = page;
        this.hamburgerMenu = page.locator("//button[@id='react-burger-menu-btn']");
        this.logoutBtn = page.locator("//a[@id='logout_sidebar_link']");

    }

    public void clickOnHamburgerMenu() {
        hamburgerMenu.waitFor();
        hamburgerMenu.click();
    }

    public  void clickOnLogOutBtn(){
        logoutBtn.waitFor();
        logoutBtn.click();
    }

}

