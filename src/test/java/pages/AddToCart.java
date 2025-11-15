package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AddToCart {
    Page page;

    private Locator addToCartBtn;
    private Locator cartBadges;
    private Locator productName;


    public AddToCart (Page page) {
        this.page = page;
        this.addToCartBtn= page.locator("//button[@id='add-to-cart-sauce-labs-backpack']");
        this.cartBadges = page.locator("//div[@id='shopping_cart_container']");
        this.productName = page.locator("//div[contains(text(), 'Sauce Labs Backpack')]");
    }

    public void clickOnAddToCartButton() {
        addToCartBtn.waitFor();
        addToCartBtn.click();
    }

    public void clickOnCartBadges() {
        cartBadges.waitFor();
        cartBadges.click();
    }

    public boolean isProductNamePresent() {
            return productName.isVisible();
    }

}
