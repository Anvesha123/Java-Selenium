package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    // Locators for first product and shopping cart link
    By firstProduct = By.cssSelector(".inventory_item:first-child .btn_inventory");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Add the first product to the cart
    public void addFirstProductToCart() {
        driver.findElement(firstProduct).click();
    }

    // Navigate to the cart123
    public void goToCart() {
        driver.findElement(By.className("shopping_cart_link")).click();
    }
}
