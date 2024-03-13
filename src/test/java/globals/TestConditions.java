package globals;

import utilities.objects.Helper;
import utilities.handlers.GetHandler;
import utilities.objects.Component;

public class TestConditions {

    /***************************************************************************************************************
     * These methods checks the results of each round in the Live Roulette Revamp Game.
     ***************************************************************************************************************/

    public static boolean isWin(Component component) {
        return GetHandler.getAttribute(component, "class").contains("win");
    }

    public static boolean isTieWin(String[] result) {
        return Helper.find(TestVariables.TIE, result);
    }

    public static boolean isNaturalTie(String[] result) {
        return Helper.find(TestVariables.NATURAL_TIE, result);
    }

    public static boolean isNaturalWin(String[] result) {
        return Helper.find(TestVariables.NATURAL_WIN, result);
    }

    public static boolean isPlayerWin(String[] result) {
        return Helper.find(TestVariables.PLAYER, result);
    }

    public static boolean isPlayerPairWin(String[] result) {
        return Helper.find(TestVariables.PLAYER_PAIR, result);
    }

    public static boolean isPlayerDragonBonusWin(String[] result) {
        return Helper.contains(TestVariables.PLAYER_DRAGON_BONUS, result);
    }

    public static boolean isBankerWin(String[] result) {
        return Helper.find(TestVariables.BANKER, result);
    }

    public static boolean isBankerPairWin(String[] result) {
        return Helper.find(TestVariables.BANKER_PAIR, result);
    }

    public static boolean isBankerDragonBonusWin(String[] result) {
        return Helper.contains(TestVariables.BANKER_DRAGON_BONUS, result);
    }

    public static boolean isFortune2CardsWin(String[] result) {
        return Helper.contains(TestVariables.FORTUNE_SIX, result);
    }

}
