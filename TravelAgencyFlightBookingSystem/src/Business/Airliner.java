  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Team Void
 */
public class Airliner {
    
    private String airlinerName;  
    private String airlinerAddress;
    private int totalFlightsPerDay;
    
    
 /*   private FlightScheduleDirectory flightDirectory;
    private ArrayList<FlightScheduleDirectory> scheduleList; */

    
    
    public String getAirlinerAddress() {
        return airlinerAddress;
    }

    public void setAirlinerAddress(String airlinerAddress) {
        this.airlinerAddress = airlinerAddress;
    }

    public int getTotalFlightsPerDay() {
        return totalFlightsPerDay;
    }

    public void setTotalFlightsPerDay(int totalFlightsPerDay) {
        this.totalFlightsPerDay = totalFlightsPerDay;
    }
   

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

   /* public FlightScheduleDirectory getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(FlightScheduleDirectory flightDirectory) {
        this.flightDirectory = flightDirectory;
    }

    public ArrayList<FlightScheduleDirectory> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(ArrayList<FlightScheduleDirectory> scheduleList) {
        this.scheduleList = scheduleList;
    }*/
    
    @Override
    public String toString(){
       return this.getAirlinerName();
    }
    
    
}
