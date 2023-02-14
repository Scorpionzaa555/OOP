public class Fraction {
    public int topN, btmN;
    public String toFraction () {
        return topN + "/" + btmN;
    }
    
    public String toFloat () {
        double d1 = topN, d2 = btmN, num = d1/d2;
        String str = Double.toString(num);
        return str;
    } 
    
    public void addFraction (Fraction f) {
        if (btmN == f.btmN) {
            topN += f.topN;
            btmN = f.btmN;
        } else {
            topN = topN*f.btmN+f.topN*btmN;
            btmN *= f.btmN;
        }
    }
    
    public boolean myEquals (Fraction x) {
        return (this.topN == x.topN) && (this.btmN == x.btmN);
    }
    
    public void LowestTermFrac () {
        int divisor = 0;
        
        for(int i = topN; i>= 1; i--) {
            if (topN % i == 0 && btmN % i == 0) {
                divisor = i;
                break;
            }
        }
        
        if (divisor != 0) {
            topN /= divisor;
            btmN /= divisor;
        }
    }
}
