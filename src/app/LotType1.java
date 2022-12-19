package app;

/**
 * Represents a Triangle
 */
public class LotType1 extends Lot implements Comparable<Lot>
{
    private String id;
    private int base;
    private int height;
    public LotType1(String id, int base, int height) { this.id = id; this.base = base; this.height = height; } 
    @Override
    public int compareTo(Lot lot) 
    {
        if(calculateArea() > lot.calculateArea()) { return 1; }
        else if(calculateArea() < lot.calculateArea()) { return -1; }
        else { return 0; }
    }

    @Override
    public double calculateArea() 
    {
        return (height * base)/2;
    }

    @Override
    public String getID() 
    {
        return id;
    }
}