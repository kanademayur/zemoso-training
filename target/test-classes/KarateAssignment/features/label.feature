Feature: TODOist API Assignment

Background:
    * url baseURL
@tag1
Scenario: Labels
    Given path "labels"
    Given header Authorization = 'Bearer '+tokenID
    When method GET
    Then status 200

    #Create a new label
    Given path "labels"
* def body = read("Data.json")
And request body.createLabel
Given header Authorization = 'Bearer '+tokenID
When method POST
Then status 200
* def labelID = response.id

#Get a label
    Given path 'labels/'+labelID
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200

#Update a label
    Given path 'labels/'+labelID   
    * def body1 = read("Data.json")
    And request body1.updateLabel
    Given header Authorization = ' Bearer '+ tokenID
    When method POST
    Then status 204

#Delete a label
Given path 'labels/'+labelID
Given header Authorization = ' Bearer '+ tokenID
When method DELETE
Then status 204