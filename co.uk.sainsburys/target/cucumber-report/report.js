$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/groceriespage.feature");
formatter.feature({
  "line": 1,
  "name": "Sainsbury Grocery feature",
  "description": "  As a user I want to shopping groceries without login",
  "id": "sainsbury-grocery-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8075177626,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Continue shopping without login",
  "description": "",
  "id": "sainsbury-grocery-feature;continue-shopping-without-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on groceries link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on loginLink",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on continue shopping",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I reached to let\u0027s check postcode page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on postcode field",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I enter postcode \"HA39RZ\" into postcode field",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 244284231,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnGroceriesLink()"
});
formatter.result({
  "duration": 16146842439,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginLink()"
});
formatter.result({
  "duration": 153906562,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnContinueShopping()"
});
formatter.result({
  "duration": 2321140666,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iReachedToLetSCheckPostcodePage()"
});
formatter.result({
  "duration": 112072508,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnPostcodeField()"
});
formatter.result({
  "duration": 108124087,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HA39RZ",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iEnterPostcodeIntoPostcodeField(String)"
});
formatter.result({
  "duration": 143732004,
  "status": "passed"
});
formatter.after({
  "duration": 1110785543,
  "status": "passed"
});
formatter.uri("src/test/java/resources/featurefiles/homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Sainsbury\u0027s HomePage",
  "description": "As a user I want to see all available features on home page",
  "id": "sainsbury\u0027s-homepage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8857691114,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to groceries page",
  "description": "",
  "id": "sainsbury\u0027s-homepage;user-should-navigate-to-groceries-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on groceries link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can see shoppingWithUsText",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 69697,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnGroceriesLink()"
});
formatter.result({
  "duration": 9348959122,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iCanSeeShoppingWithUsText()"
});
formatter.result({
  "duration": 57361106,
  "status": "passed"
});
formatter.after({
  "duration": 1322647257,
  "status": "passed"
});
});