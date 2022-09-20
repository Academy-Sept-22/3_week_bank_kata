import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.nio.charset.MalformedInputException;
import java.util.List;

import static org.mockito.BDDMockito.given;

public class ATMShould {
    @ExtendWith(MockitoExtension.class)

    @Mock
    BankConsole console;
    @Mock
    Account account;

    ATM atm;
    @BeforeEach
    void setup(){
        atm = new ATM(console, account);
    }
    @Test
    void deposit(){
        atm.deposit(200);
        Mockito.verify(account).deposit(200);
    }

    @Test
    void withdraw(){
        atm.withdraw(200);
        Mockito.verify(account).withdraw(200);
    }

    @Test
    void printStatement(){
        List<String> line = new
        given(account.getTransactionList()).willReturn(line);
        atm.printStatement();
        Mockito.verify(console).printLine();
    }

}
