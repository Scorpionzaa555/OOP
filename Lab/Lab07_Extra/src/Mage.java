public class Mage extends Player{
    public Mage() {
        setHP(10);
        setMP(20);
        setATK(5);
    }
    
    public void addEquipment(Item i) {
        i.use(this);
    }
    
    @Override
    public void attack(Player p) {
        p.attacked(2.5 * getATK());
        setMP(getMP() - 5);
    }
    
    @Override
    public void attacked(double n) {
        setHP(getHP() - n);
    }
}
