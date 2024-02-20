package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.api.restassured.PetstoreRestAssuredActions;

public class PetStoreApiSteps {
	
	PetstoreRestAssuredActions PetstoreRestAssuredActionsObj = new PetstoreRestAssuredActions();
	
	@Given("^Create pet$")
	public void create_pet() throws Throwable {
		PetstoreRestAssuredActionsObj.createPet();
	}

	@When("^Update pet$")
	public void update_pet() throws Throwable {
		PetstoreRestAssuredActionsObj.updatePet();
	}

	@Then("^Get pet$")
	public void get_pet() throws Throwable {
		PetstoreRestAssuredActionsObj.getPet();
	}

	@Then("^Delete pet$")
	public void delete_pet() throws Throwable {
		PetstoreRestAssuredActionsObj.deletePet();
	}
}