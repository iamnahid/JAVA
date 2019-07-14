import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Home1 extends javax.swing.JFrame {

    DB db = new DB();
    ResultSet rs;
    Connection conn=null;
    Statement st=null;
    String sql;
    public Home1() {
        initComponents();
        upTable();
        }
    public void upTable(){
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            st = conn.createStatement();
            sql="SELECT * FROM student";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel(new String[]{"Name", "Id", "Cgpa", "Dept","Balance"}, 0);
            while(rs.next())
            {
                String col1 = rs.getString("Name");
                String col2 = rs.getString("Id");
                String col3 = rs.getString("Cgpa");                
                String col4 = rs.getString("Dept"); 
                String col5 = rs.getString("Balance"); 
                model.addRow(new Object[]{col1, col2, col3,col4, col5});
            }
            jTable.setModel(model);
           }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
                }
        Login l = new Login();
        jLaLog.setText(l.name);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLaName = new javax.swing.JLabel();
        jLaId = new javax.swing.JLabel();
        jLaCgpa = new javax.swing.JLabel();
        jLaDept = new javax.swing.JLabel();
        jLaPass = new javax.swing.JLabel();
        jTeName = new javax.swing.JTextField();
        jTeId = new javax.swing.JTextField();
        jTeCgpa = new javax.swing.JTextField();
        jTeDept = new javax.swing.JTextField();
        jPass = new javax.swing.JPasswordField();
        jBuAdd = new javax.swing.JButton();
        jBuDelete = new javax.swing.JButton();
        jBuExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jBuRefresh = new javax.swing.JButton();
        jBuBack = new javax.swing.JButton();
        jBuCourse = new javax.swing.JButton();
        jBuReg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTeBalance = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLaLog = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setText("Welcome");

        jLaName.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLaName.setText("Name:");

        jLaId.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLaId.setText("ID:");

        jLaCgpa.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLaCgpa.setText("CGPA:");

        jLaDept.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLaDept.setText("Dept:");

        jLaPass.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLaPass.setText("Pass:");

        jTeName.setBackground(new java.awt.Color(102, 102, 102));
        jTeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeNameActionPerformed(evt);
            }
        });

        jTeId.setBackground(new java.awt.Color(102, 102, 102));
        jTeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeIdActionPerformed(evt);
            }
        });

        jTeCgpa.setBackground(new java.awt.Color(102, 102, 102));
        jTeCgpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeCgpaActionPerformed(evt);
            }
        });

        jTeDept.setBackground(new java.awt.Color(102, 102, 102));
        jTeDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeDeptActionPerformed(evt);
            }
        });

        jPass.setBackground(new java.awt.Color(102, 102, 102));
        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });

        jBuAdd.setBackground(new java.awt.Color(0, 0, 0));
        jBuAdd.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jBuAdd.setForeground(new java.awt.Color(255, 255, 255));
        jBuAdd.setText("ADD");
        jBuAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuAddActionPerformed(evt);
            }
        });

        jBuDelete.setBackground(new java.awt.Color(153, 0, 0));
        jBuDelete.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jBuDelete.setForeground(new java.awt.Color(255, 255, 255));
        jBuDelete.setText("DELETE");
        jBuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuDeleteActionPerformed(evt);
            }
        });

        jBuExit.setBackground(new java.awt.Color(204, 0, 0));
        jBuExit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jBuExit.setForeground(new java.awt.Color(255, 255, 255));
        jBuExit.setText("EXIT");
        jBuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuExitActionPerformed(evt);
            }
        });

        jTable.setBackground(new java.awt.Color(0, 102, 204));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable);

        jBuRefresh.setBackground(new java.awt.Color(0, 102, 102));
        jBuRefresh.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jBuRefresh.setText("REFRESH");
        jBuRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuRefreshActionPerformed(evt);
            }
        });

        jBuBack.setBackground(new java.awt.Color(102, 102, 102));
        jBuBack.setText("Back");
        jBuBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuBackActionPerformed(evt);
            }
        });

        jBuCourse.setBackground(new java.awt.Color(51, 51, 51));
        jBuCourse.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jBuCourse.setText("Courses");
        jBuCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuCourseActionPerformed(evt);
            }
        });

        jBuReg.setBackground(new java.awt.Color(0, 102, 204));
        jBuReg.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jBuReg.setText("REGISTRATION");
        jBuReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuRegActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 102, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\icon-user-default (116 x 116).jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        jTeBalance.setBackground(new java.awt.Color(102, 102, 102));
        jTeBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeBalanceActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Balance:");

        jLaLog.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setBackground(new java.awt.Color(0, 102, 204));
        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Logged In As:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLaId)
                            .addComponent(jLaName)
                            .addComponent(jLaCgpa)
                            .addComponent(jLaDept)
                            .addComponent(jLaPass)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTeBalance)
                            .addComponent(jTeName, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(jTeId, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(jTeCgpa, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(jTeDept, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(jPass, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBuCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(jBuReg, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBuAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuDelete))
                        .addGap(27, 27, 27)
                        .addComponent(jBuRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(386, 386, 386)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLaLog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBuBack, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBuRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTeName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLaName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTeId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLaId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLaCgpa)
                            .addComponent(jTeCgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLaDept)
                            .addComponent(jTeDept, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLaPass)
                            .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTeBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLaLog, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jBuAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBuDelete)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBuReg, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBuExit)
                            .addComponent(jBuBack, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBuAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuAddActionPerformed
         try{
             DB db = new DB();
            if(!jTeName.getText().equals("") && !jTeId.getText().equals("") && !jTeCgpa.getText().equals("") && !jTeDept.getText().equals("") && !jPass.getText().equals("")){
            db.theQuery("insert into student (Name,Id,Cgpa,Dept,Pass,Balance)values('"+jTeName.getText()+"','"+jTeId.getText()+"','"+jTeCgpa.getText()+"','"+jTeDept.getText()+"','"+jPass.getText()+"','"+jTeBalance.getText()+"')");
        }
        else{
            JOptionPane.showMessageDialog(null,"Error! Please Fill Up All of the Fields");
        }
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    } // TODO add your handling code here:
    }//GEN-LAST:event_jBuAddActionPerformed

    private void jBuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuDeleteActionPerformed
        if(jTable.getSelectedRow()==-1){
        if(jTable.getSelectedRow()==0){
            JOptionPane.showMessageDialog(null,"Table is empty!!");
           }
        else{
            JOptionPane.showMessageDialog(null,"Please Select an User");
        }
    }
    
    else{
        int selectedRowIndex = jTable.getSelectedRow();
        db.theQuery("delete from student where Id="+jTable.getModel().getValueAt(selectedRowIndex, 1));
    }// TODO add your handling code here:
    }//GEN-LAST:event_jBuDeleteActionPerformed

    private void jBuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuExitActionPerformed
        JOptionPane.showMessageDialog(null,"System is exiting..");
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_jBuExitActionPerformed

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

    private void jBuRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuRefreshActionPerformed
        jTeName.setEditable(true);
        jTeName.setText("");
        jTeId.setText("");
        jTeCgpa.setText("");
        jTeDept.setText("");
        jPass.setText("");
        upTable();    
    }//GEN-LAST:event_jBuRefreshActionPerformed

    private void jBuBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuBackActionPerformed
        this.dispose();
        new Login().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jBuBackActionPerformed

    private void jBuRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuRegActionPerformed
    this.dispose();
    new Registration().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jBuRegActionPerformed

    private void jBuCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuCourseActionPerformed
        this.dispose();
        new Course().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jBuCourseActionPerformed

    private void jTeBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeBalanceActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuAdd;
    private javax.swing.JButton jBuBack;
    private javax.swing.JButton jBuCourse;
    private javax.swing.JButton jBuDelete;
    private javax.swing.JButton jBuExit;
    private javax.swing.JButton jBuRefresh;
    private javax.swing.JButton jBuReg;
    private javax.swing.JLabel jLaCgpa;
    private javax.swing.JLabel jLaDept;
    private javax.swing.JLabel jLaId;
    private javax.swing.JLabel jLaLog;
    private javax.swing.JLabel jLaName;
    private javax.swing.JLabel jLaPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTeBalance;
    private javax.swing.JTextField jTeCgpa;
    private javax.swing.JTextField jTeDept;
    private javax.swing.JTextField jTeId;
    private javax.swing.JTextField jTeName;
    // End of variables declaration//GEN-END:variables
}
