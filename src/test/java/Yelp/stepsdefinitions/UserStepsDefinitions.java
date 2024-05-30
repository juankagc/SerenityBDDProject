package Yelp.stepsdefinitions;

import Yelp.steps.YelpUserInteractions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class UserStepsDefinitions {
    @Steps(shared = true)
    YelpUserInteractions userInteractions;

    @Given("^user navigates to https://www.yelp.com/$")
    public void userNavigatesToYelp(){
    }
    @And("^selects find Restaurant$")
    public void userSearch(){
    }

    @Given("^User search restaurant (.*)$")
    public void userSearchRestaurant(String type){
    }
    @When("^filters by (.*)$")
    public void userFilterBy(String neighborhoods){
    }
    @And("^select the first search result$")
    public void userSelectFirstResult(){
    }
    @Then("^User views restaurant information$")
    public void viewRestaurantInformation(){
    }
}
