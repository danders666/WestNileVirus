package westnilevirus;


public class DataPoint
{
    private int count;
    private String item;
    
    public DataPoint(){
    
    }
    
    public int getCount(){
        return count;
    }
    public String getItem(){
        return item;
    }
    
    @Override
    public String toString(){
        return "County " + item + " with " + count + " infections";
    }
}
