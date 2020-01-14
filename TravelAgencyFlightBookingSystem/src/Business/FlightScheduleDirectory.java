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
public class FlightScheduleDirectory {
    
    public ArrayList<Flight> flightSchedule;
 


    public ArrayList<Flight> getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(ArrayList<Flight> flightSchedule) {
        this.flightSchedule = flightSchedule;
    }

    public FlightScheduleDirectory() {
     
      flightSchedule = new  ArrayList<>();
      
      
    }
       
     public Flight addFlight() 
     {              
        Flight a = new Flight();
        flightSchedule.add(a);
      
        return a;  
    }
    
   
    public ArrayList<Flight> getAvailableFlightList(String source1,String destination1, String date) 
    {
        ArrayList<Flight> list = new ArrayList<>() ;
       
        for(Flight flight : flightSchedule)
        {
          
          if(flight.getSource().equalsIgnoreCase(source1) && flight.getDestination().equalsIgnoreCase(destination1) && flight.getDate().equalsIgnoreCase(date))
          {
              list.add(flight);
             
          }
        }
         return list;
    }

    public void deleteAirliner(Flight a) {
        
        flightSchedule.remove(a);
        
    }
       
    
}
