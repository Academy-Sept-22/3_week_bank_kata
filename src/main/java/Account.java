import java.util.ArrayList;
import java.util.List;

public class Account {

    private int balance;

    public Account(int balance){
        this.balance = balance;
    }

    public void deposit(int amount) {
        throw new UnsupportedOperationException();
    }

    public void withdraw(int amount) {
        throw new UnsupportedOperationException();
    }

    public List<String> getTransactionList() {
        throw new UnsupportedOperationException();
    }
}
