/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.AirlineDirectory;
import Business.Customer;
import Business.CustomerDirectory;
import Business.Flight;
import Business.FlightScheduleDirectory;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Team Void
 */
public class BookFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookFlightJPanel
     */
 
    private CustomerDirectory  customerDirectory;
    private FlightScheduleDirectory flightScheduleDirectory;
    private JPanel rightPanel;
    private AirlineDirectory airlineDirectory;
    private Flight flight;

   public BookFlightJPanel(JPanel rightPanel, Flight flight, CustomerDirectory customerDirectory, FlightScheduleDirectory flightScheduleDirectory,AirlineDirectory airlineDirectory) {
        initComponents();
        
        this.flight= flight;
        this.rightPanel =  rightPanel;
        this.customerDirectory = customerDirectory;
        this.flightScheduleDirectory = flightScheduleDirectory;
        this.airlineDirectory = airlineDirectory;
        
          lblAirlinerName.setText(flight.getAirlineName());
          lblSource.setText(flight.getSource());
          lblDestination.setText(flight.getDestination());
          lblDate.setText(flight.getDate());
          lblDuration.setText(Integer.toString(flight.getDuration()));
          lblFlightNumber.setText(Integer.toString(flight.getFlightNumber()));
          lblDepartureTime.setText(flight.getDepartureTime());
          lblArrivalTime.setText(flight.getArrivalTime());
          lblPrice.setText(Double.toString(flight.getPrice()));


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFlightNumber = new javax.swing.JLabel();
        lblDepartureTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblSource = new javax.swing.JLabel();
        lblArrivalTime = new javax.swing.JLabel();
        lblDestination = new javax.swing.JLabel();
        lblAirlinerName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtPassportNumber = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtMiddleName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        comboGender = new javax.swing.JComboBox<>();
        comboClass = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboRowNumber = new javax.swing.JComboBox<>();
        jComboSeatPosition = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 153, 255));

        lblFlightNumber.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N

        lblDepartureTime.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N

        lblDate.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N

        lblSource.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N

        lblArrivalTime.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N

        lblDestination.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N

        lblAirlinerName.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N

        lblPrice.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N

        lblDuration.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N

        btnConfirm.setBackground(new java.awt.Color(0, 0, 0));
        btnConfirm.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(204, 153, 255));
        btnConfirm.setText("Confirm Booking");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(204, 153, 255));
        btnCancel.setText("Reset Details");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel1.setText("Customer Details");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel2.setText("Middle Name");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel4.setText("Flight Class");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel5.setText("Date of Birth");

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel6.setText("Passport Number");

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel7.setText("Mobile Number");

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel8.setText("Email ID");

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel9.setText("First Name");

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel10.setText("Gender");

        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        comboClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business", "First Class" }));

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel11.setText("Select Seat");

        jComboRowNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));

        jComboSeatPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("A - WINDOW SEAT\nB - MIDDLE SEAT\nC - AISLE SEAT\nD - AISLE SEAT\nE - MIDDLE SEAT\nF - WINDOW SEAT\n");
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(204, 153, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel12.setText("Flight Summary");

        jLabel13.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel13.setText("Price Summary");

        jLabel14.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel14.setText("Flight Number");

        jLabel15.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel15.setText("Departure Details");

        jLabel16.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel16.setText("Duration Hours");

        jLabel17.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel17.setText("Arrival Details");

        jLabel18.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel18.setText("Hrs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel8))
                                                    .addGap(23, 23, 23))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtEmail)
                                                .addComponent(txtDOB)
                                                .addComponent(txtLastName)
                                                .addComponent(txtMiddleName)
                                                .addComponent(txtMobile)
                                                .addComponent(txtPassportNumber)
                                                .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(149, 149, 149)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel11))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboRowNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboSeatPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(comboClass, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAirlinerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFlightNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSource, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(lblDepartureTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(80, 80, 80)
                                .addComponent(lblDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel15)
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel16)
                                        .addGap(106, 106, 106)
                                        .addComponent(jLabel17)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAirlinerName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSource, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16))
                    .addComponent(jLabel14)
                    .addComponent(jLabel17))
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(comboClass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(jComboRowNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboSeatPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPassportNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        
        String fN = txtFirstName.getText();
        String mN = txtMiddleName.getText();
        String lN = txtLastName.getText();
        String EM = txtEmail.getText();
        String db = txtDOB.getText();
        String m = txtMobile.getText();
        String g = (String) this.comboGender.getSelectedItem();
        String pN = txtPassportNumber.getText();

        
       // String s=txtSource.getText();
     if(fN == null || fN.equals("") || mN == null || mN.equals("")||lN == null || lN.equals("")
             ||EM == null || EM.equals("")
             ||db == null || db.equals("")
             ||m == null || m.equals("")
             ||g == null || g.equals("")
             ||pN == null || pN.equals("")
             ){
               JOptionPane.showMessageDialog(null, "Kindly Enter All Details");
               return;
           }
        
        if(!DatePatternCorrect()){
        
         JOptionPane.showMessageDialog(null, "Date should be in the form DD/MM/YYYY", "Warning",JOptionPane.WARNING_MESSAGE);   
         return;
        }
        
        if(!EmailPatternCorrect()){
            
          JOptionPane.showMessageDialog(null, "Email Should be in Format", "Warning",JOptionPane.WARNING_MESSAGE);   
          return;
            
        }
       
        String firstName = txtFirstName.getText();
        String middleName = txtMiddleName.getText();
        String lastName = txtLastName.getText();
        String email = txtEmail.getText();
        String dob = txtDOB.getText();
        String mobile = txtMobile.getText();
        String gender = (String) this.comboGender.getSelectedItem();
        String passportNumber = txtPassportNumber.getText();
        String cl = (String)this.comboClass.getSelectedItem();
        String airlineName = lblAirlinerName.getText();
        int flightNo = Integer.parseInt(lblFlightNumber.getText());
        String source = lblSource.getText();
        String destination = lblDestination.getText();
        String depTime = lblDepartureTime.getText();
        String arrTime = lblArrivalTime.getText();
        String seatnumber = (String) this.jComboRowNumber.getSelectedItem();
        String seatposition = (String) this.jComboSeatPosition.getSelectedItem();
        String seatNo = seatnumber+seatposition;
        
        boolean result = customerDirectory.checkSeat(airlineName, flightNo ,seatNo);
         
        if(result == true)
          {
              JOptionPane.showMessageDialog(null, "Sorry!! This seat is not available. Please select another seat","Warning",JOptionPane.WARNING_MESSAGE);
          }

        else{ 
              
        Customer customer = customerDirectory.addCustomer();
        
        customer.setCustFirstName(firstName);
        customer.setCustMiddleName(middleName);
        customer.setCustLastName(lastName);
        customer.setDob(dob);
        customer.setCustEmailID(email);
        customer.setCustContactNo(mobile);
        customer.setCustGender(gender);
        customer.setCustPassportNo(passportNumber);
        customer.setFlightClass(cl);
        customer.setAirlineName(airlineName);
        customer.setCustFlightno(flightNo);
        customer.setCustSource(source);
        customer.setCustDestination(destination);
        customer.setCustDepTime(depTime);
        customer.setCustArrTime(arrTime);
        customer.setCustSeatNo(seatNo);
        
        JOptionPane.showMessageDialog(null, "Congratulations!! Your ticket has been confirmed");
        
        txtFirstName.setText("");
        txtMiddleName.setText("");
        txtLastName.setText("");
        txtDOB.setText("");
        txtEmail.setText("");
        txtMobile.setText("");
        txtPassportNumber.setText("");
          
          }
 
    }//GEN-LAST:event_btnConfirmActionPerformed
    
    private boolean DatePatternCorrect() {
      
       Pattern p = Pattern.compile("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{4}$");
       Matcher m = p.matcher(txtDOB.getText());
       boolean b = m.matches();
       return b;
    }
    
    private boolean  EmailPatternCorrect(){
      
       Pattern p = Pattern.compile("^(.+)@(.+)$");
       Matcher m = p.matcher(txtEmail.getText());
       boolean b = m.matches();
       return b;
    }
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       
         txtFirstName.setText("");
         txtMiddleName.setText("");
         txtLastName.setText("");
         txtEmail.setText("");
         txtDOB.setText("");
         txtMobile.setText("");
       //  comboGender.re;
         txtPassportNumber.setText("");
       
        
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       
        this.rightPanel.remove(this);
        CardLayout layout = (CardLayout)this.rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> comboClass;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JComboBox<String> jComboRowNumber;
    private javax.swing.JComboBox<String> jComboSeatPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAirlinerName;
    private javax.swing.JLabel lblArrivalTime;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDepartureTime;
    private javax.swing.JLabel lblDestination;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblFlightNumber;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSource;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtPassportNumber;
    // End of variables declaration//GEN-END:variables

   

    
}