
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Register extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        Shift.setVisible(false);
        position.addActionListener(this);
    }
 public void actionPerformed(ActionEvent e) {
        String Role = String.valueOf(position.getSelectedItem());
        if(Role=="Managing staff"){
            Shift.setVisible(true);
            transport.setVisible(false);
            SorT.setText("");
        }else{
            Shift.setVisible(false);
            transport.setVisible(true);
            SorT.setText("Assigned transport");
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

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Shift = new javax.swing.JPanel();
        night = new javax.swing.JRadioButton();
        day = new javax.swing.JRadioButton();
        age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        password2 = new javax.swing.JPasswordField();
        view = new java.awt.Checkbox();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phonenumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        position = new javax.swing.JComboBox<>();
        reset = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fullname = new javax.swing.JTextField();
        errormsg = new javax.swing.JLabel();
        Gender = new javax.swing.JPanel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        ageerror = new javax.swing.JLabel();
        err = new javax.swing.JLabel();
        SorT = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        transport = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 139, -1, -1));

        jPanel1.setBackground(new java.awt.Color(128, 129, 255));

        night.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        night.setText("Night shift");

        day.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        day.setText("Day shift");

        javax.swing.GroupLayout ShiftLayout = new javax.swing.GroupLayout(Shift);
        Shift.setLayout(ShiftLayout);
        ShiftLayout.setHorizontalGroup(
            ShiftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShiftLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(night)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(day)
                .addGap(14, 14, 14))
        );
        ShiftLayout.setVerticalGroup(
            ShiftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShiftLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(ShiftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(night)
                    .addComponent(day))
                .addContainerGap())
        );

        age.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm password:");

        password2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password2ActionPerformed(evt);
            }
        });

        view.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        view.setForeground(new java.awt.Color(255, 255, 255));
        view.setLabel("View");
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email:");

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone Number:");

        phonenumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phonenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phonenumberKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Position:");
        jLabel8.setToolTipText("");

        position.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery staff", "Managing staff" }));

        reset.setBackground(new java.awt.Color(153, 51, 255));
        reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(153, 51, 255));
        submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(153, 51, 255));
        back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Register Form");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full name:");

        Fullname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullnameActionPerformed(evt);
            }
        });

        errormsg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        errormsg.setForeground(new java.awt.Color(255, 0, 51));

        Male.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Male.setText("Male");

        Female.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GenderLayout = new javax.swing.GroupLayout(Gender);
        Gender.setLayout(GenderLayout);
        GenderLayout.setHorizontalGroup(
            GenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Male)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(Female)
                .addGap(37, 37, 37))
        );
        GenderLayout.setVerticalGroup(
            GenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GenderLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(GenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Male)
                    .addComponent(Female))
                .addContainerGap())
        );

        ageerror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ageerror.setForeground(new java.awt.Color(255, 0, 51));

        err.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        err.setForeground(new java.awt.Color(255, 0, 51));
        err.setToolTipText("");

        SorT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SorT.setForeground(new java.awt.Color(255, 255, 255));
        SorT.setText("Assigned transport:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age:");

        transport.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");

        password1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gender:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ageerror, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SorT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Shift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transport, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel8))
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(err, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errormsg, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ageerror, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(err, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SorT)
                    .addComponent(transport, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Shift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(errormsg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullnameActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleActionPerformed

    private void ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyTyped
       char c = evt.getKeyChar();
          if (!(Character.isDigit(c)|| c == KeyEvent.VK_PERIOD)){
              ageerror.setText("Please enter valid age");
              evt.consume();
          } else if (Character.isDigit(c)){
        ageerror.setText("");
        
    }
      if(age.getText().length()==3){
          evt.consume();
      } 
    }//GEN-LAST:event_ageKeyTyped

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
char pass = password1.getEchoChar();
        if(pass==(char) 0){
            password1.setEchoChar('*');
        } else {
            password1.setEchoChar((char) 0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_viewMouseClicked

    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password1ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       if(checkEmpty()==true){
           errormsg.setText("Plese complete the form");
       }else{
           errormsg.setText("");
            String password = new String (password1.getPassword());
            String password3 = new String (password2.getPassword());
            if(password.equals(password3)){
                errormsg.setText("");
               
                String Position1 = String.valueOf(position.getSelectedItem());
                
            
                String gender;
                String shift;
                if(Male.isSelected()){
                    gender= "Male";
                }else{
                    gender= "Female";
                }
                
            if(Position1.equals("Managing staff")){
                if(night.isSelected()){
                    shift="night shift";
                }else{
                    shift="day shift";
                }
                managingStaff std = new managingStaff();
                Fileoperator std1 =new Fileoperator();
                
                int IDline = std1.generateID(0, "assi.txt");
                std.setFullname(Fullname.getText());
                std.setID(IDline);
                std.setPassword(password);
                std.setAge(Integer.parseInt(age.getText()));
                std.setPN(phonenumber.getText());
                std.setEmail(email.getText());
                std.setShift(shift);
                std.setPosition(Position1);
                std.setGender(gender);
                std.addmanagingstaff();
                JOptionPane.showMessageDialog(rootPane, std.getPosition() + " added successfully");
            new menu1().setVisible(true);
            this.hide();
            }else{
                 deliveryStaff std = new deliveryStaff();
                Fileoperator std1 =new Fileoperator();
                
                int IDline = std1.generateID(0, "assi.txt");
                std.setFullname(Fullname.getText());
                std.setID(IDline);
                std.setPassword(password);
                std.setAge(Integer.parseInt(age.getText()));
                std.setPN(phonenumber.getText());
                std.setEmail(email.getText());
                std.setAssignedtransport(transport.getText());
                std.setPosition(Position1);
                std.setGender(gender);
                 std.adddeliverystaff();
            JOptionPane.showMessageDialog(rootPane, std.getPosition() + " added successfully");
            new menu1().setVisible(true);
            this.hide();
            }
            
            }else{
            errormsg.setText("make sure your password are the same");
            }
       }
        
    }//GEN-LAST:event_submitActionPerformed

    private void password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password2ActionPerformed

    private void phonenumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenumberKeyTyped
         char c = evt.getKeyChar();
          if (!(Character.isDigit(c)|| c == KeyEvent.VK_PERIOD)){
              err.setText("Please enter valid phone number");
              evt.consume();
          } else if (Character.isDigit(c)){
        err.setText("");
          }
    }//GEN-LAST:event_phonenumberKeyTyped

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
            new menu1().setVisible(true);
            this.hide();        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        Fullname.setText("");
        age.setText("");
        Male.setSelected(false);
        Female.setSelected(false);
        email.setText("");
        view.setState(false);
        phonenumber.setText("");
        password1.setText("");
        password2.setText("");
        night.setSelected(false);
        day.setSelected(false);
        transport.setText("");
        
    }//GEN-LAST:event_resetActionPerformed
private boolean checkEmpty(){
    String password = new String (password1.getPassword());
   String password3 = new String (password2.getPassword());
   String Role = String.valueOf(position.getSelectedItem());
   if(Role.equals("Managing staff")){
    if(age.getText().equals("")||email.getText().equals("")||Fullname.getText().equals("")||password.equals("")||phonenumber.getText().equals("")||password3.equals("")||!Male.isSelected() && !Female.isSelected()|| !night.isSelected() && !day.isSelected()){
        return true;       
    }
    else{ return false;}
   }else{
       if(age.getText().equals("")||email.getText().equals("")||Fullname.getText().equals("")||password.equals("")||phonenumber.getText().equals("")||password3.equals("") || transport.getText().equals("")|| !Male.isSelected() && !Female.isSelected()){
        return true;       
    }
    else{ return false;}
   }
}
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JTextField Fullname;
    private javax.swing.JPanel Gender;
    private javax.swing.JRadioButton Male;
    private javax.swing.JPanel Shift;
    private javax.swing.JLabel SorT;
    private javax.swing.JTextField age;
    private javax.swing.JLabel ageerror;
    private javax.swing.JButton back;
    private javax.swing.JRadioButton day;
    private javax.swing.JTextField email;
    private javax.swing.JLabel err;
    private javax.swing.JLabel errormsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton night;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JTextField phonenumber;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JTextField transport;
    private java.awt.Checkbox view;
    // End of variables declaration//GEN-END:variables
}
