package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Check if the cart contains any products
    public boolean isProductInCart() {
        return driver.findElements(By.className("cart_item")).size() > 0;
    }
}
