public class ATM {
    private BankConsole console;
    private Account account;

    public ATM(BankConsole console, Account account) {

        this.console = console;
        this.account = account;
    }

    public void deposit(int i) {
        account.deposit(i);
    }

    public void withdraw(int i) {

    }

    public void printStatment() {

    }
}
