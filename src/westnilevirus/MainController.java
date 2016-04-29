/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package westnilevirus;

import com.google.gson.Gson;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author danders666
 */
public class MainController implements Initializable {
    private WestNile dataSet;
    @FXML
    private BarChart chart;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String s = "https://data.colorado.gov/api/views/8ny6-t8g8/";
        URL myURL = null;
        try {
            myURL = new URL(s);
        } catch (Exception e) {
            System.out.println("Improper URL " + s);
            System.exit(-1);
        }
     
        // read from the URL
        Scanner scan = null;
        try {
            scan = new Scanner(myURL.openStream());
        } catch (Exception e) {
            System.out.println("Could not connect to " + s);
            System.exit(-1);
        }
        
        String str = new String();
        while (scan.hasNext()) {
            str += scan.nextLine() + "\n";
        }
        scan.close();
        
        Gson myGSON = new Gson();
        dataSet = myGSON.fromJson(str, WestNile.class);
        
        XYChart.Series<String, Number> percentImmunized = new XYChart.Series();
        for(DataPoint d : dataSet.getDataPoints()){
            if(d.getItem()!=null){
            percentImmunized.getData().add(new XYChart.Data(d.getItem(), d.getCount()));
            }
        }
        chart.getData().add(percentImmunized);
         
    }
    
} 
    

