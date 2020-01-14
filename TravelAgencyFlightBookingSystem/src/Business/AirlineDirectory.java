/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Team Void
 */
public class AirlineDirectory {
    
    private ArrayList<Airliner> airlineList  ;

    public AirlineDirectory() {
        
        airlineList = new ArrayList<>();
    }
    

    
    public ArrayList<Airliner> getAirlineList() {
        return airlineList;
    }

    public void setAirlineList(ArrayList<Airliner> airlineList) {
        this.airlineList = airlineList;
    }

    public Airliner addAirliner() {
       
        
        Airliner a = new Airliner();
        airlineList.add(a);
       // System.out.println(airlineList);
        return a;  
    }


    public void deleteAirliner(Airliner a) {
        
        airlineList.remove(a);
    }
    
    
}
