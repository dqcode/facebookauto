package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String appUrl = " https://en-gb.facebook.com/reg/";
        driver.get(appUrl);
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("diqy");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("diqy");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("mshidiqy@gmail.com");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("ddafesfsefw");





        Select b = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        b.selectByValue("5");
        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        month.selectByVisibleText("Dec");
        Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        year.selectByVisibleText("1999");

        driver.findElement(By.xpath("//input[@value='2']")).click();

        driver.findElement(By.xpath("//button[@name='websubmit']")).click();

        Thread.sleep(5000);


    }

}