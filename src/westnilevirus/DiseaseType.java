package westnilevirus;
public class DiseaseType
{
    private DataCache cachedContents;
    DiseaseType(){

    }
    public DataPoint[] getDataPoint(){
        return cachedContents.getData();
    }
    @Override
    public String toString(){
        return cachedContents.toString();
    }
}
