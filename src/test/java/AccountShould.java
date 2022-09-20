import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class AccountShould {
    @ExtendWith(MockitoExtension.class)

    @Mock Transactions transactions;

    @Mock Transaction transaction;

    void deposit_calls_() {
        Account account = new Account();
        account.deposit(500);

        verify(transactions).add(transaction);
    }
}