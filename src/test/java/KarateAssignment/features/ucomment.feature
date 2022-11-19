Feature: TODOist API Assignment

Background:
    * url baseURL


Scenario: Comments
    Given path "comments"
    * def parameters =
    """
        {
            task_id : '#(taskID)'
        }
    """
    And params parameters
    Given header Authorization = 'Bearer '+tokenID
    When method GET
    Then status 200

    #Create a new comment
    Given path "comments"
* def body = read("Data.json")
And request body.createComment
Given header Authorization = 'Bearer '+tokenID
When method POST
Then status 200
* def commentID = response.id

#Get a comment
    Given path 'comments/'+commentID
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200
#Update a comment
    Given path 'comments/'+commentID   
    * def body1 = read("Data.json")
    And request body1.updateComment
    Given header Authorization = ' Bearer '+ tokenID
    When method POST
    Then status 204