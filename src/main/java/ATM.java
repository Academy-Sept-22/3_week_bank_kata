import java.util.List;

public class ATM {
    private BankConsole console;
    private Account account;

    public ATM(BankConsole console, Account account) {
        this.console = console;
        this.account = account;
    }

    public void deposit(int amount) {
        account.deposit(amount);
    }

    public void withdraw(int amount) {
        account.withdraw(amount);
    }

    public void printStatement() {
        List<String> lines = account.getTransactionList();

        for (String line : lines){
            //TODO format
            console.printLine(line);
        }
    }
}
