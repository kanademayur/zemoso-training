Feature: TODOist API Assignment

Background:
    * url baseURL

@tag1
Scenario: CRUD Projects
    Given path 'projects'
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200
  

#Create Project
Given path "projects"
* def body = read("Data.json")
And request body.createProject
Given header Authorization = 'Bearer '+tokenID
When method POST
Then status 200
* def projectID = response.id

#Get project
    Given path 'projects/'+projectID
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200
#Update Project
    Given path 'projects/'+projectID   
    * def body1 = read("Data.json")
    And request body1.updateProject
    Given header Authorization = ' Bearer '+ tokenID
    When method POST
    Then status 204
    

  #Get all colaboratorss

  Given path 'projects/'+projectID +"/collaborators"
  Given header Authorization = ' Bearer '+ tokenID
  When method GET


  * def id = call read('section.feature') {project_id : '#(projectID)'}