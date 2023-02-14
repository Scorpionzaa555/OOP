public class Cat {
    private String name, color;
    public double height, weight;
    
    private void setWeight (double w) {
        if (w >= 0) {
            this.weight = w;   
        } else {
            System.out.println("Error");
        }
    }

    private void setHeight (double h) {
        if (h >= 0) {
            this.height = h;   
        } else {
            System.out.println("Error");
        }
    }

    private void setName (String n) {
        this.name = n;
    }

    private void setColor (String c) {
        this.color = c;
    }
    
    public void upWeight (double w) {
        if (w >= 0) {
            setWeight(this.weight + w);
        } else {
            System.out.println("Error");
        }
    }
    
    public void downWeight (double w) {
        if (w >= 0) {
            setWeight(this.weight - w);
        } else {
            System.out.println("Error");
        }
    }
    
    public void upHeight (double h) {
        if (h >= 0) {
            setHeight(this.height + h);
        } else {
            System.out.println("Error");
        }
    }
    
    public void defineCat (String n, String c) {
        setName(n);
        setColor(c);
    }
    
    public void speak () {
        System.out.println("Name : " + this.name);
        System.out.println("Color : " + this.color);
        System.out.println("Height : " + this.height);
        System.out.println("Weight : " + this.weight);
    }
}
