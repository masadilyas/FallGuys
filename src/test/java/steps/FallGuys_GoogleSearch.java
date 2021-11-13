package steps;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageObjects;

public class FallGuys_GoogleSearch extends GoogleBase{
	
HomePageObjects hpo;
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
	 launchBrowser();

		}
	@When("I enter search {string}")
	public void i_enter_search(String term) {
		
		//WebElement searchBox= driver.findElement(By.name("q"));
		//searchBox.sendKeys(terms);
		hpo= new HomePageObjects(driver);
		hpo.enterTerm(term);
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		//WebElement searchBtn=driver.findElement(By.name("btnK"));
		//searchBtn.click();
	hpo.clickSearch();
		
	}
	@Then("I receive related search results")
	public void i_receive_related_search_results() {
	 
		
		System.out.println("I receive related search results");
	    
	    String title=driver.getTitle();
	    System.out.println(title);
	    
	    closeBrowser();
	    }
	
	

}
