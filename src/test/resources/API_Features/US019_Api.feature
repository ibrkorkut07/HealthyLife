Feature: Admin

  @ApiRegistrant
  Scenario:
    Given user sends the get request for Staff data
    And user deserializes data to Java for Staff
    And user saves the users data to correspondent files for Staff



  @Validate_them_all_with_DB
  Scenario Outline: Data Base Staff validation with id

    Given user connects to the Staff database
    And user selects all Staff "id" column data
    And user verify Staff "<id>" with the database
    Then close the connection

    Examples: test data
      |id|
      |15529|