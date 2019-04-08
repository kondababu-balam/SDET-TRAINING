package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.hotelSearchPage;



public class hotelSearchStepDefinitions {
	

    hotelSearchPage hotelsearch = new hotelSearchPage();
       

    @When("^user enter place to book hotel as Singapore$")
    public void enterPlacetoBookHotel() throws InterruptedException {
    	
    	hotelsearch.enterHotelsearchDetails();
        
    }

    @Then("^user selects two guests in guests and rooms field$")
    public void selectGuestAndRoomCount() throws InterruptedException {
    	
    	hotelsearch.selectGuestsAndRooms();
       
    }
    @Then("^user selects duration of stay and click on search button$")
    public void selectDurationOfStayAndContinue() throws InterruptedException {
    	
    	hotelsearch.selectDurationAndContinue();
       
    }
    @Then("^user selects hotel and fill user information$")
    public void selectHotelAndFillUserInfo() throws InterruptedException {
    	
    	hotelsearch.selecthotel();
       
    }

}
