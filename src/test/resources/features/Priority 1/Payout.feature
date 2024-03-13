@Payout @Maintenance
Feature: Payout

  @PayoutWait
  Scenario: PO Fetch: Wait Until There Is A Round Result For Payout
    Given I Go To The Live Casino
    When I Join Live Baccarat Revamp
    And I Enter The Dealer Table
    Then I Place A Bet Until There Is A Round Result For All Payouts
      | Player          |