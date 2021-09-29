package com.Test_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\documentos\\Proyectos Java\\Driver\\geckodriver.exe"); //Driver Mozilla
		WebDriver driver = new FirefoxDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.findElement(By.id("first-name")).sendKeys("Lero Lero");
		driver.findElement(By.id("last-name")).sendKeys("Candelero");
		driver.findElement(By.id("job-title")).sendKeys("Sr Gerente");
		driver.findElement(By.id("radio-button-2")).click();
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.xpath("//div[6]/select/option[2]")).click();
		driver.findElement(By.id("datepicker")).click();


		driver.findElement(By.className("datepicker-switch")).click();
		driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/thead/tr[2]/th[2]")).click();
		driver.findElement(By.xpath("//html/body/div[2]/div[3]/table/thead/tr[2]/th[2]")).click();
		driver.findElement(By.xpath("//html/body/div[2]/div[4]/table/thead/tr[2]/th[1]")).click();
		driver.findElement(By.xpath("//html/body/div[2]/div[4]/table/thead/tr[2]/th[2]")).click();
		driver.findElement(By.xpath("//html/body/div[2]/div[5]/table/thead/tr[2]/th[2]")).click();
		driver.findElement(By.xpath("//html/body/div[2]/div[5]/table/tbody/tr/td/span[11]")).click();
		driver.findElement(By.xpath("//html/body/div[2]/div[4]/table/tbody/tr/td/span[11]")).click();
		driver.findElement(By.xpath("//html/body/div[2]/div[3]/table/tbody/tr/td/span[6]")).click();
		driver.findElement(By.xpath("//html/body/div[2]/div[2]/table/tbody/tr/td/span[10]")).click();
		driver.findElement(By.xpath("//html/body/div[2]/div[1]/table/tbody/tr[2]/td[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
		driver.findElement(By.id("logo")).click();
		driver.findElement(By.xpath("//li[14]/a[contains(text(),'Complete Web Form')]")).click();
		// Round two //

		driver.findElement(By.id("first-name")).sendKeys("Lero Lero Candelero");
		driver.findElement(By.id("last-name")).sendKeys("cien mulitas y un arriero");
		driver.findElement(By.id("job-title")).sendKeys("Matinal Carranguero");
		driver.findElement(By.id("radio-button-2")).click();
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.xpath("//div[6]/select/option[2]")).click();
		driver.findElement(By.id("datepicker")).sendKeys("10/02/1994" + Keys.ENTER);
		//driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
	}
}


