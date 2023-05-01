import java.io.Serializable;
public class Student implements Serializable {
    private String ID;
    private String name;
    private int money;

    public Student(String ID, String name, int money) {
        this.ID = ID;
        this.name = name;
        this.money = money;
    }
  
    public String getID() {
      return ID;
    }
  
    public void setID(String ID){
      this.ID = ID;
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public double getmoney() {
      return GPA;
    }
  
    public void setmoney(int money) {
      this.money = money;
    }
}
