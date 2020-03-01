/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.AirlineDirectory;
import Business.Airliner;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Team Void
 */
public class CreateNewAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewAirlinerJPanel
     */
    private AirlineDirectory airlinedirectory;
    private JPanel rightPanel;
    
  
    public CreateNewAirlinerJPanel(JPanel rightPanel, AirlineDirectory airlinedirectory) {
      initComponents();
      this.rightPanel =  rightPanel;
      this.airlinedirectory = airlinedirectory;     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAirlinerName = new javax.swing.JTextField();
        txtAirlinerHeadOffice = new javax.swing.JTextField();
        txtAirlinerFlightsPerDay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel1.setText("Create Airliner");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel3.setText("Airline Head Office");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel4.setText("No of Flights Per day");

        txtAirlinerName.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N

        txtAirlinerHeadOffice.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N

        txtAirlinerFlightsPerDay.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel2.setText("Airliner Name");

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(204, 153, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(204, 153, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(204, 153, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAirlinerHeadOffice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAirlinerName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAirlinerFlightsPerDay, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(453, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAirlinerName)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAirlinerHeadOffice)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAirlinerFlightsPerDay)
                    .addComponent(jLabel4))
                .addGap(56, 56, 56)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       
        txtAirlinerName.setText("");
        txtAirlinerHeadOffice.setText("");
        txtAirlinerFlightsPerDay.setText("");
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        CardLayout cardlayout = (CardLayout)rightPanel.getLayout();
        rightPanel.remove(1);
        rightPanel.remove(this);
       
        ManageAirlinersJPanel manage = new ManageAirlinersJPanel(rightPanel, airlinedirectory);
        rightPanel.add("ManageAirlinersJPanel",manage);
        cardlayout.previous(rightPanel);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
       
        
        String airlinerName = txtAirlinerName.getText();
       
        
        if(airlinerName == null || airlinerName.equals("")){
               JOptionPane.showMessageDialog(null, "Kindly Enter Airliner Name");
               return;
           }
         
        
        String airlinerAddress = txtAirlinerHeadOffice.getText();
         if(airlinerAddress == null || airlinerAddress.equals("")){
               JOptionPane.showMessageDialog(null, "Kindly Enter Airliner Country");
               return;
           }
        
        
        String totalFlightsPerDay = txtAirlinerFlightsPerDay.getText();
         if(totalFlightsPerDay == null || totalFlightsPerDay.equals("")){
               JOptionPane.showMessageDialog(null, "Kindly Enter Total Flights Per Day");
               return;
           }
        
        try{
            Integer.parseInt(totalFlightsPerDay);   
        }
        catch (NumberFormatException e)
                {
                 JOptionPane.showMessageDialog(null, "Invalid Number! Kindly Valid Flights Per Day");
                }
        
        
        
        Airliner airliner = airlinedirectory.addAirliner();
            
        airliner.setAirlinerName(airlinerName);
        airliner.setAirlinerAddress(airlinerAddress);
        airliner.setTotalFlightsPerDay(Integer.parseInt(totalFlightsPerDay));
        
     
        JOptionPane.showMessageDialog(null, "Details Recorded Successfully!");
        
        txtAirlinerName.setText("");
        txtAirlinerHeadOffice.setText("");
        txtAirlinerFlightsPerDay.setText("");
        
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAirlinerFlightsPerDay;
    private javax.swing.JTextField txtAirlinerHeadOffice;
    private javax.swing.JTextField txtAirlinerName;
    // End of variables declaration//GEN-END:variables
}