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
public class Customer {
    
    private String custLastName;
    private String custFirstName;
    private String custEmailID;
    private String custContactNo;
    private String custGender;
    private String custPassportNo;
    private String custMiddleName;
    private String Dob;
    private String flightClass;
    private String airlineName;
    private int custFlightno;
    private String custSource;
    private String custDestination;
    private String custDepTime;
    private String custArrTime;
    private String custSeatNo;
    

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getCustFlightno() {
        return custFlightno;
    }

    public void setCustFlightno(int custFlightno) {
        this.custFlightno = custFlightno;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustDestination() {
        return custDestination;
    }

    public void setCustDestination(String custDestination) {
        this.custDestination = custDestination;
    }

    public String getCustDepTime() {
        return custDepTime;
    }

    public void setCustDepTime(String custDepTime) {
        this.custDepTime = custDepTime;
    }

    public String getCustArrTime() {
        return custArrTime;
    }

    public void setCustArrTime(String custArrTime) {
        this.custArrTime = custArrTime;
    }

    public String getCustSeatNo() {
        return custSeatNo;
    }

    public void setCustSeatNo(String custSeatNo) {
        this.custSeatNo = custSeatNo;
    }
    
    

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }
    

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public String getCustMiddleName() {
        return custMiddleName;
    }

    public void setCustMiddleName(String custMiddleName) {
        this.custMiddleName = custMiddleName;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    public String getCustEmailID() {
        return custEmailID;
    }

    public void setCustEmailID(String custEmailID) {
        this.custEmailID = custEmailID;
    }

    public String getCustContactNo() {
        return custContactNo;
    }

    public void setCustContactNo(String custContactNo) {
        this.custContactNo = custContactNo;
    }


    public String getCustGender() {
        return custGender;
    }

    public void setCustGender(String custGender) {
        this.custGender = custGender;
    }

    public String getCustPassportNo() {
        return custPassportNo;
    }

    public void setCustPassportNo(String custPassportNo) {
        this.custPassportNo = custPassportNo;
    }
    
    @Override
    public String toString(){
       return this.getCustFirstName();
    }

}
