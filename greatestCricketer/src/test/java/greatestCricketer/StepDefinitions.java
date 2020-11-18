package greatestCricketer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
	
	private String format;
	private String actualAnswer;
	
	@Given("Format is {string}")
	public void format_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    format = string;
	}

	@When("I want to know who is the greatest cricketer")
	public void i_want_to_know_who_is_the_greatest_cricketer() {
	    // Write code here that turns the phrase above into concrete actions
	   actualAnswer= findGreatestCricketer(format);
	}
	private String findGreatestCricketer(String formatName) {
		// TODO Auto-generated method stub
		if(formatName.equals("Test")) {
			return "Rahul Dravid";
		}
		else if(formatName.equals("ODI")) {
			return "Sachin Tendulkar";
		}
		else if(formatName.equals("T20")) {
			return "Virat Kohli";
		}
		else
			return "Not Found";
	}

	@Then("System or Application should answer me as {string}")
	public void system_or_application_should_answer_me_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(string,actualAnswer);
	}

}
