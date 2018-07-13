Feature: Case Routing Mulesoft API
Users should be able to submit GET and POST request to a case routing web service 

@SMOKE
@REGRESSION
@SINGLE_TC_RUN=false
Scenario: CASE ROUTING POSITIVE SCENARIO WITH TERM LIFE
When Check if the status code is 200 and correct


@SMOKE
Scenario: CASE ROUTING POSITIVE SCENARIO WITH WHOLE LIFE
Given the client authenticate with username and password
When the client send POST to a "/list" with body 
Then the response code should be "200"
And the response body should expect "{success :true}"
When the client sends GET to "/list"
Then the response code should be "200"
And the response body should expect "{"items":["item1"]"


@SMOKE 
@REGRESSION
@SINGLE_TC_RUN=false
Scenario: CASE ROUTING NEGATIVE SCENARIO WITHOUT PRODUCT CODE VALUE
When Make sure the file you want to access is available

@Manual	
Scenario: CASE ROUTING NEGATIVE SCENARIO WITHOUT CASETYPE VALUE
When Do not test this its a manual test case

@NEGATIVE
@REGRESSION
@SINGLE_TC_RUN=false
Scenario: CASE ROUTING NEGATIVE SCENARIO WITHOUT GoCODE PARAM
When Testing negative scenario dividing by 0


Scenario: List fruit
  Given the system knows about the following fruit:
    | name       | color  |
    | banana     | yellow |
    | strawberry | red    |
  When the client requests a list of fruit
  Then the response is a list containing 2 fruits
  And one fruit has the following attributes:
    | attribute | type   | value  |
    | name      | String | banana |
    | color     | String | yellow |
  And one fruit has the following attributes:
    | attribute | type   | value      |
    | name      | String | strawberry |
    | color     | String | red        |


