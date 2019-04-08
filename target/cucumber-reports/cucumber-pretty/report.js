$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HotelSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Search",
  "description": "",
  "id": "hotel-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Book a hotel in traveloka web application",
  "description": "",
  "id": "hotel-search;book-a-hotel-in-traveloka-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TestRail-CTR-230033"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user enter place to book hotel as Singapore",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user selects two guests in guests and rooms field",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user selects duration of stay and click on search button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user selects hotel and fill user information",
  "keyword": "Then "
});
formatter.match({
  "location": "hotelSearchStepDefinitions.enterPlacetoBookHotel()"
});
formatter.result({
  "duration": 11264580008,
  "status": "passed"
});
formatter.match({
  "location": "hotelSearchStepDefinitions.selectGuestAndRoomCount()"
});
formatter.result({
  "duration": 633835205,
  "status": "passed"
});
formatter.match({
  "location": "hotelSearchStepDefinitions.selectDurationOfStayAndContinue()"
});
formatter.result({
  "duration": 5364228752,
  "status": "passed"
});
formatter.match({
  "location": "hotelSearchStepDefinitions.selectHotelAndFillUserInfo()"
});
formatter.result({
  "duration": 22918627086,
  "status": "passed"
});
});