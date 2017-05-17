$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Quidco.feature");
formatter.feature({
  "line": 1,
  "name": "Quidco App",
  "description": "In order to access Quidco account\r\nAs an Un-registered user\r\nI want to be able to Join in",
  "id": "quidco-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Join Us",
  "description": "",
  "id": "quidco-app;join-us",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on Explore page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user selects Skip",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user is on Application Front page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user selects Join Us",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user is on Join Us page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters First Name \"Mark\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enters Last Name \"Testtest\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enters Email \"segun.testest+test11@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user enters password \"mark01\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user select Join Us",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user is on User Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "QuidcoStepD.user_is_on_Explore_page()"
});
formatter.result({
  "duration": 53124575872,
  "status": "passed"
});
formatter.match({
  "location": "QuidcoStepD.user_selects_Skip()"
});
formatter.result({
  "duration": 773308642,
  "status": "passed"
});
formatter.match({
  "location": "QuidcoStepD.user_is_on_Application_Front_page()"
});
formatter.result({
  "duration": 579521200,
  "status": "passed"
});
formatter.match({
  "location": "QuidcoStepD.user_selects_Join_Us()"
});
formatter.result({
  "duration": 698640647,
  "status": "passed"
});
formatter.match({
  "location": "QuidcoStepD.user_is_on_Join_Us_page()"
});
formatter.result({
  "duration": 859965708,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mark",
      "offset": 24
    }
  ],
  "location": "QuidcoStepD.user_enters_First_Name(String)"
});
formatter.result({
  "duration": 5694581803,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testtest",
      "offset": 23
    }
  ],
  "location": "QuidcoStepD.user_enters_Last_Name(String)"
});
formatter.result({
  "duration": 5635869667,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "segun.testest+test11@gmail.com",
      "offset": 19
    }
  ],
  "location": "QuidcoStepD.user_enters_Email(String)"
});
formatter.result({
  "duration": 6313157281,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mark01",
      "offset": 22
    }
  ],
  "location": "QuidcoStepD.user_enters_password(String)"
});
formatter.result({
  "duration": 6000563384,
  "status": "passed"
});
formatter.match({
  "location": "QuidcoStepD.user_select_Join_Us()"
});
formatter.result({
  "duration": 4254886346,
  "status": "passed"
});
formatter.match({
  "location": "QuidcoStepD.user_is_on_User_Home_page()"
});
formatter.result({
  "duration": 4782470080,
  "status": "passed"
});
});