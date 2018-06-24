Feature: CASE ROUTING MULESOFT API

@SMOKE
Scenario: CASE ROUTING POSITIVE SCENARIO WITH TERM LIFE
When Check if the status code is 200 and correct


@SMOKE
Scenario: CASE ROUTING POSITIVE SCENARIO WITH WHOLE LIFE
When Make sure the application has the necessary requirements checked

@SMOKE
Scenario: CASE ROUTING NEGATIVE SCENARIO WITHOUT PRODUCT CODE VALUE
When Make sure the file you want to access is available

@Manual	
Scenario: CASE ROUTING NEGATIVE SCENARIO WITHOUT CASETYPE VALUE
When Do not test this its a manual test case

@NEGATIVE
Scenario: CASE ROUTING NEGATIVE SCENARIO WITHOUT GoCODE PARAM
When Testing negative scenario dividing by 0
