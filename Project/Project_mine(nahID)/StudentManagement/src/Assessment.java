import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Assessment extends javax.swing.JFrame {
    
    DB db = new DB();
    ResultSet rs;
    Connection conn=null;
    Statement st=null;
    String sql;
    double balance = 0;
    double cBalance = 0;
    int cred = 12;
    float tution = cred * 5000;
    float m = 3500;
    float total;
    float dis = 0;
  
    public Assessment() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jSpinner1 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLaCre = new javax.swing.JLabel();
        jLaTu = new javax.swing.JLabel();
        jLaMis = new javax.swing.JLabel();
        jLaTo = new javax.swing.JLabel();
        jLaDis = new javax.swing.JLabel();
        jLaCur = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTeName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTeId = new javax.swing.JTextField();
        jBuAssess = new javax.swing.JButton();
        jBuRefresh = new javax.swing.JButton();
        jBuPrint = new javax.swing.JButton();
        jBuClose = new javax.swing.JButton();
        jBuExit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLaPre = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Assessment Details");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Credits:");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Tution:");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Miscellenious:");

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Total:");

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Discount:");

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Cur.Balance:");

        jLaTu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLaTuAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel15.setText("Name:");

        jTeName.setBackground(new java.awt.Color(102, 102, 102));
        jTeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeNameActionPerformed(evt);
            }
        });

        jLabel16.setText("ID:");

        jTeId.setBackground(new java.awt.Color(102, 102, 102));

        jBuAssess.setBackground(new java.awt.Color(0, 102, 255));
        jBuAssess.setForeground(new java.awt.Color(255, 255, 255));
        jBuAssess.setText("Assess");
        jBuAssess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuAssessActionPerformed(evt);
            }
        });

        jBuRefresh.setBackground(new java.awt.Color(0, 153, 153));
        jBuRefresh.setForeground(new java.awt.Color(0, 0, 0));
        jBuRefresh.setText("Refresh");
        jBuRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuRefreshActionPerformed(evt);
            }
        });

        jBuPrint.setBackground(new java.awt.Color(255, 255, 255));
        jBuPrint.setForeground(new java.awt.Color(0, 102, 255));
        jBuPrint.setText("Print");
        jBuPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuPrintActionPerformed(evt);
            }
        });

        jBuClose.setText("Close");
        jBuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuCloseActionPerformed(evt);
            }
        });

        jBuExit.setText("Exit");
        jBuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuExitActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Prev Balance:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)))
                        .addGap(54, 54, 54)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLaCre, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLaTu, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(47, 47, 47))
                                                    .addComponent(jBuClose))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLaPre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(136, 136, 136)
                                        .addComponent(jBuRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTeName)
                                    .addComponent(jTeId, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBuPrint)
                                        .addComponent(jBuAssess)
                                        .addComponent(jBuExit))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLaCur, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(jLaDis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLaTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLaMis, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 339, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jTeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(jLaCre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jTeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLaTu, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLaMis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBuRefresh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jBuAssess)
                                .addGap(18, 18, 18)
                                .addComponent(jBuPrint))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLaPre, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLaTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLaDis, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLaCur, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuClose)
                    .addComponent(jBuExit))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeNameActionPerformed

    private void jLaTuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLaTuAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLaTuAncestorAdded

    private void jBuAssessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuAssessActionPerformed
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            st = conn.createStatement();
            sql=" SELECT Balance FROM student where Name = '"+jTeName.getText()+"' and Id = '"+jTeId.getText()+"' ";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                    balance = rs.getFloat("Balance");
                }
           }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
            String c1 = Integer.toString(cred);
            jLaCre.setText(c1);
            String b1 = Double.toString(balance);
            jLaPre.setText(b1);
            String t1 = Float.toString(tution);
            jLaTu.setText(t1);
            String m1 = Float.toString(m);
            jLaMis.setText(m1);
            total = tution + m;
            String t = Float.toString(total);
            jLaTo.setText(t);
            String d = Float.toString(dis);
            jLaDis.setText(d);
            cBalance = balance - total;  
            String b = Double.toString(cBalance);
            jLaCur.setText(b);                         
    }//GEN-LAST:event_jBuAssessActionPerformed

    private void jBuRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuRefreshActionPerformed
        jTeName.setEditable(true);
        jTeName.setText("");
        jTeId.setText("");
        jLaCre.setText("");
        jLaTu.setText("");
        jLaMis.setText("");
        jLaTo.setText("");
        jLaPre.setText("");
        jLaDis.setText("");
        jLaCur.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jBuRefreshActionPerformed

    private void jBuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuExitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jBuExitActionPerformed

    private void jBuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuCloseActionPerformed
        this.dispose();
        new Home1().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jBuCloseActionPerformed

    private void jBuPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuPrintActionPerformed
        File file = new File("C:\\Users\\NahID\\Desktop/print.txt");
        try{
            PrintWriter out = new PrintWriter(file);
            out.println("Name: "+jTeName.getText());
            out.println("Id:   "+jTeId.getText());
            out.println("***************************************\n");
            out.println("\t\tMiscellaneous:  "+m);
            out.println("\t\tBalance: \t"+balance);
            out.println("\t\tTution:   \t"+tution);
            out.println("\t\tDiscount: \t"+dis);
            out.println("***************************************\n");
            out.println("Total: "+total);
            out.println("Current Balance: "+cBalance);
            out.println("\n");
            out.println("\n");
            out.println("\n\t\t\t\t\t\t Designed by NahID");            
            out.println("\n\t\t\t\t\t\t -----------------");
            out.close();
            
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
    }//GEN-LAST:event_jBuPrintActionPerformed

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
            java.util.logging.Logger.getLogger(Assessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assessment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assessment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuAssess;
    private javax.swing.JButton jBuClose;
    private javax.swing.JButton jBuExit;
    private javax.swing.JButton jBuPrint;
    private javax.swing.JButton jBuRefresh;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLaCre;
    private javax.swing.JLabel jLaCur;
    private javax.swing.JLabel jLaDis;
    private javax.swing.JLabel jLaMis;
    private javax.swing.JLabel jLaPre;
    private javax.swing.JLabel jLaTo;
    private javax.swing.JLabel jLaTu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTeId;
    private javax.swing.JTextField jTeName;
    // End of variables declaration//GEN-END:variables
}
