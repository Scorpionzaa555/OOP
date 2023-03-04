public abstract class Animal {
    private String name;
    private int power;
    private int age;

    public Animal() {
        this.name = "";
        this.power = 0;
        this.age = 0;
    }

    public Animal(String name, int power, int age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public abstract void eat(Food f);

    public boolean equals(Animal a) {
        //if(a.getAge() == )
        return a.getName().equals(this.name) && (a.getAge() == this.getAge());
        //c.getFirstName().equals(this.firstName) && c.getLastName().equals(this.lastName);
    }

    @Override
    public String toString() {
        return "Animal : name = " + getName() + ", power = " + getPower() + ", age = " + getAge();
    }
}
