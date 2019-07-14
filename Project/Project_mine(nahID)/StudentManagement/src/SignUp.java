import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {
    public SignUp() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLName = new javax.swing.JLabel();
        jTeName = new javax.swing.JTextField();
        jLId = new javax.swing.JLabel();
        jTeId = new javax.swing.JTextField();
        jLCgpa = new javax.swing.JLabel();
        jTeCgpa = new javax.swing.JTextField();
        jLDept = new javax.swing.JLabel();
        jTeDept = new javax.swing.JTextField();
        jLPass = new javax.swing.JLabel();
        jPass = new javax.swing.JPasswordField();
        jBuSignUp = new javax.swing.JButton();
        jBuBack = new javax.swing.JButton();
        jBuExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTeBalance = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLName.setText("Name:");

        jTeName.setBackground(new java.awt.Color(153, 153, 153));
        jTeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeNameActionPerformed(evt);
            }
        });

        jLId.setText("ID:");

        jTeId.setBackground(new java.awt.Color(153, 153, 153));
        jTeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeIdActionPerformed(evt);
            }
        });

        jLCgpa.setText("Cgpa:");

        jTeCgpa.setBackground(new java.awt.Color(153, 153, 153));
        jTeCgpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeCgpaActionPerformed(evt);
            }
        });

        jLDept.setText("Dept:");

        jTeDept.setBackground(new java.awt.Color(153, 153, 153));
        jTeDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeDeptActionPerformed(evt);
            }
        });

        jLPass.setText("Pass:");

        jPass.setBackground(new java.awt.Color(153, 153, 153));
        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });

        jBuSignUp.setBackground(new java.awt.Color(0, 102, 102));
        jBuSignUp.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jBuSignUp.setText("Sign Up");
        jBuSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuSignUpActionPerformed(evt);
            }
        });

        jBuBack.setBackground(new java.awt.Color(0, 153, 255));
        jBuBack.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jBuBack.setText("Back");
        jBuBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuBackActionPerformed(evt);
            }
        });

        jBuExit.setBackground(new java.awt.Color(255, 0, 0));
        jBuExit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jBuExit.setText("Exit");
        jBuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuExitActionPerformed(evt);
            }
        });

        jLabel1.setText("Balance:");

        jTeBalance.setBackground(new java.awt.Color(153, 153, 153));
        jTeBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeBalanceActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\man-glass-thumbs-up-hand-sign-flat-icon-vector-illustration-eps-58230218.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBuSignUp)
                        .addGap(30, 30, 30)
                        .addComponent(jBuBack))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLName)
                            .addGap(31, 31, 31)
                            .addComponent(jTeName))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLId)
                                .addComponent(jLCgpa))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(jTeCgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jTeId))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLDept)
                                .addComponent(jLPass))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTeDept)
                                .addComponent(jPass)
                                .addComponent(jTeBalance))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(143, 143, 143)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLName)
                            .addComponent(jTeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLId)
                            .addComponent(jTeId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLCgpa))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTeCgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addComponent(jLDept))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jTeDept, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLPass))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTeBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBuSignUp)
                    .addComponent(jBuBack)
                    .addComponent(jBuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeNameActionPerformed

    private void jTeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeIdActionPerformed

    private void jTeCgpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeCgpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeCgpaActionPerformed

    private void jTeDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeDeptActionPerformed

    private void jPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassActionPerformed

    private void jBuSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuSignUpActionPerformed
        try{
             DB db = new DB();
            if(!jTeName.getText().equals("") && !jTeId.getText().equals("") && !jTeCgpa.getText().equals("") && !jTeDept.getText().equals("") && !jPass.getText().equals("") && !jTeBalance.getText().equals("")){
            db.theQuery("insert into student (Name,Id,Cgpa,Dept,Pass,Balance)values('"+jTeName.getText()+"','"+jTeId.getText()+"','"+jTeCgpa.getText()+"','"+jTeDept.getText()+"','"+jPass.getText()+"','"+jTeBalance.getText()+"')");
            JOptionPane.showMessageDialog(null,"You are Registered!");
        }
        else{
            JOptionPane.showMessageDialog(null, "ErroR: Fill All portions!!");
        }
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    } // TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_jBuSignUpActionPerformed

    private void jBuBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuBackActionPerformed
        this.dispose();
        new Login().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jBuBackActionPerformed

    private void jBuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuExitActionPerformed
        JOptionPane.showMessageDialog(null,"System is exiting..");
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_jBuExitActionPerformed

    private void jTeBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeBalanceActionPerformed
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuBack;
    private javax.swing.JButton jBuExit;
    private javax.swing.JButton jBuSignUp;
    private javax.swing.JLabel jLCgpa;
    private javax.swing.JLabel jLDept;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLName;
    private javax.swing.JLabel jLPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JTextField jTeBalance;
    private javax.swing.JTextField jTeCgpa;
    private javax.swing.JTextField jTeDept;
    private javax.swing.JTextField jTeId;
    private javax.swing.JTextField jTeName;
    // End of variables declaration//GEN-END:variables
}
