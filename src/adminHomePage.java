
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

public class adminHomePage extends javax.swing.JFrame {

    Conn c=new Conn();
    private String userName;
    public adminHomePage() {
        initComponents();
       
    }
    public adminHomePage(String userName){
        this.userName=userName;
        initComponents();
        
        ImageIcon myImg1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/5.jpg")));
        Image imf = myImg1.getImage();
        Image img0 = imf.getScaledInstance(textbox.getWidth(), textbox.getHeight(), Image.SCALE_AREA_AVERAGING);
        ImageIcon ii;
        ii = new ImageIcon(img0);
        
        textbox.setIcon(ii);
        
         ResultSet rs=null;
         
         noTraffic.setEnabled(false);
         MediumTraffic.setEnabled(false);
         HighTraffic.setEnabled(false);
         
         try {
   
    String query = "SELECT * FROM route";
    rs=c.stm.executeQuery(query);
    while(rs.next())
    {
        String cl=rs.getString("CurrentLocation");
        String dl=rs.getString("Destination");
        
        Jcombobox.addItem(cl);
        Jcombobox1.addItem(dl);
    }
    
    } catch (Exception E) {
        }     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Jcombobox = new javax.swing.JComboBox<>();
        HighTraffic = new javax.swing.JButton();
        noTraffic = new javax.swing.JButton();
        MediumTraffic = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Jcombobox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        statusBox = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        textbox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 50));
        setMinimumSize(new java.awt.Dimension(850, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Wel-Come to Traffic Control System Admin Panel");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 11, 710, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 70));

        Jcombobox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(Jcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 40));

        HighTraffic.setBackground(new java.awt.Color(255, 0, 51));
        HighTraffic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        HighTraffic.setText("High Traffic");
        HighTraffic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HighTrafficActionPerformed(evt);
            }
        });
        getContentPane().add(HighTraffic, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 120, 40));

        noTraffic.setBackground(new java.awt.Color(51, 255, 51));
        noTraffic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        noTraffic.setText("No Traffic");
        noTraffic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTrafficActionPerformed(evt);
            }
        });
        getContentPane().add(noTraffic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 120, 40));

        MediumTraffic.setBackground(new java.awt.Color(255, 153, 153));
        MediumTraffic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MediumTraffic.setText("Midium Traffic");
        MediumTraffic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediumTrafficActionPerformed(evt);
            }
        });
        getContentPane().add(MediumTraffic, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 120, 40));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jButton4.setText("Add New Route");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 220, 50));

        Jcombobox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(Jcombobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 190, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update Current Traffic Status");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 360, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Check Route Status");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 200, 40));

        statusBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(statusBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 240, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Current Traffic Status");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 110, 200, 50));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 70, 110, 30));
        getContentPane().add(textbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 840, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String CL = JOptionPane.showInputDialog(this, "Write Your Current Location");
        String DL = JOptionPane.showInputDialog(this, "Destination");
        //String status=JOptionPane.showInputDialog(this,"What is the current Traffic Status ?");
        String[] options = { "Low", "Medium", "High" };

// Assuming 'this' is the parent component, and other parameters are already defined
String selectedStatus = (String) JOptionPane.showInputDialog(
    this,
    "Select Traffic Status:",
    "Traffic Status Selection",
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[0]
);

System.out.println("Selected Status: " + selectedStatus);
   try{
          
            String query = "INSERT INTO route VALUES ('" + CL + "', '" + DL + "', '" + selectedStatus + "')";
            
            int i=c.stm.executeUpdate(query);
           
            if(i!=0){
                JOptionPane.showMessageDialog(this, "Route added Successfully");
            this.dispose();
            new adminHomePage("").setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this,"Route Added Failed");
            }
        }catch(Exception e){
            System.out.println("Something wernt wrong");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void noTrafficActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTrafficActionPerformed
        // TODO add your handling code here:
       String cl = Jcombobox.getSelectedItem().toString();
       String dl = Jcombobox1.getSelectedItem().toString();
       
    try {
        String query = "UPDATE route SET Status='Low' WHERE CurrentLocation='" + cl + "' AND Destination='" + dl + "'";

        int i = c.stm.executeUpdate(query);
        
        if (i!=0) {
            
        JOptionPane.showMessageDialog(this, "Update Successful");
         } else {
            
        JOptionPane.showMessageDialog(this, "Update Failed");
        }
    
    }   
    catch (Exception e) {
    System.out.println("Database Error: " + e.getMessage());
        }
    }//GEN-LAST:event_noTrafficActionPerformed

    private void MediumTrafficActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediumTrafficActionPerformed
        // TODO add your handling code here:
         String cl = Jcombobox.getSelectedItem().toString();
       String dl = Jcombobox1.getSelectedItem().toString();
       
    try {
        String query = "UPDATE route SET Status='Medium' WHERE CurrentLocation='" + cl + "' AND Destination='" + dl + "'";

        int i = c.stm.executeUpdate(query);
        
        if (i!=0) {
            
        JOptionPane.showMessageDialog(this, "Update Successful");
         } else {
            
        JOptionPane.showMessageDialog(this, "Update Failed");
        }
    
    }   
    catch (Exception e) {
    System.out.println("Database Error: " + e.getMessage());
        }
    }//GEN-LAST:event_MediumTrafficActionPerformed

    private void HighTrafficActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HighTrafficActionPerformed
        // TODO add your handling code here:
         String cl = Jcombobox.getSelectedItem().toString();
       String dl = Jcombobox1.getSelectedItem().toString();
       
    try {
        String query = "UPDATE route SET Status='High' WHERE CurrentLocation='" + cl + "' AND Destination='" + dl + "'";

        int i = c.stm.executeUpdate(query);
        
        if (i!=0) {
            
        JOptionPane.showMessageDialog(this, "Update Successful");
         } else {
            
        JOptionPane.showMessageDialog(this, "Update Failed");
        }
    
    }   
    catch (Exception e) {
    System.out.println("Database Error: " + e.getMessage());
        }
    }//GEN-LAST:event_HighTrafficActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String dl1=Jcombobox.getSelectedItem().toString();
        String cl1=Jcombobox1.getSelectedItem().toString();
        try{
            ResultSet rs1=null;
            String query="select Status from route where CurrentLocation='"+dl1+"' and Destination='"+cl1+"'";
            rs1=c.stm.executeQuery(query);
            if(rs1.next()){
                String h=rs1.getString("Status");
                statusBox.setText(h);
                noTraffic.setEnabled(true);
                MediumTraffic.setEnabled(true);
                HighTraffic.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "No Update avaible for those route");
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new admin_panel().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(adminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHomePage("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HighTraffic;
    private javax.swing.JComboBox<String> Jcombobox;
    private javax.swing.JComboBox<String> Jcombobox1;
    private javax.swing.JButton MediumTraffic;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton noTraffic;
    private javax.swing.JLabel statusBox;
    private javax.swing.JLabel textbox;
    // End of variables declaration//GEN-END:variables
}
