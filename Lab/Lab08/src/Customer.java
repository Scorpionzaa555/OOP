import java.util.ArrayList; //3

public class Customer {
    private String firstName;
    private String lastName;
    //private Account[] acct;
    private ArrayList acct; //3
    //private int numOfAccount;
    
    public Customer() {
        this("", "");
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //this.acct = new Account[5];
       this.acct = new ArrayList<Account>(); //3
    }
    
    public void addAccount(Account acct) {
        //this.acct[numOfAccount] = acct;
        //this.numOfAccount++;
        this.acct.add(acct); //3
    }
    
    public Account getAccount(int index) {
       //return acct[index];
       return (Account)acct.get(index); //3
    }

    public int getNumOfAccount() {
      //return numOfAccount;
        return acct.size(); //3
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
