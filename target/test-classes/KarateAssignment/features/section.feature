Feature: TODOist API Assignment

Background:
    * url baseURL


Scenario: Sections
    Given path "sections"
    * def parameters =
    """
        {
            project_id : '#(projectID)'
        }
    """
    And params parameters
    Given header Authorization = 'Bearer '+tokenID
    When method GET
    Then status 200

    #Create a new section
    Given path "sections"
* def body = read("Data.json")
And request body.createSections
Given header Authorization = 'Bearer '+tokenID
When method POST
Then status 200
* def sectionID = response.id

#Get a single section
    Given path 'sections/'+sectionID
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200
#Update section
    Given path 'sections/'+sectionID   
    * def body1 = read("Data.json")
    And request body1.updateSection
    Given header Authorization = ' Bearer '+ tokenID
    When method POST
    Then status 204

#Delete a section
Given path 'sections/'+sectionID
Given header Authorization = ' Bearer '+ tokenID
When method Delete
Then status 204

#Delete a project
Given path 'projects/'+projectID
Given header Authorization = ' Bearer '+ tokenID
When method Delete
Then status 204

    #* def id = call read('task.feature') {sectID : '#(sectionID)'}