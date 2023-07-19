import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

    @Test
    public void canDepositAccount() {
        Account chisomAccount = new Account();
        int balance = chisomAccount.balance();
        assertEquals(0, balance);
        //when
        chisomAccount.deposit();
        //check
        balance = chisomAccount.balance();
        assertEquals(0, balance);
    }

    @Test
    public void canDepositTwiceAccount() {
        Account ebubeAccount = new Account();
        ebubeAccount.deposit();
        int newbalance = ebubeAccount.balance();
        assertEquals(0, newbalance);
        //when
        ebubeAccount.deposit();
        //check
        newbalance = ebubeAccount.balance();
        assertEquals(0, newbalance);
    }

    @Test
    public void cannotDepositNegativeAmount() {
        Account davidAccount = new Account();
        davidAccount.deposit();
        int currentbalance = davidAccount.currentbalance();
        assertEquals(0, currentbalance);
        //when
        davidAccount.deposit();
        //check
        currentbalance = davidAccount.currentbalance();
        assertEquals(0, currentbalance);

    }


    }






