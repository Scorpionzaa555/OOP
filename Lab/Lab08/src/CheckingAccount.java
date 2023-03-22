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
    public void withdraw(double a) {
        if(getBalance() - a > 0) {
            setBalance(getBalance() - a);
            System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + getCredit() + ".");
        }
        else {
            if(getBalance() - a + getCredit() > 0) {
                setCredit(this.credit - a);
                setBalance(0);
                System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + getCredit() + ".");
            }
            else {
                System.out.println("Not enough money!");
            }
        }
    }
    
    public void withdraw(String a) {
        this.withdraw(Double.valueOf(a));
    }
    
    @Override
    public String toString() {
        return "The " + getName() + " account has " + getBalance() + " baht and " + getCredit() + " credits.";
    }
}
