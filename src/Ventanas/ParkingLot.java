/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.ProyectoOrga;
import Clases.Vehicle;

/**
 *
 * @author Han, Serrano
 */
public class ParkingLot extends javax.swing.JFrame {

    /**
     * Creates new form parkingLot
     */
    public ParkingLot() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtThirdColumn = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtFirstColumn = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSecondColumn = new javax.swing.JTextArea();
        closeBtn = new javax.swing.JButton();
        btnSearch1 = new javax.swing.JButton();

        btnSearch.setBackground(new java.awt.Color(191, 118, 63));
        btnSearch.setForeground(new java.awt.Color(255, 255, 204));
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 228, 228));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 2, true));

        txtThirdColumn.setColumns(20);
        txtThirdColumn.setForeground(new java.awt.Color(0, 0, 0));
        txtThirdColumn.setRows(5);
        txtThirdColumn.setEnabled(false);
        jScrollPane1.setViewportView(txtThirdColumn);

        txtFirstColumn.setColumns(20);
        txtFirstColumn.setForeground(new java.awt.Color(0, 0, 0));
        txtFirstColumn.setRows(5);
        txtFirstColumn.setEnabled(false);
        jScrollPane2.setViewportView(txtFirstColumn);

        txtSecondColumn.setColumns(20);
        txtSecondColumn.setForeground(new java.awt.Color(0, 0, 0));
        txtSecondColumn.setRows(5);
        txtSecondColumn.setEnabled(false);
        jScrollPane3.setViewportView(txtSecondColumn);

        closeBtn.setBackground(new java.awt.Color(102, 0, 0));
        closeBtn.setForeground(new java.awt.Color(255, 255, 204));
        closeBtn.setText("Cerrar");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        btnSearch1.setBackground(new java.awt.Color(191, 118, 63));
        btnSearch1.setForeground(new java.awt.Color(255, 255, 204));
        btnSearch1.setText("Buscar");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed

       //Es este
       Vehicle[][] vehicles = ProyectoOrga.parkingLot.getVehicles();    //Se obtienen todos los vehiculos del estacionamiento
       String firstColumn = "";     //String que corresponde a la primera columna de la matriz
       String secondColumn = "";    //String que corresponde a la segunda columna de la matriz
       String thirdColumn = "";     //String que corresponde a la tercera columna de la matriz
       int num = 1;
       
        for (int i = 0; i < vehicles.length; i++) {
            
            for (int j = 0; j < vehicles[0].length; j++) {
                
                if(vehicles[i][j] != null){
                    
                    switch (j) {
                        case 0:
                            firstColumn = firstColumn + this.printVehicle(vehicles[i][j], num, i + 1);
                            break;
                        case 1:
                            secondColumn = secondColumn + this.printVehicle(vehicles[i][j], num, i + 1);
                            break;
                        case 2:
                            thirdColumn = thirdColumn + this.printVehicle(vehicles[i][j], num, i + 1);
                            break;
                    }
                    
                    num++;
                    
                }
                
            }
            
        }
        
        this.txtFirstColumn.setText(firstColumn);
        this.txtSecondColumn.setText(secondColumn);
        this.txtThirdColumn.setText(thirdColumn);

    }//GEN-LAST:event_btnSearch1ActionPerformed

    String printVehicle(Vehicle vehicle, int num, int row) {
        
        //Metodo para imprimir la informacion del vehiculo
        String info = "Fila " + row + 
                    "\nVehículo " + num +  
                    "\nPlaca: " + vehicle.getLicensePlate() + 
                    "\nMarca: " + vehicle.getBrand() + 
                    "\nModelo: " + vehicle.getModel() +
                    "\nColor: " + vehicle.getColor() +
                    "\nAlquiler: " + vehicle.getMonthlyRent() +
                    "\n\n";
        
       return info;
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton closeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtFirstColumn;
    private javax.swing.JTextArea txtSecondColumn;
    private javax.swing.JTextArea txtThirdColumn;
    // End of variables declaration//GEN-END:variables
}
