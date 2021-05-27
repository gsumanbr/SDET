Feature: Validate the amazon web site

Scenario: check the title of amazon page
Given the user is on amazon page
When the title of the page has amazon keyword
Then close the browser


Scenario: search an item1
Given the user is on amazon page
When the title of the page has amazon keyword
Then select Books a category
Then type da vinci code
And click magnifier button
Then check the title of the page
Then close the browser

Scenario: check the footer links
Given the user is on amazon page
Then check the total number footer links present on the page
Then close the browser

Scenario: check the total number of hyperlinks present on the page
Given the user is on amazon page
Then check the total number of hyper links present
Then close the browser