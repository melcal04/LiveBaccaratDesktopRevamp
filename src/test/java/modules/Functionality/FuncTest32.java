package modules.Functionality;

import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class FuncTest32 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 32");
        System.out.println("Actual Results: ");

        WaitHandler.waitInvisibility(DealerTable.Label.Shuffle, 300);
        CustomAssert.assertEquals(5, GetHandler.getTextArray(DealerTable.Container.Predictions).length,
                "** Prediction in All Road Maps is Displayed",
                "** Prediction in All Road Maps is Not Displayed");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}
