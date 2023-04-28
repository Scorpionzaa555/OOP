public class CheckingAccount extends Account {
    private double credit;
    
    public CheckingAccount() {
        super(0.0, "");
        this.credit = 0.0;
    }
    
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }
    
    public void setCredit(double credit) {
        if(credit > 0) {
            this.credit = credit;
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    public double getCredit() {
        return this.credit;
    }
    
    @Override
    public void withdraw(double amount) throws WithdrawException {
        if (amount > 0) {
            if (this.balance - amount >= 0) {
                this.balance = this.balance - amount;
                System.out.println(amount + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            } else if (this.balance - amount < 0 && this.balance - amount + this.credit >= 0) {
                this.credit = this.balance - amount + this.credit;
                this.balance = 0;
                System.out.println(amount + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            } else if (this.balance - amount < 0 && this.balance - amount + this.credit < 0) {
                throw new WithdrawException("WithdrawException: Account " + this.name + " has not enough money.");
            }
        } else {
            super.withdraw(amount);
        }
    }
    
    public void withdraw(String a) throws WithdrawException {
        this.withdraw(Double.parseDouble(a));
    }
    
    @Override
    public String toString() {
        return "The " + getName() + " account has " + getBalance() + " baht and " + getCredit() + " credits.";
    }
}
