package cc2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question1 {
	@Test
	public void test() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver;
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(co);
	driver.navigate().to("https://www.yatra.com/hotels");
	driver.manage().window().maximize();
	driver.switchTo().alert().accept();
	WebElement round=driver.findElement(By.xpath("//*[@id=\"booking_engine_flights\"]"));
	round.click();
	WebElement fligth=driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[1]/ul[1]/li[2]/a"));
	fligth.click();
	WebElement from=driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_city\"]"));
	from.click();
	WebElement fromin=driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[1]/div/div/ul/div/div/div/li[5]/div[1]/p[1]"));
	fromin.click();
	WebElement toin=driver.findElement(By.xpath("//*[@id=\"BE_flight_arrival_city\"]"));
	fromin.click();
	WebElement input=driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_city\"]"));
	input.click();
	input.sendKeys("Goa"+Keys.ENTER);
	fromin.clear();
	WebElement to=driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_city\"]"));
	to.click();
	toin.sendKeys("Chennai",Keys.ENTER);
	round.click();
	WebElement date=driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_date\"]"));
	date.click();
	//*[@id="26/04/2023"]
	WebElement datein=driver.findElement(By.xpath("//*[@id=\"26/04/2023\"]"));
	datein.click();
	
	WebElement cmt=driver.findElement(By.xpath("//*[@id=\"BE_flight_paxInfoBox\"]/span"));
	cmt.click();
	WebElement plus=driver.findElement(By.xpath("//*[@id=\"BE_flight_paxInfoBox\"]/span"));
	plus.click();
	plus.click();
	plus.click();
	WebElement std=driver.findElement(By.xpath("//*[@id=\"special_student_offer\"]/a/i"));
	std.click();
	WebElement search=driver.findElement(By.xpath("//*[@id=\"BE_flight_flsearch_btn\"]"));
	search.submit();
	
	}

}
