#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: VirerStory
  En tant que président du club, je veux que le coach vire un joueur

  @tag1
  Scenario Outline: le coach vire un attaquant
    Given un club nommé <nomClub>, ayant <nomJoueurAT> et <nomJoueurDF> et un coach nommé <nomCoach>
    When le coach vire le joueur avant-centre <nomPoste> de l équipe
    Then l attanquant quitte le club
    
    Examples: 
      | nomClub  | joueurAT  | joueurDF  | nomCoach  | nomPoste |
      | Real 		 | Benzema   | Ramos     | Loti      | AT				|

  @tag2
  Scenario Outline: le coach vire un défenseur
    Given un club nommé <nomClub>, ayantt <nomJoueurAT> et <nomJoueurDF> et un coach nommé <nomCoach>
    When le coach vire le joueur défenseur <nomPoste> de l équipe
    Then le défenseur quitte le club

    Examples: 
      | nomClub  | joueurAT  | joueurDF  | nomCoach  | nomPoste |
      | Lyon 		 | Deremal   | loyit     | pali      | DF				|


