package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.HomePage;
import pages.CartPage;

public class E2ETest extends BaseTest {

    @Test
    public void testE2EFlow() {
        // Login to the website
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Add first product to cart and go to cart
        HomePage homePage = new HomePage(driver);
        homePage.addFirstProductToCart();
        homePage.goToCart();

        // Verify product is added to the cart
        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isProductInCart(), "Product not found in cart!");
    }
}
