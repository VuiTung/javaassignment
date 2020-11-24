
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class orderdeliveryreport extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form orderdeliveryreport
     */
    public orderdeliveryreport() {
        initComponents();
        defaul();
        defaul2();
        combofill();
        cb1.addActionListener(this) ;
        cb2.addActionListener(this) ;
        cb3.addActionListener(this) ;
    }
    DefaultTableModel model;
   private void defaul(){
    String[] columnNames ={"ID","Owner","Weight","Date","Status", "Price (RM)"};
        model =(DefaultTableModel)display.getModel();
        model.setRowCount(0);//clear the model
        display.revalidate();
        //function here
        Fileoperator std =new Fileoperator();
        String[][] A =std.returnorderlist();
        int lines = Integer.parseInt(A[0][0]);



        int i =1;
        while(i<lines+1)
        {
            String []Arra = new String[6];
            Arra[0]=A[0][i];
            Arra[1]=A[1][i];
            Arra[2]=A[2][i];
            Arra[3]=A[3][i];
            Arra[4]=A[4][i];
            Arra[5]=A[5][i];
            model.addRow(Arra);
            model.setColumnIdentifiers(columnNames);
            i++;
        }
        
    }
    public void actionPerformed(ActionEvent e) {
        String orderstatus = String.valueOf(cb2.getSelectedItem());
        String deliverystatus = String.valueOf(cb1.getSelectedItem());
        String deliverystaff = String.valueOf(cb3.getSelectedItem());
        if(deliverystatus.equals("All") && deliverystaff.equals("All")){
            defaul2();
        }else if(deliverystatus.equals("All") && deliverystaff.equals("All")==false){
             defaul5(deliverystaff);
        }else if(deliverystatus.equals("All")==false && deliverystaff.equals("All")){
            defaul4(deliverystatus);
        }else{
        defaul6(deliverystaff, deliverystatus);
    }
        if(orderstatus.equals("All")){
            defaul();
        }else{
            defaul3(orderstatus);
        }
        
     }
    DefaultComboBoxModel mod ;
    private void combofill(){
       cb3.removeAllItems();
       Fileoperator std = new Fileoperator();
       String[] id= std.generatedeliverystaffid();  
       mod = new DefaultComboBoxModel(id);
           cb3.setModel(mod);
    }
    public void defaul2(){

                String[] columnNames ={"Delivery Task ID","Date out","Status","Address", "Order ID", "Delivery Staff ID"};
        model =(DefaultTableModel)display2.getModel();
        model.setRowCount(0);//clear the model
        display2.revalidate();
        //function here
        Fileoperator std =new Fileoperator();
        String[][] A =std.returndeliveryreport();
        
        int lines = Integer.parseInt(A[0][0]);
        int i =1;
        while(i<lines+1){

            
            String []Arra = new String[6];
            Arra[0]=A[0][i];
            Arra[1]=A[1][i];
            Arra[2]=A[2][i];
            Arra[3]=A[3][i];
            Arra[4]=A[4][i];
            Arra[5]=A[5][i];
            model.addRow(Arra);
            model.setColumnIdentifiers(columnNames);

            
                        i++;
        }  
    }
       private void defaul3(String Status){
    String[] columnNames ={"ID","Owner","Weight","Date","Status", "Price (RM)"};
        model =(DefaultTableModel)display.getModel();
        model.setRowCount(0);//clear the model
        display.revalidate();
        //function here
        Fileoperator std =new Fileoperator();
        String[][] A =std.returnorderlist();
        int lines = Integer.parseInt(A[0][0]);
        


        int i =1;
        while(i<lines+1)
        {
            String []Arra = new String[6];
            Arra[0]=A[0][i];
            Arra[1]=A[1][i];
            Arra[2]=A[2][i];
            Arra[3]=A[3][i];
            Arra[4]=A[4][i];
            Arra[5]=A[5][i];
            if(A[4][i].equals(Status)){
            model.addRow(Arra);
            model.setColumnIdentifiers(columnNames);
            }
            i++;
        }
        
    }
       public void defaul4(String Status){

                String[] columnNames ={"Delivery Task ID","Date out","Status","Address", "Order ID", "Delivery Staff ID"};
        model =(DefaultTableModel)display2.getModel();
        model.setRowCount(0);//clear the model
        display2.revalidate();
        //function here
        Fileoperator std =new Fileoperator();
        String[][] A =std.returndeliveryreport();
        
        int lines = Integer.parseInt(A[0][0]);
        int i =1;
        while(i<lines+1){

            
            String []Arra = new String[6];
            Arra[0]=A[0][i];
            Arra[1]=A[1][i];
            Arra[2]=A[2][i];
            Arra[3]=A[3][i];
            Arra[4]=A[4][i];
            Arra[5]=A[5][i];
            if(A[2][i].equals(Status)){
            model.addRow(Arra);
            model.setColumnIdentifiers(columnNames);
            }
            
                        i++;
        }  
    }  
       public void defaul5(String delivery){

                String[] columnNames ={"Delivery Task ID","Date out","Status","Address", "Order ID", "Delivery Staff ID"};
        model =(DefaultTableModel)display2.getModel();
        model.setRowCount(0);//clear the model
        display2.revalidate();
        //function here
        Fileoperator std =new Fileoperator();
        String[][] A =std.returndeliveryreport();
        
        int lines = Integer.parseInt(A[0][0]);
        int i =1;
        while(i<lines+1){

            
            String []Arra = new String[6];
            Arra[0]=A[0][i];
            Arra[1]=A[1][i];
            Arra[2]=A[2][i];
            Arra[3]=A[3][i];
            Arra[4]=A[4][i];
            Arra[5]=A[5][i];
            if(A[5][i].equals(delivery)){
            model.addRow(Arra);
            model.setColumnIdentifiers(columnNames);
            }
            
                        i++;
        }  
    }  
       public void defaul6(String delivery, String Status){

                String[] columnNames ={"Delivery Task ID","Date out","Status","Address", "Order ID", "Delivery Staff ID"};
        model =(DefaultTableModel)display2.getModel();
        model.setRowCount(0);//clear the model
        display2.revalidate();
        //function here
        Fileoperator std =new Fileoperator();
        String[][] A =std.returndeliveryreport();
        
        int lines = Integer.parseInt(A[0][0]);
        int i =1;
        while(i<lines+1){

            
            String []Arra = new String[6];
            Arra[0]=A[0][i];
            Arra[1]=A[1][i];
            Arra[2]=A[2][i];
            Arra[3]=A[3][i];
            Arra[4]=A[4][i];
            Arra[5]=A[5][i];
            if(A[5][i].equals(delivery)&&A[2][i].equals(Status)){
            model.addRow(Arra);
            model.setColumnIdentifiers(columnNames);
            }
            
                        i++;
        }  
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        display2 = new javax.swing.JTable();
        cb1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cb3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(128, 129, 255));

        jButton2.setBackground(new java.awt.Color(153, 51, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 51, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Print Order");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Order");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Delivery");

        display.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Owner", "Weight", "Date", "Status", "Price (RM)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(display);
        if (display.getColumnModel().getColumnCount() > 0) {
            display.getColumnModel().getColumn(0).setResizable(false);
            display.getColumnModel().getColumn(1).setResizable(false);
            display.getColumnModel().getColumn(2).setResizable(false);
            display.getColumnModel().getColumn(3).setResizable(false);
            display.getColumnModel().getColumn(4).setResizable(false);
            display.getColumnModel().getColumn(5).setResizable(false);
        }

        display2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        display2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Delivery Task ID", "Date out", "Status", "Address", "Order", "Delivery Staff ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(display2);
        if (display2.getColumnModel().getColumnCount() > 0) {
            display2.getColumnModel().getColumn(0).setResizable(false);
            display2.getColumnModel().getColumn(1).setResizable(false);
            display2.getColumnModel().getColumn(2).setResizable(false);
            display2.getColumnModel().getColumn(4).setResizable(false);
            display2.getColumnModel().getColumn(5).setResizable(false);
        }

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Unsend", "Complete" }));

        jLabel4.setText("Status");

        jLabel5.setText("Status");

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Done", "Undone" }));

        jLabel6.setText("Delivery Staff");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(43, 43, 43)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(44, 44, 44)
                        .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Delivery and Order report");

        jButton1.setBackground(new java.awt.Color(153, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print Delivery");
        jButton1.setToolTipText("");
        jButton1.setMaximumSize(new java.awt.Dimension(80, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(411, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MessageFormat header =new MessageFormat("Delivery Report");
        MessageFormat footer = new MessageFormat("End");
        try{
            PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
            set.add(OrientationRequested.LANDSCAPE);
            display2.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, set, true);
           
        }catch(java.awt.print.PrinterException e){
            System.out.println("error" +  e.getMessage());
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         MessageFormat header2 =new MessageFormat("Order Report");
        MessageFormat footer2 = new MessageFormat("End");
        try{
            PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
            set.add(OrientationRequested.LANDSCAPE);
            display.print(JTable.PrintMode.FIT_WIDTH, header2, footer2, true, set, true);
        }catch(java.awt.print.PrinterException e){
            System.out.println("error" +  e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new menu1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(orderdeliveryreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orderdeliveryreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orderdeliveryreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orderdeliveryreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderdeliveryreport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JTable display;
    private javax.swing.JTable display2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
