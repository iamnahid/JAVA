import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Course extends javax.swing.JFrame {

    /**
     * Creates new form Course
     */
    DB db = new DB();
    ResultSet rs;
    Connection conn=null;
    Statement st=null;
    public Course() {
        initComponents();
        upTable2();
    }
    public void upTable2(){
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            st = conn.createStatement();
            String sql="SELECT * FROM cour_list";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel(new String[]{"id", "name", "credit" , "code"}, 0);
            while(rs.next())
            {
                String col1 = rs.getString("id");
                String col2 = rs.getString("name");
                String col3 = rs.getString("credit"); 
                String col4 = rs.getString("code");
                model.addRow(new Object[]{col1, col2, col3, col4});
            }
            jTable1.setModel(model);
           }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
                }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBuBack = new javax.swing.JButton();
        jBuExit = new javax.swing.JButton();
        jBuAdd = new javax.swing.JButton();
        jBuDelete = new javax.swing.JButton();
        jLaId = new javax.swing.JLabel();
        jTeC1 = new javax.swing.JTextField();
        jLaName = new javax.swing.JLabel();
        jTeC2 = new javax.swing.JTextField();
        jLaCid = new javax.swing.JLabel();
        jTeC3 = new javax.swing.JTextField();
        jBuClose = new javax.swing.JButton();
        jTeC4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBuRefresh = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course Desciption:");

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBuBack.setBackground(new java.awt.Color(102, 102, 102));
        jBuBack.setText("Back");
        jBuBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuBackActionPerformed(evt);
            }
        });

        jBuExit.setBackground(new java.awt.Color(204, 0, 0));
        jBuExit.setText("Exit");
        jBuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuExitActionPerformed(evt);
            }
        });

        jBuAdd.setBackground(new java.awt.Color(51, 51, 51));
        jBuAdd.setForeground(new java.awt.Color(255, 255, 255));
        jBuAdd.setText("ADD");
        jBuAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuAddActionPerformed(evt);
            }
        });

        jBuDelete.setBackground(new java.awt.Color(204, 0, 0));
        jBuDelete.setText("DELETE");
        jBuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuDeleteActionPerformed(evt);
            }
        });

        jLaId.setText("ID:");

        jTeC1.setBackground(new java.awt.Color(102, 102, 102));
        jTeC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeC1ActionPerformed(evt);
            }
        });

        jLaName.setText("NAME:");

        jTeC2.setBackground(new java.awt.Color(102, 102, 102));

        jLaCid.setText("CREDIT:");

        jTeC3.setBackground(new java.awt.Color(102, 102, 102));
        jTeC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeC3ActionPerformed(evt);
            }
        });

        jBuClose.setBackground(new java.awt.Color(51, 51, 51));
        jBuClose.setText("Close");
        jBuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuCloseActionPerformed(evt);
            }
        });

        jTeC4.setBackground(new java.awt.Color(102, 102, 102));
        jTeC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeC4ActionPerformed(evt);
            }
        });

        jLabel2.setText("CODE:");

        jBuRefresh.setBackground(new java.awt.Color(0, 102, 102));
        jBuRefresh.setText("Refresh");
        jBuRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLaId)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTeC1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLaCid)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTeC4)
                                            .addComponent(jTeC3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLaName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTeC2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBuAdd))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBuDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBuRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jBuBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBuClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jBuExit)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTeC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLaId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTeC2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLaName))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTeC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTeC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLaCid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBuAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBuRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBuExit)
                            .addComponent(jBuClose)
                            .addComponent(jBuBack)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBuBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuBackActionPerformed
        this.dispose();
        new Home1().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jBuBackActionPerformed

    private void jBuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuExitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jBuExitActionPerformed

    private void jTeC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeC1ActionPerformed

    private void jTeC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeC3ActionPerformed

    private void jBuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuCloseActionPerformed
        this.dispose();
        new Home1().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jBuCloseActionPerformed

    private void jTeC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeC4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeC4ActionPerformed

    private void jBuRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuRefreshActionPerformed
        jTeC1.setText("");
        jTeC2.setText("");
        jTeC3.setText("");
        jTeC4.setText("");
        upTable2();         // TODO add your handling code here:
    }//GEN-LAST:event_jBuRefreshActionPerformed

    private void jBuAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuAddActionPerformed
        try{
            DB db = new DB();
            if(!jTeC1.getText().equals("") && !jTeC2.getText().equals("") && !jTeC3.getText().equals("")){
                db.theQuery("insert into cour_list (id,name,credit,code)values('"+jTeC1.getText()+"','"+jTeC2.getText()+"','"+jTeC3.getText()+"','"+jTeC4.getText()+"')");
            }
            else{
                JOptionPane.showMessageDialog(null,"Error! Please Fill Up All of the Fields");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jBuAddActionPerformed

    private void jBuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuDeleteActionPerformed
        if(jTable1.getSelectedRow()==-1){
            if(jTable1.getSelectedRow()==0){
                JOptionPane.showMessageDialog(null,"Table is empty!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Please Select a Course!");
            }
        }

        else{
            int selectedRowIndex = jTable1.getSelectedRow();
            db.theQuery("delete from cour_list where id="+jTable1.getModel().getValueAt(selectedRowIndex, 1));
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jBuDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuAdd;
    private javax.swing.JButton jBuBack;
    private javax.swing.JButton jBuClose;
    private javax.swing.JButton jBuDelete;
    private javax.swing.JButton jBuExit;
    private javax.swing.JButton jBuRefresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLaCid;
    private javax.swing.JLabel jLaId;
    private javax.swing.JLabel jLaName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTeC1;
    private javax.swing.JTextField jTeC2;
    private javax.swing.JTextField jTeC3;
    private javax.swing.JTextField jTeC4;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
