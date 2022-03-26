package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelector {

    @Test
    public void Css() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        /* CssSelector expression is use the ID attribute*/
        driver.findElement(By.cssSelector("#email")).sendKeys("surjya.duan@gmail.com");

        driver.findElement(By.cssSelector("#pass")).sendKeys("Surjya@121");
        Thread.sleep(6000);

        /* CssSelector expression is use the Type attribute*/
        driver.findElement(By.cssSelector(" button[type=submit]")).click();
        Thread.sleep(9000);
        driver.close();
    }

}