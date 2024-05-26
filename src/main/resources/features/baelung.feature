Feature: User list
  Scenario: client makes call to /users
    When the client calls users
    Then the client receives status code of 200
    And the client receives a user list array
