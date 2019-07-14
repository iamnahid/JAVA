
/*
 * GuiSampleView.java
 *
 * Created on Apr 6, 2015, 9:17:56 PM
 */
package guisample;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Sabbir Ahmed
 */
public class GuiSampleView extends javax.swing.JFrame {    
    public GuiSampleView() {
        initComponents();
        getTableData();
    }
    private void getTableData(){
        Connection conn=null;
        Statement st=null;
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            st = conn.createStatement();
            String sql="SELECT * FROM user";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name", "Age", "Gender"}, 0);
            while(rs.next())
            {
                String col1 = rs.getString("ID");
                String col2 = rs.getString("Name");
                String col3 = rs.getString("Age");                
                String col4 = rs.getString("Gender");                
                model.addRow(new Object[]{col1, col2, col3, col4});
            }
            jTableUsers.setModel(model);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public void theQuery(String query){
        Connection conn=null;
        Statement st=null;
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            st = conn.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Congratulations!! The operation done successfully.");
            refreshMethod();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void refreshMethod(){
        jTID.setEditable(true);
        jLabelMessage.setText("");
        jTID.setText("");
        jTName.setText("");
        jTAge.setText("");
        jCBGender.setSelectedItem("Male");
        getTableData(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsers = new javax.swing.JTable();
        jTName = new javax.swing.JTextField();
        jLName = new javax.swing.JLabel();
        jLID = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        jLAge = new javax.swing.JLabel();
        jTAge = new javax.swing.JTextField();
        jCBGender = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButtonADD = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jLabelMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableUsers);

        jLName.setText("Name:");

        jLID.setText("ID:");

        jTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDActionPerformed(evt);
            }
        });

        jLAge.setText("Age:");

        jTAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAgeActionPerformed(evt);
            }
        });

        jCBGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jCBGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBGenderActionPerformed(evt);
            }
        });

        jLabel1.setText("Gender:");

        jButtonADD.setText("ADD");
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jLabelMessage.setFont(new java.awt.Font("Serif", 2, 12));
        jLabelMessage.setForeground(new java.awt.Color(-65536,true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLID)
                            .addComponent(jLName)
                            .addComponent(jLabel1)
                            .addComponent(jLAge))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTID)
                                .addComponent(jTName)
                                .addComponent(jTAge, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCBGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonDelete)
                            .addComponent(jButtonADD, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRefresh)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelMessage)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLName)))
                            .addComponent(jLID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLAge))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonADD)
                                    .addComponent(jButtonEdit))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonDelete)
                                    .addComponent(jButtonExit)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jButtonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                        .addContainerGap(36, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void jTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDActionPerformed
}//GEN-LAST:event_jTIDActionPerformed
private void jTAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAgeActionPerformed
}//GEN-LAST:event_jTAgeActionPerformed
private void jCBGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBGenderActionPerformed
}//GEN-LAST:event_jCBGenderActionPerformed

private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
    try{
        jLabelMessage.setText("");
        if(!jTID.getText().equals("") && !jTName.getText().equals("") && !jTAge.getText().equals("")){
            theQuery("insert into user (ID,Name,Age,Gender)values("+jTID.getText()+",'"+jTName.getText()+"',"+jTAge.getText()+",'"+jCBGender.getSelectedItem()+"'"+")");
        }
        else{
            jLabelMessage.setText("You must need to fill ID, Name & Age fields!!");
        }
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
}//GEN-LAST:event_jButtonADDActionPerformed

private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
    System.exit(0);
}//GEN-LAST:event_jButtonExitActionPerformed

private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
    refreshMethod();
    getTableData();    
}//GEN-LAST:event_jButtonRefreshActionPerformed

private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
    if(jTableUsers.getSelectedRow()==-1){
        if(jTableUsers.getSelectedRow()==0){
            jLabelMessage.setText("Table is empty!!");
        }
        else{
             jLabelMessage.setText("You need to select an user");
        }
    }    
    else{
        jTID.setEditable(false);
        int selectedRowIndex = jTableUsers.getSelectedRow();        
        if(jTID.getText().equals("") && jTName.getText().equals("") && jTAge.getText().equals("")){
            jTID.setText(jTableUsers.getModel().getValueAt(selectedRowIndex, 0).toString());
            jTName.setText(jTableUsers.getModel().getValueAt(selectedRowIndex, 1).toString());
            jTAge.setText(jTableUsers.getModel().getValueAt(selectedRowIndex, 2).toString());
            jCBGender.setSelectedItem(jTableUsers.getModel().getValueAt(selectedRowIndex, 3).toString()); 
        }
        else if(!jTID.getText().equals(jTableUsers.getModel().getValueAt(selectedRowIndex, 0).toString())||
                !jTName.getText().equals(jTableUsers.getModel().getValueAt(selectedRowIndex, 0).toString())||
                !jTAge.getText().equals(jTableUsers.getModel().getValueAt(selectedRowIndex, 0).toString())){            
            theQuery("update user set Name='"+jTName.getText()+"',Age="+jTAge.getText()+",Gender='"+jCBGender.getSelectedItem()+"' where ID="+jTID.getText());
        }
        else{
            jLabelMessage.setText("You dont't update the value!!");
        }
    }
}//GEN-LAST:event_jButtonEditActionPerformed
private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
    if(jTableUsers.getSelectedRow()==-1){
        if(jTableUsers.getSelectedRow()==0){
            jLabelMessage.setText("Table is empty!!");
        }
        else{
             jLabelMessage.setText("You need to select an user");
        }
    }
    
    else{
        int selectedRowIndex = jTableUsers.getSelectedRow();
        theQuery("delete from user where ID="+jTableUsers.getModel().getValueAt(selectedRowIndex, 0));
    }
}//GEN-LAST:event_jButtonDeleteActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuiSampleView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JComboBox jCBGender;
    private javax.swing.JLabel jLAge;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAge;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTName;
    private javax.swing.JTable jTableUsers;
    // End of variables declaration//GEN-END:variables
}
