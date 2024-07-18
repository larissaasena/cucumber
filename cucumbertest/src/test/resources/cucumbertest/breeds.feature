Feature: Check the correctness of limit parameter for breeds API
  Returns whether limit is valid or not

  # Using scenario outline I am able to test more than one possibility (happy and unhappy result)
  # with a cleaner code
  Scenario Outline: Limit parameter is or is not valid
    Given limit parameter as "<number>"
    When I check if it is an integer
    Then I should assert "<return>"

    Examples:
      | number             | return     |
      | 1                  | valid!     |
      | 0.5                | not valid! |
      | abc                | not valid! |