package com.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;

public class MouseTesting {
    @Test
    public void mousetesting() throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "F:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);

        Robot robot = new Robot();
        robot.mouseMove(500, 300);

        robot.mouseWheel(1000);
        Thread.sleep(5000);
        driver.close();
    }

}

