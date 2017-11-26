Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition

  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
