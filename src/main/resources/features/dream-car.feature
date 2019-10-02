# Created by tcp at 9/14/19
Feature: My Dream Car
  # Enter feature description here

# user: tcp - created on 9/14/19
#
    Scenario: I wanna Ferrari
        Given I have money
        When I buy a car
        Then it must be a Ferrari


    Scenario: I wanna the best car I can afford
        Given I have 1000000 dollars
        When I buy a car
        Then it has to be a "Ferrari"


    Scenario: I wanna the best car I can afford
        Given I have 45000 dollars
        When I buy a car
        Then it has to be a "Camry"

    # user: tcp - created on 9/17/19
    #
    Scenario Outline: the car I can afford
        Given I have <amount> dollars
        When I buy a car
        Then it has to be a "<car>"
        Examples:
            | amount  | car           |
            | 1250000 | Ferrari       |
            | 550000  | McLaren       |
            | 300000  | Acura NSX     |
            | 120000  | Mercedes Benz |
            | 65000   | Corvette      |
            | 40000   | Camry         |

