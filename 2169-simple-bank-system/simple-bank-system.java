class Bank {
    private long[] accounts;
    public Bank(long[] balance) {
        accounts = new long[balance.length];
        System.arraycopy(balance, 0, accounts, 0, balance.length);
        }
    public boolean transfer(int account1, int account2, long money) {
        if (!isValidAccount(account1) || !isValidAccount(account2)) return false;
        if (accounts[account1 - 1] < money) return false; // Not enough balance
        accounts[account1 - 1] -= money;
        accounts[account2 - 1] += money;
        return true;
    }
    public boolean deposit(int account, long money) {
        if (!isValidAccount(account)) return false;
        accounts[account - 1] += money;
        return true;
    }
    public boolean withdraw(int account, long money) {
        if (!isValidAccount(account)) return false;
        if (accounts[account - 1] < money) return false;
        accounts[account - 1] -= money;
        return true;
    }
    private boolean isValidAccount(int account) {
        return account >= 1 && account <= accounts.length;
    }
}