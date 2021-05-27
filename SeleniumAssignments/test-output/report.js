$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/renukuntlas/workspace/SeleniumAssignments/src/test/java/Features/OrangeHRM.Feature");
formatter.feature({
  "line": 1,
  "name": "Validate OrangeHRP Page",
  "description": "",
  "id": "validate-orangehrp-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validating OrangeHRP application Login",
  "description": "",
  "id": "validate-orangehrp-page;validating-orangehrp-application-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "When I am in OrangeHRP Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Login to Application",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Dashboard page is available",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on Admin menu",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.when_I_am_in_OrangeHRP_Application()"
});
formatter.result({
  "duration": 8605566400,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.login_to_Application()"
});
formatter.result({
  "duration": 3361810800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.dashboard_page_is_available()"
});
formatter.result({
  "duration": 1490913800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.click_on_Admin_menu()"
});
formatter.result({
  "duration": 1534336700,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 822616100,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Validating Vacancies",
  "description": "",
  "id": "validate-orangehrp-page;validating-vacancies",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@SmokeTest"
    },
    {
      "line": 18,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "When I am in OrangeHRP Application",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Login to Application",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I click on Recruitment",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Click on Vacancies",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.when_I_am_in_OrangeHRP_Application()"
});
formatter.result({
  "duration": 6639666700,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.login_to_Application()"
});
formatter.result({
  "duration": 3368122900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.i_click_on_Recruitment()"
});
formatter.result({
  "duration": 2719891100,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.click_on_Vacancies()"
});
formatter.result({
  "duration": 80323100,
  "error_message": "org.openqa.selenium.interactions.MoveTargetOutOfBoundsException: move target out of bounds\n  (Session info: chrome\u003d89.0.4389.114)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027BGLRT49500269\u0027, ip: \u002710.104.64.45\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.114, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\RENUKU~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:61999}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0a37d0f7724127f1386d9b90406a3945\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:618)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:639)\r\n\tat com.qa.pages.OrangeHrpPages.settoVacancies(OrangeHrpPages.java:165)\r\n\tat StepDefinations.OrangeHRP_StepDefinition.click_on_Vacancies(OrangeHRP_StepDefinition.java:73)\r\n\tat ✽.Then Click on Vacancies(C:/Users/renukuntlas/workspace/SeleniumAssignments/src/test/java/Features/OrangeHRM.Feature:23)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 27,
  "name": "Validating OrangeHRP application Logout",
  "description": "",
  "id": "validate-orangehrp-page;validating-orangehrp-application-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "When I am in OrangeHRP Application",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "Login to Application",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I click on UserProfile",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.when_I_am_in_OrangeHRP_Application()"
});
formatter.result({
  "duration": 6389393100,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.login_to_Application()"
});
formatter.result({
  "duration": 3374567400,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.i_click_on_UserProfile()"
});
formatter.result({
  "duration": 1503676200,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.click_on_Logout()"
});
formatter.result({
  "duration": 1250832300,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 821296700,
  "status": "passed"
});
});