//------------
package com.tyss.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FormTest {

    @Test
    public void testForm() throws InterruptedException {

        // 1. Start Edge
        WebDriver driver = new ChromeDriver();

        // 2. Open your application
        driver.get("http://localhost:8080/03-httpServlet/");

        // Wait so you can see the page
        Thread.sleep(2000);

        // 3. Enter name
        driver.findElement(By.name("username"))
              .sendKeys("Ankit");

        Thread.sleep(2000);

        // 4. Enter age
        driver.findElement(By.name("age"))
              .sendKeys("25");

        Thread.sleep(2000);

        // 5. Enter email
        driver.findElement(By.name("email"))
              .sendKeys("ankit@gmail.com");

        Thread.sleep(2000);

        // 6. Enter phone
        driver.findElement(By.name("phone"))
              .sendKeys("9876543210");

        Thread.sleep(2000);

        // 7. Click Submit
        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();

        Thread.sleep(3000);

        // 8. Print current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 9. Close browser
        driver.quit();
    }
}
