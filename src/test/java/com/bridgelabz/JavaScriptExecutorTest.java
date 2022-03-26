package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest {

    @Test
    public void enterText() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("C:\\Users\\user\\IdeaProjects\\Auto\\src\\main\\resources\\exmple.html");

        driver.findElement(By.id("h1")).clear();

        Thread.sleep(1000);

        driver.findElement(By.id("h1")).sendKeys("Surjyamani ");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.getElementById('h2').value=''");

        Thread.sleep(2000);
        js.executeScript("document.getElementById('h2').value='Duan'");

    }
}
