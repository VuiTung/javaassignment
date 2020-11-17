
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ManageUser extends javax.swing.JFrame {
    
    public static String user2;
    public static int age2;
    public static String gen2;
    public static String PN2;
    public static String email2;
    public static String password2;
    public static String role2;
    public static String position2;
 DefaultTableModel model;


    public ManageUser(){
        initComponents();
        setVisible(true);
        setResizable(false);
        setTitle("accounts");
        defaul();
        Color blue = new Color(216,229,242);
        this.getContentPane().setBackground(blue);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Text1 = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Age", "Gender", "Phone Number", "Email", "Role", "Position"
            }
        ));
        jScrollPane1.setViewportView(display);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Search: ");

        Text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text1ActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(update)
                        .addGap(98, 98, 98)
                        .addComponent(delete)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(delete))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

private void defaul(){
    String[] columnNames ={"ID","Username","Age","Gender","Phone Number", "Email", "Role", "Position"};
        model =(DefaultTableModel)display.getModel();
        model.setRowCount(0);//clear the model
        display.revalidate();
        //function here
        Fileoperator std =new Fileoperator();
        String[][] A =std.returnuserlist();
        int lines = Integer.parseInt(A[0][0]);



        int i =1;
        while(i<lines+1){
            String []Arra = new String[8];
            Arra[0]=A[0][i];
            Arra[1]=A[1][i];
            Arra[2]=A[3][i];
            Arra[3]=A[4][i];
            Arra[4]=A[5][i];
            Arra[5]=A[6][i];
            Arra[6]=A[7][i];
            Arra[7]=A[8][i];
            model.addRow(Arra);
            model.setColumnIdentifiers(columnNames);
            i++;
        }
        
    }
 
private static Scanner sc2;
    private void Text1KeyReleased(java.awt.event.KeyEvent evt) {                                  
try{
       
   String[] columnNames ={"ID","Username","Age","Gender","Phone Number", "Email", "Role", "Position"};
        //set model to the jtable
        File fillname = new File("assi.txt");
        model =(DefaultTableModel)display.getModel();
        model.setRowCount(0);//clear the model
        display.revalidate();//refresh the table
        
        
        // read eachline from the file and store as array
        
        
        sc2 = new Scanner(fillname);
        String temp;
       
        
        while(sc2.hasNext())
        {
            temp=sc2.nextLine();
            String []tempArr = temp.split(",");   
            String []Arra = new String[7];
            Arra[0]=tempArr[0];
            Arra[1]=tempArr[1];
            Arra[2]=tempArr[3];
            Arra[3]=tempArr[4];
            Arra[4]=tempArr[5];
            Arra[5]=tempArr[6];
            Arra[6]=tempArr[7];
            Arra[7]=tempArr[8];
          if(("Managing staff".equals(tempArr[7]) || "Delivery staff".equals(tempArr[7])) && (tempArr[1].toLowerCase().contains(Text1.getText().toLowerCase())  || tempArr[0].toLowerCase().contains(Text1.getText().toLowerCase())))
            {
         
     
            model.addRow(Arra);//add a row to the table model
          
            }
         

        //display column headers
        
        model.setColumnIdentifiers(columnNames);
        
        }
}       
        catch(FileNotFoundException ex)
        {

        }
        finally
        {
            sc2.close();
        }
           // TODO add your handling code here:
    }
    
    
    
    
    private void Text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text1ActionPerformed
        
    }//GEN-LAST:event_Text1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
    
        
            if(display.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Please select a user");
    }
            else{
            Fileoperator std =new Fileoperator();
        int row = display.getSelectedRow();
       String[] array = std.returnuserdetail(display.getModel().getValueAt(row,1).toString());
       String update[] = new String[20];
               update[0]=array[0];
               update[1]=array[1];
               update[2]=array[2];
               update[3]=array[3];
               update[4]=array[4];
               update[5]=array[5];
               update[6]=array[6];
               
               updateuser.main(update);
           this.setVisible(false); 
                    }
        
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        try
        {
            int row = display.getSelectedRow();
            String id =display.getModel().getValueAt(row,0).toString();
            model =(DefaultTableModel)display.getModel();
            model.setRowCount(0);//clear the model
            display.revalidate();//refresh the table
            Text1.setText("");

            String filepath = "assi.txt";
            managingStaff std = new managingStaff();
            std.deleteuser(id, filepath);

            JOptionPane.showMessageDialog(rootPane, "Delete successfully");
            new menu1().setVisible(true);
            this.hide();
        }
        
        catch(Exception e3)
        {
            JOptionPane.showMessageDialog(rootPane, "Please select a user");
        }
    }//GEN-LAST:event_deleteActionPerformed


/////////////////////////////////
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
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUser().setVisible(true);
            }
        });
    }
          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Text1;
    private javax.swing.JButton delete;
    private javax.swing.JTable display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
