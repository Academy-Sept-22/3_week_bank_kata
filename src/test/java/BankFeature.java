import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

public class BankFeature {
    @ExtendWith(MockitoExtension.class)

    @Mock BankConsole console;
    Account account = new Account();

    @Test
    void prints_all_transactions() {
        ATM atm = new ATM(console, account);

        atm.deposit(1000);
        atm.deposit(2000);
        atm.withdraw(500);
        atm.printStatment();

        InOrder inOrder = inOrder(console);

        inOrder.verify(console).printLine("date || credit || debit || balance");
        inOrder.verify(console).printLine("14/01/2012 || || 500.00 || 2500.00");
        inOrder.verify(console).printLine("13/01/2012 || 2000.00 || || 3000.00");
        inOrder.verify(console).printLine("10/01/2012 || 1000.00 || || 1000.00");
    }
}
