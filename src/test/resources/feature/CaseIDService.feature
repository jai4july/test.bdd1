Feature: Case ID Service Feature Mulesoft API

@REGRESSION
@SINGLE_TC_RUN=true
Scenario: CASE ROUTING NEGATIVE SCENARIO
When check if the status code is 400 if policyType is not specified



@REGRESSION
@SMOKE
@SINGLE_TC_RUN=false
Scenario: CASE ROUTING POSITIVE SCENARIO
When Check if the status code is 200 for positive caseroutingservice

