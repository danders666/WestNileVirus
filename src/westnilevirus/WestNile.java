package westnilevirus;
public class WestNile {
    private DiseaseType[] columns;
    
    public DataPoint[] getDataPoints(){
        return columns[0].getDataPoint();
    }
    @Override
    public String toString(){
        return columns[0].toString();
    }
    
}
