import java.io.Serializable;
public class Student implements Serializable {
    private String name;
    private int ID;
    private int money;

    public Student() {
        this("", 0, 0);
    }
    
    public Student(String name, int ID, int money) {
        this.name = name;
        this.ID = ID;
        this.money = money;
    }
  
    public int getID() {
      return ID;
    }
  
    public void setID(int ID){
      this.ID = ID;
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public int getmoney() {
      return money;
    }
  
    public void setmoney(int money) {
      this.money = money;
    }
}
