package modules.Gameplay;

import globals.TestConditions;
import pages.DealerTable;
import utilities.handlers.*;
import utilities.objects.CustomAssert;

public class GameTest27 extends Gameplay {

    static double balanceAfterBetting = 0.0;

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 27");
        System.out.println("Actual Results: ");

        balanceAfterBetting = GetHandler.getDouble(DealerTable.Label.BalanceValue);
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 300);

        while (!TestConditions.isPlayerWin(getRoundResult())) {
            placeAndConfirmAnyBettingOptions();
            balanceAfterBetting = GetHandler.getDouble(DealerTable.Label.BalanceValue);
            WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 300);
        }

        VerificationHandler.verifyIfDisplayed(DealerTable.Label.YouWon, 5);
        CustomAssert.assertTrue(TestConditions.isWin(DealerTable.BettingOption.Player),
                "** Winning Betting Options is Highlighted",
                "** Winning Betting Options is Not Highlighted");

        WaitHandler.waitVisibility(DealerTable.Label.PlaceYourBetsPlease, 300);

        CustomAssert.assertTrue(getUpdatedBalance() > balanceAfterBetting,
                "** Balance is Updated",
                "** Balance is Not Updated");

        System.out.println();
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 300);
        EventHandler.click(DealerTable.Button.Back);
    }

}
