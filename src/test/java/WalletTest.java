import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WalletTest {

    Wallet testWallet;

    @Before
    public void create(){
        testWallet = new Wallet();
    }

    @Test
    public void shouldAddToCashMoneyWhenGivenChips(){

        testWallet.addCashMoney(10);

        double actualCashMoney = testWallet.getCashMoney();

        assertEquals(200.00, actualCashMoney, 0.01);
    }

    @Test
    public void shouldAddWinningsChips(){

        testWallet.addWinningsChips(10);

        int actualChips = testWallet.getChips();

        assertEquals(20, actualChips);
    }

    @Test
    public void shouldAddChipsWhenGivenMoneyPayment(){
        testWallet.payForChips(20.00);

        int actualChips = testWallet.getChips();
        double actualMoneyAfterChipConversion = testWallet.getCashMoney();

        assertEquals(12, actualChips);
        assertEquals(80.00, actualMoneyAfterChipConversion, 0.01);
    }

    @Test
    public void shouldSubtractChipsAfterALoss(){
        testWallet.subtractChipsFromWalletAfterALoss(20.00);

        int actualChipsAfterLoss = testWallet.getChips();

        assertEquals(8, actualChipsAfterLoss);
    }

}