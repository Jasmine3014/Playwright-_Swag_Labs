package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCart;
import pages.Log_out_page;
import pages.Login_Page;

public class LoginAddCartLogoutTest extends BaseTest {

    @Test
    public void LoginAddCartLogoutTest() {
        Login_Page loginPage = new Login_Page(page);
        loginPage.loginWithValidCredential();


        AddToCart addToCart = new  AddToCart(page);
        addToCart.clickOnAddToCartButton();
        addToCart.clickOnCartBadges();
        Assert.assertTrue(addToCart.isProductNamePresent(),"Sauce Labs Backpack");

        Log_out_page logOutPage = new Log_out_page(page);
        logOutPage.clickOnHamburgerMenu();
        logOutPage.clickOnLogOutBtn();

    }
}
