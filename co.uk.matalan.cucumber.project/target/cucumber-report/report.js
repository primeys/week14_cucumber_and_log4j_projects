$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/co/uk/matalan/resources/featurefiles/myaccount.feature");
formatter.feature({
  "line": 1,
  "name": "Matalan My Account feature",
  "description": "\r\nAs a user I want to login into matalan website",
  "id": "matalan-my-account-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 28296982116,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to myAccount page successfully",
  "description": "",
  "id": "matalan-my-account-feature;user-should-navigate-to-myaccount-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on myAccount link",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 1230589159,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 804888683,
  "status": "passed"
});
formatter.after({
  "duration": 1064150493,
  "status": "passed"
});
formatter.before({
  "duration": 19736520705,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User should navigate to myAccount page successfully",
  "description": "",
  "id": "matalan-my-account-feature;user-should-navigate-to-myaccount-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on myAccount link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I enter email address \"abc123@gmail.com\" into email field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter password \"abc1234\" into password field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should successfully login to my account",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 75370,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 192502133,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123@gmail.com",
      "offset": 23
    }
  ],
  "location": "MyStepdefs.iEnterEmailAddressIntoEmailField(String)"
});
formatter.result({
  "duration": 6249052403,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc1234",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iEnterPasswordIntoPasswordField(String)"
});
formatter.result({
  "duration": 166404222,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 6067669792,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSuccessfullyLoginToMyAccount()"
});
formatter.result({
  "duration": 165375379,
  "status": "passed"
});
formatter.after({
  "duration": 1140489063,
  "status": "passed"
});
});