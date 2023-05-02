package l1;

public class Int {
    private int original;

    public Int(){
        this(0);
    }
    public Int(int value){
        this.original = value;
    }

    public void increment(){
        this.original++;
    }

    public void decrement(){
        this.original--;
    }

    public void add(Int value){
        this.original += value.original;
    }

    public void substract(Int value){
        this.original -= value.original;
    }

    public long toLong(){
        return (long) this.original;
    }

    public double toDouble(){
        return (double) this.original;
    }

    public void multiply(Int value){
        this.original *= value.original;
    }

    public void divide(Int value){
        this.original /= value.original;
    }

    public boolean equals(Int value){
        if(this.getClass() != value.getClass()){
            return false;
        }

        return value.original == this.original;
    }

    public boolean lessZero(){
        return this.original < 0;
    }

    public boolean aboveZero(){
        return this.original > 0;
    }

    public void isNegative(){
        this.original = -this.original;
    }

    public void setBit(int bit){
        this.original |= (1 << bit);
    }

    public void clearBit(int bit){
        this.original &= ~(1 << bit);
    }

    @Override
    public String toString(){
        return String.valueOf(this.original);
    }

    public static void main(String[] args) {

    }
}