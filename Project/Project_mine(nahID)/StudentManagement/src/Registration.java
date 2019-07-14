
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        upTable1();
    }
    public void upTable1(){
        try{
            
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            Statement st = conn.createStatement();
            String sql = "SELECT * from reg";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model2 = new DefaultTableModel(new String[]{"C1", "C2", "C3" , "C4" , "CID" , "SNAME", "SID"}, 0);
            while(rs.next())
            {
                String Col1 = rs.getString("c1");
                String Col2 = rs.getString("c2");
                String Col3 = rs.getString("c3"); 
                String Col4 = rs.getString("c4"); 
                String Col5 = rs.getString("cid");
                String Col6 = rs.getString("sname");
                String Col7 = rs.getString("sid"); 
                model2.addRow(new Object[]{Col1, Col2, Col3, Col4, Col5, Col6, Col7});
            }
            jTable3.setModel(model2);
           }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
                }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jBuAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBuRemove = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTeId = new javax.swing.JTextField();
        jTeName = new javax.swing.JTextField();
        jTeCid = new javax.swing.JTextField();
        jBuBack = new javax.swing.JButton();
        jBuExit = new javax.swing.JButton();
        jBuCourse = new javax.swing.JButton();
        jBuStudent = new javax.swing.JButton();
        jBuRefresh = new javax.swing.JButton();
        jBuAssessment = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel1.setText("Welcome To Registration:");

        jTable3.setBackground(new java.awt.Color(0, 153, 153));
        jTable3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable3);

        jBuAdd.setBackground(new java.awt.Color(51, 51, 51));
        jBuAdd.setForeground(new java.awt.Color(255, 255, 255));
        jBuAdd.setText("ADD");
        jBuAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuAddActionPerformed(evt);
            }
        });

        jLabel2.setText("Id:");

        jBuRemove.setBackground(new java.awt.Color(204, 0, 0));
        jBuRemove.setForeground(new java.awt.Color(255, 255, 255));
        jBuRemove.setText("Remove");
        jBuRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuRemoveActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        jLabel5.setText("C_Id:");

        jTeId.setBackground(new java.awt.Color(102, 102, 102));
        jTeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeIdActionPerformed(evt);
            }
        });

        jTeName.setBackground(new java.awt.Color(102, 102, 102));

        jTeCid.setBackground(new java.awt.Color(102, 102, 102));
        jTeCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeCidActionPerformed(evt);
            }
        });

        jBuBack.setBackground(new java.awt.Color(153, 153, 153));
        jBuBack.setForeground(new java.awt.Color(0, 0, 0));
        jBuBack.setText("Back");
        jBuBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuBackActionPerformed(evt);
            }
        });

        jBuExit.setBackground(new java.awt.Color(204, 0, 0));
        jBuExit.setForeground(new java.awt.Color(255, 255, 255));
        jBuExit.setText("Exit");
        jBuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuExitActionPerformed(evt);
            }
        });

        jBuCourse.setBackground(new java.awt.Color(102, 102, 102));
        jBuCourse.setForeground(new java.awt.Color(0, 0, 0));
        jBuCourse.setText("Courses");
        jBuCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuCourseActionPerformed(evt);
            }
        });

        jBuStudent.setBackground(new java.awt.Color(0, 153, 102));
        jBuStudent.setForeground(new java.awt.Color(0, 0, 0));
        jBuStudent.setText("Students");
        jBuStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuStudentActionPerformed(evt);
            }
        });

        jBuRefresh.setBackground(new java.awt.Color(0, 102, 102));
        jBuRefresh.setText("Refresh");
        jBuRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuRefreshActionPerformed(evt);
            }
        });

        jBuAssessment.setBackground(new java.awt.Color(0, 102, 204));
        jBuAssessment.setText("Assessment");
        jBuAssessment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuAssessmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBuBack)
                                .addGap(48, 48, 48)
                                .addComponent(jBuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jBuCourse)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBuStudent)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel3))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTeCid, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTeName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTeId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(101, 101, 101))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBuAdd)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jBuRemove))
                                            .addComponent(jBuRefresh))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)))
                                .addComponent(jBuAssessment)))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBuAdd)
                            .addComponent(jLabel3)
                            .addComponent(jTeName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuRemove)
                            .addComponent(jBuAssessment, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTeId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuCourse)
                            .addComponent(jBuStudent))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBuExit)
                            .addComponent(jBuBack)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jBuRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTeCid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeIdActionPerformed

    private void jBuAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuAddActionPerformed
        try{
            DB db = new DB();
            if(!jTeId.getText().equals("") && !jTeName.getText().equals("") && !jTeCid.getText().equals("") ){
                db.theQuery(" insert into c2 (c1,c2,c3,c4,cid) select * from c1 where cid = '"+jTeCid.getText()+"' ");
                db.theQuery(" insert into reg (c1,c2,c3,c4,cid,sname,sid) select c.c1,c.c2,c.c3,c.c4,c.cid,s.Name,s.Id from c2 c,student s where c.cid = '"+jTeCid.getText()+"' and s.Id = '"+jTeId.getText()+"' ");
        }
        else{
            JOptionPane.showMessageDialog(null,"Error! Please Fill Up All of the Fields");
        }
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jBuAddActionPerformed

    private void jBuRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuRemoveActionPerformed
        if(!jTeId.getText().equals("") && !jTeName.getText().equals("") && !jTeCid.getText().equals("") ){    
            DB db = new DB();    
            db.theQuery(" delete from reg where cid = '"+jTeCid.getText()+"' and sid = '"+jTeId.getText()+"' ");// TODO add your handling code here:
    }//GEN-LAST:event_jBuRemoveActionPerformed
        else{
            JOptionPane.showMessageDialog(null,"Error! Please Fill Up All of the Fields");
        }
    }
    private void jBuBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuBackActionPerformed
        this.dispose();
        new Home1().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jBuBackActionPerformed

    private void jBuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuExitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jBuExitActionPerformed

    private void jTeCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeCidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeCidActionPerformed

    private void jBuStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuStudentActionPerformed
        new Students().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jBuStudentActionPerformed

    private void jBuCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuCourseActionPerformed
        new C2().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jBuCourseActionPerformed

    private void jBuRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuRefreshActionPerformed
        jTeName.setEditable(true);
        jTeName.setText("");
        jTeId.setText("");
        jTeCid.setText("");
        upTable1();         // TODO add your handling code here:
    }//GEN-LAST:event_jBuRefreshActionPerformed

    private void jBuAssessmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuAssessmentActionPerformed
        this.dispose();
        new Assessment().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jBuAssessmentActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuAdd;
    private javax.swing.JButton jBuAssessment;
    private javax.swing.JButton jBuBack;
    private javax.swing.JButton jBuCourse;
    private javax.swing.JButton jBuExit;
    private javax.swing.JButton jBuRefresh;
    private javax.swing.JButton jBuRemove;
    private javax.swing.JButton jBuStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTeCid;
    private javax.swing.JTextField jTeId;
    private javax.swing.JTextField jTeName;
    // End of variables declaration//GEN-END:variables
}
