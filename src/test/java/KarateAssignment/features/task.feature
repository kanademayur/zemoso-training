Feature: TODOist API Assignment

Background:
    * url baseURL

@tag1
Scenario: Tasks
    Given path "tasks"
    Given header Authorization = 'Bearer '+tokenID
    When method GET
    Then status 200

    #Create a new task
    Given path "tasks"
* def body = read("Data.json")
And request body.createTasks
Given header Authorization = 'Bearer '+tokenID
When method POST
Then status 200
* def taskID = response.id

#Get a active task
    Given path 'tasks/'+taskID
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200

#Update a task
    Given path 'tasks/'+taskID   
    * def body1 = read("Data.json")
    And request body1.updateTasks
    Given header Authorization = ' Bearer '+ tokenID
    When method POST
    Then status 204

#Close a task
Given path 'tasks/'+taskID+"/close"
Given header Authorization = ' Bearer '+ tokenID
When method POST
Then status 204

#Reopen a task
Given path 'tasks/'+taskID+"/reopen"
Given header Authorization = ' Bearer '+ tokenID
When method POST
Then status 204

* def id = call read('ucomment.feature') {task_id : '#(taskID)'}