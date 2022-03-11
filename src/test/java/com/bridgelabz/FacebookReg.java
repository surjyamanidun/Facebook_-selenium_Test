package com.bridgelabz;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class FacebookReg {

    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create New Account")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Surjya");

        Thread.sleep(3000);
        driver.findElement(By.name("lastname")).sendKeys("Duan");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email__")).sendKeys("surjyamaniduan@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("surya");
        Thread.sleep(3000);
        driver.findElement(By.name("birthday_day")).sendKeys("16");
        Thread.sleep(3000);
        driver.findElement(By.name("birthday_month")).sendKeys("Aug");
        Thread.sleep(3000);
        driver.findElement(By.name("birthday_year")).sendKeys("1996");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
        Thread.sleep(3000);
        driver.close();
    }
}


