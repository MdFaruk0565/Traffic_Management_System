
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class HomePage extends javax.swing.JFrame {
Conn c=new Conn();
   ResultSet rs=null,rs1=null,rs0=null;
   private String Email;

public HomePage(String Email){
    initComponents();
    
    ImageIcon myImg1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("1.jpg")));
        Image imf = myImg1.getImage();
        Image img0 = imf.getScaledInstance(textbox.getWidth(), textbox.getHeight(), Image.SCALE_AREA_AVERAGING);
        ImageIcon ii;
        ii = new ImageIcon(img0);
        textbox.setIcon(ii);
    
    this.Email=Email;
    ResultSet rs=null;
    try{
        System.out.println("Test 01");
        String setName="SELECT * FROM sign_up WHERE Email = '"+Email+"'";
        System.out.println("Test 02");
        rs0=c.stm.executeQuery(setName);
        System.out.println("Test 03");
        if(rs0.next()){
            String getName=rs0.getString("Name");
            System.out.println(getName);
            name.setText(getName);
        }
    }catch(Exception e){
        System.out.println("Database Error!");
    }
         try {
   
    String query = "SELECT * FROM route";
    rs=c.stm.executeQuery(query);
    while(rs.next())
    {
        String cl=rs.getString("CurrentLocation");
        String dl=rs.getString("Destination");
       
        Jcombobox.addItem(dl);
        Jcombobox1.addItem(cl);
    }
    
} catch (Exception E) {
   
}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Jcombobox = new javax.swing.JComboBox<>();
        Jcombobox1 = new javax.swing.JComboBox<>();
        name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        statusBox = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        textbox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(220, 20));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Traffic Control System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 480, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 80));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Update Profile");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Check Route Status");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 200, 60));

        Jcombobox.setEditable(true);
        Jcombobox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Jcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Destination" }));
        getContentPane().add(Jcombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 220, 60));

        Jcombobox1.setEditable(true);
        Jcombobox1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Jcombobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Current Location" }));
        getContentPane().add(Jcombobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 240, 190, 60));

        name.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 0));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 280, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Traffic Status");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 40));

        statusBox.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        statusBox.setForeground(new java.awt.Color(255, 0, 51));
        statusBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(statusBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 230, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 400, 60));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 513, 130, 40));
        getContentPane().add(textbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 890, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String dl1=Jcombobox.getSelectedItem().toString();
        String cl1=Jcombobox1.getSelectedItem().toString();
        try{
            ResultSet rs1=null;
            String query="select Status from route where CurrentLocation='"+cl1+"' and Destination='"+dl1+"'";
            rs1=c.stm.executeQuery(query);
            if(rs1.next()){
                String h=rs1.getString("Status");
                statusBox.setText(h);
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
        new login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

 
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Jcombobox;
    private javax.swing.JComboBox<String> Jcombobox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel statusBox;
    private javax.swing.JLabel textbox;
    // End of variables declaration//GEN-END:variables
}
