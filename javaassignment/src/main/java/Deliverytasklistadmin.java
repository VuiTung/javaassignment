
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
                String[] columnNames ={"Delivery Task ID","Date out","Status","Address", "Order ID", "Delivery Staff ID"};
        model =(DefaultTableModel)display1.getModel();
        model.setRowCount(0);//clear the model
        display1.revalidate();
        //function here
        Fileoperator std =new Fileoperator();
        String[][] A =std.returntodaydeliverylist(date);
        
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
    public void defaul2(){
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
                LocalDateTime now = LocalDateTime.now(); 
                String date = dtf.format(now);
                String[] columnNames ={"Delivery Task ID","Date out","Status","Address", "Order ID", "Delivery Staff ID"};
        model =(DefaultTableModel)display2.getModel();
        model.setRowCount(0);//clear the model
        display2.revalidate();
        //function here
        Fileoperator std =new Fileoperator();
        String[][] A =std.returnfuturedeliverylist(date);
        
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Text1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        display2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(128, 129, 255));

        jButton1.setBackground(new java.awt.Color(153, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delivery tasks list admin");

        Text1.setToolTipText("");
        Text1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Text1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Search :");

        display1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Delivery Task ID", "Date out", "Status", "Address", "Order ID", "Delivery Staff ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            display1.getColumnModel().getColumn(4).setResizable(false);
            display1.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Today");

        display2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Delivery Task ID", "Date out", "Status", "Address", "Order ID", "Delivery Staff ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            display2.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Other");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(202, 202, 202)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Text1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Text1KeyReleased
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
                LocalDateTime now = LocalDateTime.now(); 
                String date = dtf.format(now);
                String[] columnNames ={"Delivery Task ID","Date out","Status","Address", "Order ID", "Delivery Staff ID"};
        model =(DefaultTableModel)display1.getModel();
        model.setRowCount(0);//clear the model
        display1.revalidate();
        //function here
        Fileoperator std =new Fileoperator();
        String[][] A =std.returntodaydeliverylist(date);
        
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
            Arra2[5]=A2[5][i2];
            
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
