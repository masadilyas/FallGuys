package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	
	WebDriver driver;
	public HomePageObjects(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
	//WebElement searchBox=driver.findElement(By.name("q"));
	//searchBox.sendKeys(term);
	
	
	@FindBy(name="q")
	private WebElement searchBox;
	
	public void enterTerm(String term) {
		searchBox.sendKeys(term);
	}
	
	
	//WebElement searchBtn = driver.findElement(By.name("btnK"));
	//searchBtn.click();
	
	@FindBy(name="btnK")
	private WebElement searchBtn;
	
	public void clickSearch() {
		}
	}
