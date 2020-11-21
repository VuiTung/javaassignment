
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class feedbacklist extends javax.swing.JFrame {

 DefaultTableModel model;
    public feedbacklist() {
        initComponents();
        defaul();
    }

    private void defaul(){
        String[] columnNames ={"ID","Name","Title","Content","Status"};
        model =(DefaultTableModel)display1.getModel();
        model.setRowCount(0);//clear the model
        display1.revalidate();
        //function here
        Fileoperator std =new Fileoperator();
        String[][] A =std.returnfeedback();
        int lines = Integer.parseInt(A[0][0]);
        int i =1;
        while(i<lines+1){
            String []Arra = new String[5];
            Arra[1]=A[1][i];
            Arra[2]=A[3][i];
            Arra[3]=A[4][i];
            Arra[4]=A[5][i];
            Arra[0]=A[2][i];
            model.addRow(Arra);
            model.setColumnIdentifiers(columnNames);
            i++;
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JScrollPane();
        display1 = new javax.swing.JTable();
        Text1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Title", "Content", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        display.setViewportView(display1);

        Text1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Text1KeyReleased(evt);
            }
        });

        jLabel1.setText("Search:");

        jButton1.setText("Reply");
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Feedback");

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            new menu1().setVisible(true);
            this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Text1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Text1KeyReleased
        String[] columnNames ={"ID","Name","Title","Content","Status"};
        model =(DefaultTableModel)display1.getModel();
        model.setRowCount(0);//clear the model
        display1.revalidate();
        //function here
        Fileoperator std =new Fileoperator();

        String[][] A =std.returnfeedback();
        int lines = Integer.parseInt(A[0][0]);
        int i =1;
        while(i<lines+1){
            String []Arra = new String[5];
            
            Arra[1]=A[1][i];
            Arra[2]=A[3][i];
            Arra[3]=A[4][i];
            Arra[4]=A[5][i];
            Arra[0]=A[2][i];
               if(Arra[0].toLowerCase().contains(Text1.getText().toLowerCase())||Arra[1].toLowerCase().contains(Text1.getText().toLowerCase())||
                       Arra[3].toLowerCase().contains(Text1.getText().toLowerCase())){
            model.addRow(Arra);//add a row to the table mode
            }

            model.setColumnIdentifiers(columnNames);
            i++;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_Text1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(display1.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Please select a report");
    }
        else
        {
        Fileoperator std =new Fileoperator();
        int row = display1.getSelectedRow();
        String[] array = std.returnfeedback1(display1.getModel().getValueAt(row,0).toString());
        String detail[] = new String[20];
            
            detail[0]=array[0];
            detail[1]=array[1];
            detail[2]=array[2];
            detail[3]=array[3];
            detail[4]=array[4];
            
        feedbackreplypage.main(detail);
        this.setVisible(false); 
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try
        {
            int row = display1.getSelectedRow();
            String id =display1.getModel().getValueAt(row,0).toString();
            String status1 =display1.getModel().getValueAt(row,4).toString();
            model =(DefaultTableModel)display1.getModel();
            model.setRowCount(0);//clear the model
            display1.revalidate();//refresh the table
            Text1.setText("");

            String filepath = "feedback.txt";
            String filepath1 = "feedbackreply.txt";
            managingStaff std = new managingStaff();
            std.deletefeedback(id, filepath, filepath1, status1);

            JOptionPane.showMessageDialog(rootPane, "Delete successfully");
            new menu1().setVisible(true);
            this.hide();
        }
        
        catch(Exception e3)
        {
            JOptionPane.showMessageDialog(rootPane, "Please select a user");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(feedbacklist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(feedbacklist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(feedbacklist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(feedbacklist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feedbacklist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Text1;
    private javax.swing.JScrollPane display;
    private javax.swing.JTable display1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
