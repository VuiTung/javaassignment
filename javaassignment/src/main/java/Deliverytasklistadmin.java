
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Deliverytasklistadmin extends javax.swing.JFrame {

    /**
     * Creates new form Deliverytasklistadmin
     */
    public static String ID;
    DefaultTableModel model;
    DefaultTableModel model2;
    public Deliverytasklistadmin() {
        initComponents();
        defaul2();
        defaul();
    }
    
     public void defaul(){
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
                LocalDateTime now = LocalDateTime.now(); 
                String date = dtf.format(now);
                String[] columnNames ={"Delivery Task ID","Date out","Status","Address", "Order ID"};
        model =(DefaultTableModel)display1.getModel();
        model.setRowCount(0);//clear the model
        display1.revalidate();
        //function here
        Fileoperator std =new Fileoperator();
        String[][] A =std.returntodaydeliverylist(date);
        
        int lines = Integer.parseInt(A[0][0]);
        int i =1;
        while(i<lines+1){

            
            String []Arra = new String[5];
            Arra[0]=A[0][i];
            Arra[1]=A[1][i];
            Arra[2]=A[2][i];
            Arra[3]=A[3][i];
            Arra[4]=A[4][i];
            
            model.addRow(Arra);
            model.setColumnIdentifiers(columnNames);
                        i++;
        }  
    }
    public void defaul2(){
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
                LocalDateTime now = LocalDateTime.now(); 
                String date = dtf.format(now);
                String[] columnNames ={"Delivery Task ID","Date out","Status","Address", "Order ID"};
        model =(DefaultTableModel)display2.getModel();
        model.setRowCount(0);//clear the model
        display2.revalidate();
        //function here
        Fileoperator std =new Fileoperator();
        String[][] A =std.returnfuturedeliverylist(date);
        
        int lines = Integer.parseInt(A[0][0]);
        int i =1;
        while(i<lines+1){

            
            String []Arra = new String[5];
            Arra[0]=A[0][i];
            Arra[1]=A[1][i];
            Arra[2]=A[2][i];
            Arra[3]=A[3][i];
            Arra[4]=A[4][i];
            
            model.addRow(Arra);
            model.setColumnIdentifiers(columnNames);

            
                        i++;
        }  
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
        jLabel2 = new javax.swing.JLabel();
        Text1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        display1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        display2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Delivery tasks admin");

        jLabel2.setText("Search");

        Text1.setToolTipText("");
        Text1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Text1KeyReleased(evt);
            }
        });

        display1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Delivery Task ID", "Date out", "Status", "Address", "Order ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(display1);
        if (display1.getColumnModel().getColumnCount() > 0) {
            display1.getColumnModel().getColumn(0).setResizable(false);
            display1.getColumnModel().getColumn(1).setResizable(false);
            display1.getColumnModel().getColumn(2).setResizable(false);
        }

        display2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Delivery Task ID", "Date out", "Status", "Address", "Order"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        display2.setEnabled(false);
        jScrollPane2.setViewportView(display2);
        if (display2.getColumnModel().getColumnCount() > 0) {
            display2.getColumnModel().getColumn(0).setResizable(false);
            display2.getColumnModel().getColumn(1).setResizable(false);
            display2.getColumnModel().getColumn(2).setResizable(false);
            display2.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Today");

        jLabel4.setText("Other");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(211, 211, 211))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Text1KeyReleased
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
                LocalDateTime now = LocalDateTime.now(); 
                String date = dtf.format(now);
                String[] columnNames ={"Delivery Task ID","Date out","Status","Address", "Order ID"};
        model =(DefaultTableModel)display1.getModel();
        model.setRowCount(0);//clear the model
        display1.revalidate();
        //function here
        Fileoperator std =new Fileoperator();
        String[][] A =std.returntodaydeliverylist(date);
        
        int lines = Integer.parseInt(A[0][0]);
        int i =1;
        while(i<lines+1){

            
            String []Arra = new String[5];
            Arra[0]=A[0][i];
            Arra[1]=A[1][i];
            Arra[2]=A[2][i];
            Arra[3]=A[3][i];
            Arra[4]=A[4][i];
            
            if(Arra[0].toLowerCase().contains(Text1.getText().toLowerCase())||Arra[4].toLowerCase().contains(Text1.getText().toLowerCase())||Arra[3].toLowerCase().contains(Text1.getText().toLowerCase())){

            model.addRow(Arra);//add a row to the table mode
            }
            model.setColumnIdentifiers(columnNames);

            
                        i++;
        }  
        
 
        model2 =(DefaultTableModel)display2.getModel();
        model2.setRowCount(0);//clear the model
        display2.revalidate();
        //function here
        Fileoperator std2 =new Fileoperator();
        String[][] A2 =std2.returnfuturedeliverylist(date);
        
        int lines2 = Integer.parseInt(A[0][0]);
        int i2 =1;
        while(i2<lines+1){

          
            String []Arra2 = new String[5];
            Arra2[0]=A2[0][i2];
            Arra2[1]=A2[1][i2];
            Arra2[2]=A2[2][i2];
            Arra2[3]=A2[3][i2];
            Arra2[4]=A2[4][i2];
            
             if(Arra2[0].toLowerCase().contains(Text1.getText().toLowerCase())||Arra2[4].toLowerCase().contains(Text1.getText().toLowerCase())||Arra2[3].toLowerCase().contains(Text1.getText().toLowerCase())){

            model2.addRow(Arra2);//add a row to the table mode
            }
            model2.setColumnIdentifiers(columnNames);

            
                        i2++;
        }  
    }//GEN-LAST:event_Text1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(display1.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Please select Today task");
    }
        else
        {
        Fileoperator std =new Fileoperator();
        int row = display1.getSelectedRow();
        String[] array = std.returndelivery(display1.getModel().getValueAt(row,0).toString());
        String detail[] = new String[20];
            detail[0]=array[0];
            detail[1]=array[1];
            detail[2]=array[2];
            detail[3]=array[3];
            detail[4]=array[4];
            detail[5]=ID;
        deliverypage.main(detail);
        this.setVisible(false); 
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                new menu1().setVisible(true);
        this.hide();
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
            java.util.logging.Logger.getLogger(Deliverytasklistadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deliverytasklistadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deliverytasklistadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deliverytasklistadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ID=args[1];
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deliverytasklistadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Text1;
    private javax.swing.JTable display1;
    private javax.swing.JTable display2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
