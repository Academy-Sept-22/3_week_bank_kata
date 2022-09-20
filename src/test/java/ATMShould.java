import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;

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
        String header = "Date       || Amount || Balance";
        String transactionLine = "10/01/2012 || 1000   || 1000";

        List<String> line = new ArrayList<>();
        line.add(header);
        line.add(transactionLine);

        given(account.getTransactionList()).willReturn(line);

        atm.printStatement();

        Mockito.verify(console).printLine(header);
        Mockito.verify(console).printLine(transactionLine);
    }

}
