import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    //private Account[] acct;
    private ArrayList<Account> acct;
    //private int numOfAccount;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //this.acct = new Account[5];
        this.acct = new ArrayList<>();
    }
    
    public void addAccount(Account acct) {
//        this.acct[numOfAccount] = acct;
//        this.numOfAccount++;
        this.acct.add(acct);
    }
    
    public Account getAccount(int index) {
        //return acct[index];
        return acct.get(index);
    }

    public int getNumOfAccount() {
        //return numOfAccount;
        return acct.size();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + getNumOfAccount();
    }
}
