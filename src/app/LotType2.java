package app;
/**
 * Represents a Rectangle
 */
public class LotType2 extends Lot implements Comparable<Lot>
{
    private String id;
    private int width;
    private int length;
    public LotType2(String id, int width, int length) { this.id = id; this.width = width; this.length = length; } 
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
        return width * length;
    }

    @Override
    public String getID() 
    {
        return id;
    }
}