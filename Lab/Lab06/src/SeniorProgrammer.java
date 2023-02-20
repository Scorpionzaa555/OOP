public class SeniorProgrammer extends Programmer {
    @Override
    public void coding(String str) {
        if(getEnergy() >= 10) {
            System.out.println("Your code is " + str);
            setEnergy(getEnergy() - 5);
            setHappiness(getHappiness() - 5);
        } else {
            System.out.println("ZzZzZz");
            setEnergy(getEnergy() - 5);
            setHappiness(getHappiness() - 5);
        }
    }
    
    public void coding(String str, int num) {
        for(int i = 0; i < num; i++) {
            this.coding(str);
        }
    }
    
    public void compliment(Programmer p) {
        System.out.println(p.getName() + " in a good mood");
        p.setHappiness(p.getHappiness() + 20);
    }
    
    public void blame(Programmer p) {
        System.out.println(p.getName() + " in a bad mood");
        p.setHappiness(p.getHappiness() - 20);
    }
}
