import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserMenuOptionsTest {
    private UserMenuOptions menu;

    @Test
    public void shouldReturnANewPlayer(){
      menu = new UserMenuOptions();

     Player actualPlaya = menu.createNewPlayer("Brian");

      assertEquals("Brian", actualPlaya.getPlayerName());
      assertEquals(100.00, actualPlaya.getWallet().getCashMoney(), 0.01);
      assertEquals(10, actualPlaya.getWallet().getChips());
    }


}