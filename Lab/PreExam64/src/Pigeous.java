public class Pigeous extends Bird{
    public Pigeous() {
        this("", 0);
    }

    public Pigeous(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void eat(Food f) {
        setPower(getPower() + (f.getPower())*2);
    }
    
    @Override
    public void fly() {
        System.out.println(getName() + " fly fly ....");
    }
    
    @Override
    public void wingAttack(Animal a) {
        a.setPower(a.getPower() - 5);
    }
    
    public void wingAttack(Animal a, int times) {
        for(int i = 0; i < times; i++) {
            a.setPower(a.getPower() - 5);
        }
    }
}
