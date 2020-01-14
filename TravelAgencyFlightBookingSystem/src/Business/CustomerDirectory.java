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
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;

    public CustomerDirectory() 
    {
        customerList = new ArrayList<>();
    }

    //Getter Setter for List
    
    
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer() {
       
        Customer c = new Customer();
        customerList.add(c);
        return c;
    }
    
    public boolean checkSeat(String airlineName,int flightNo, String seatNo)
    {
        boolean result = false;
        for(Customer customer :customerList)
        {
           if(customer.getAirlineName().equals(airlineName)&& customer.getCustFlightno()== flightNo && customer.getCustSeatNo().equals(seatNo) ) 
           {
              
               result = true;
           }
        }
       return result;
    }


    public void deleteCCustomer(Customer c) {
       
        customerList.remove(c);
          
    }

}
