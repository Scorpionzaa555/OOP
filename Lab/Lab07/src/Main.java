public class Main {
    public static void main(String[] args) {
//        Account a1 = new Account(50000, "61070033");
//        a1.showAccount();
//        a1.deposit(500);
//        a1.showAccount();
//        a1.withdraw(40000);
//        a1.showAccount();
        
//        CheckingAccount a1 = new CheckingAccount(50000, "61070033", 5000);
//        a1.showAccount();
//        a1.deposit(500);
//        System.out.println(a1);
//        a1.withdraw("40000.0");
//        System.out.println(a1.toString());
        
//        CheckingAccount a1 = new CheckingAccount();
//        a1.deposit(500);
//        System.out.println(a1);
//        a1.withdraw(40000.0);
//        System.out.println(a1.toString());
        
//        Account a1 = new CheckingAccount();
//        a1.setName("Nook");
//        System.out.println(a1);
//        ((CheckingAccount)a1).setCredit(1000);
//        System.out.println(a1);
        
//        CheckingAccount a1 = new CheckingAccount(1000,"62070033",500);
//        Customer c1 = new Customer();
//        Customer c2 = new Customer("Harry","Potter");
//        Customer c3 = new Customer("Harry","Potter",a1);
// 
//        System.out.println(c2);
//        System.out.println(c3);
        
//        CheckingAccount a1 = new CheckingAccount(1000,"62070033",500);
//        Customer c1 = new Customer();
//        Customer c2 = new Customer("Harry","Potter");
//        Customer c3 = new Customer("Harry","Potter",a1);
//        System.out.println(c1.equals(c2));
//        System.out.println(c3.equals(c2));
        
//        Flyable f1 = new Flyable();
//        Floatable f2 = new Floatable();
//        Dieselable d = new Dieselable();
        
//        Pigeon p1 = new Pigeon(10, 15, 20);
//        System.out.println(p1);
//        p1.takeOff();
//        System.out.println(p1);
//        p1.fly();
//        System.out.println(p1);
//        p1.landing();
//        System.out.println(p1);
//        p1.eat("seed");
//        System.out.println(p1);
//        Pigeon p3 = new Pigeon();
//        System.out.println(p3);
        
        Plane p1 = new Plane(200, "IT Airline", "FX-747");
        Ship s1 = new Ship(200);

        System.out.println("=== plane ===");
        p1.startEngine();
        p1.takeOff();
        p1.fly();
        p1.fly();
        p1.honk();
        p1.landing();
        p1.stopEngine();

        System.out.println("=== ship ===");
        s1.startEngine();
        s1.move(2);
        s1.honk();
        s1.stopEngine();
    }
}
