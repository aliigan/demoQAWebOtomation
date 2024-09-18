@Widgets
Feature: Widgets Page Test Cases


  Background: To access drop-down menus
    When Click to widgets button


  @Accordian
  Scenario: Verifies whether the titles are expanded or not
    Given User is on Accordian menu
    When Click to What is Lorem Ipsum? title
    Then What is Lorem Ipsum title must be collapsed
    When Click to Where does is come from? title
    Then Where dos is come from? title must be expanded
    When Click to Why do we use it? title
    Then Why do we use it? title must be expanded


  @AutoComplate @FillColorInputs
  Scenario: Color selection using autocomplete
    Given User is on Auto Complate menu
    When Type "bl" and select two item in the autocomplete list
    Then The first color must be selected and displayed in the input
    And The second color must be selected and displayed in the input
    When Type "yel" and select the item in the autocomplete list
    Then The color must be selected and displayed in the input


  @DatePicker @FillDateInput
  Scenario: Write a valid date to input
    Given User is on Date Picker menu
    When Update the date in the select date input with "12/04/1995"
    Then Date "12/04/1995" must be selected


  @DatePicker @SelectDate
  Scenario: Date selection via date picker
    Given User is on Date Picker menu
    When Click to date picker
    And Choose month
    And Choose year
    And Select day
    And Select time
    Then Check that the selected time is "January 15, 2023 10:45 PM"





