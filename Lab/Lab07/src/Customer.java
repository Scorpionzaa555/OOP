public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    
    public Customer() {
        this.firstName = "";
        this.lastName = "";
        this.acct = null;
    }
    
    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }
    
    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }
    
    public CheckingAccount getAcct() {
        return this.acct;
    }
    
    @Override
    public String toString() {
        if(getAcct() == null) {
            return getFirstName() + " " + getLastName() + " doesn't have account";
        } else {
            return "The " + getFirstName() + " account has " + getAcct().getBalance() + " baht and " + getAcct().getCredit() + " credits.";
        }
    }
    
    public boolean equals(Customer c) {
        return c.getFirstName().equals(this.firstName) && c.getLastName().equals(this.lastName);
    }
}
