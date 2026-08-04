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

        // 3. by name selector
        driver.findElement(By.name("username"))
              .sendKeys("Ankit");

        Thread.sleep(2000);

        // 4. by age selector
        driver.findElement(By.id("age"))
              .sendKeys("25");

        Thread.sleep(2000);

        // 5. by x-Path selector
        driver.findElement(By.xpath("//input[@name='email']"))
              .sendKeys("ankit@gmail.com");

        Thread.sleep(2000);

        // 6. by css selector
        driver.findElement(By.cssSelector(".by.css.selector"))
              .sendKeys("9876543210");

        Thread.sleep(2000);

        
        // by class name selector
        driver.findElement(By.className("address")).sendKeys("eknath chal nehru nagar");
        //8 navigate to previous page.
        
        //7. by linkText selector
        driver.findElement(By.linkText("anchar tag")).click();
        Thread.sleep(3000);
        //navigate back to main ,form maven repository.
        driver.navigate().back();
        Thread.sleep(3000);
        // 8. Print current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        // 7. Click Submit
        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();

        Thread.sleep(3000);
        
        // 9. Close browser
        driver.quit();
    }
}
