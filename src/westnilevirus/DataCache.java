package westnilevirus;
import westnilevirus.DataPoint;

/**
 * Write a description of class DataCache here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataCache
{
    private DataPoint[] top;
    public DataCache(){
    }
    public DataPoint[] getData(){
        return top;
    }
    @Override
    public String toString(){
        String outputString = "";
        for(DataPoint dp: top){
            outputString+=dp.toString();
            outputString+= "\n";
        }
        return outputString;
    }
}
