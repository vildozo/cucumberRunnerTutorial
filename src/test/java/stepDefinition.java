import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class stepDefinition {
	   @Given("^sample feature file is ready$")
	       public void givenStatment(){
	              System.out.println("Given statement executed successfully");
	       }
	   @When("^I run the feature file$")
	       public void whenStatement(){
	              System.out.println("When statement execueted successfully");
	       }
	   @Then("^run should be successful$")
	       public void thenStatment(){
	              System.out.println("Then statement executed successfully");
	       }
}
