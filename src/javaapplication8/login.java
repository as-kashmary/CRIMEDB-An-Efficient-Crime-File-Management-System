/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication8;

//import com.farhan.main.main;

import com.karim.main.Mainss;
import coms.farhan.main.Mains;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


//import com.farhan.main.main;




/**
 *
 * @author anim_
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    rider Fr=new rider();
    public login() {
        initComponents();
    }
    
    //login validity
    public boolean validatelogin(){
      String s1=lname.getText();
     String s2=new String(lpw.getPassword());
     if(s1.equals("")){
         JOptionPane.showMessageDialog(this,"Please enter the username");
         return false;
     }
     if(s2.equals("")){
         JOptionPane.showMessageDialog(this,"Please enter the password");
         return false;
     }
    
    
    return true;
    
    }
    // checking user is existed or not
    
    
    public boolean checklogindatabase(){
    String username=lname.getText();
    String userpw=new String(lpw.getPassword());
    boolean loginexist=false;
    
        try {
           Connection con=DBConnection.getConnection();
           PreparedStatement pst=con.prepareStatement("select * from signupinfo where name=? and pw=?");
           pst.setString(1,username );
           pst.setString(2,userpw );
           ResultSet rs =pst.executeQuery();
           
           if(rs.next()){
               loginexist=true;
           
           }
           else{
            loginexist=false;
           
           }
           
        } catch (Exception e) {
             e.printStackTrace();
        }
        
        
        return loginexist;
   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lpw = new javax.swing.JPasswordField();
        lname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setPreferredSize(new java.awt.Dimension(1261, 605));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1197, 605));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication8/bg6.jpg"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 30)); // NOI18N
        jLabel2.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 20)); // NOI18N
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 20)); // NOI18N
        jLabel4.setText("Password:");

        lpw.setBackground(new java.awt.Color(255, 255, 204));
        lpw.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        lpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lpwActionPerformed(evt);
            }
        });

        lname.setBackground(new java.awt.Color(255, 255, 204));
        lname.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jButton1.setText("SIGN UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Don't have an account?");

        jButton2.setBackground(new java.awt.Color(255, 204, 51));
        jButton2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox2.setText("Remember me");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(lpw, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                    .addComponent(lname)
                                    .addComponent(jLabel3))
                                .addGap(4, 4, 4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lpw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(142, 142, 142))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1261, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        signup signupFrame=new signup();
        signupFrame.setVisible(true);
        signupFrame.pack();
        signupFrame.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //int b=1;
        if(validatelogin()==true&&checklogindatabase()==true){
            //b=0;
          Mains Frame=new Mains();
            Frame.setVisible(true);
            Frame.pack();
            Frame.setLocationRelativeTo(null);
        
        }
        else {
        String username=lname.getText();
    String userpw=new String(lpw.getPassword());
    boolean loginexist=false;
    
        try {
           Connection con=DBConnection.getConnection();
           PreparedStatement pst=con.prepareStatement("select * from admininfo where NAME=? and PASSWORD=?");
           pst.setString(1,username );
           pst.setString(2,userpw );
           ResultSet rs =pst.executeQuery();
           
           if(rs.next()){
               //b=0;
               loginexist=true;
               Mainss Frame=new Mainss();
            Frame.setVisible(true);
            Frame.pack();
            Frame.setLocationRelativeTo(null);
           
           }
           
           else{
               
               
            loginexist=false;
            rdinfo();
            //JOptionPane.showMessageDialog(this,"Please enter the valid information");
           
           }
           
        } catch (Exception e) {
             e.printStackTrace();
        }
        
        /*if(loginexist){
            Mainss Frame=new Mainss();
            Frame.setVisible(true);
            Frame.pack();
            Frame.setLocationRelativeTo(null);
            
        }
        else{
            JOptionPane.showMessageDialog(this,"Please enter the valid information");
        
        }*/
        
        
        //return loginexist;
            /*Mainss Frame=new Mainss();
            Frame.setVisible(true);
            Frame.pack();
            Frame.setLocationRelativeTo(null);*/
        
        
         /* else if(checklogindatabase()==false){
             JOptionPane.showMessageDialog(this,"Invalid information");
        
        
        }*/
          
        
        
        }
        




// TODO add your handling code here:
           /* main Frame=new main();
            Frame.setVisible(true);
            Frame.pack();
            Frame.setLocationRelativeTo(null);*/
    }//GEN-LAST:event_jButton2ActionPerformed
    public void rdinfo(){
        String username=lname.getText();
    String userpw=new String(lpw.getPassword());
    boolean loginexist=false;
    
        try {
           Connection con=DBConnection.getConnection();
           PreparedStatement pst=con.prepareStatement("select * from riderinfo where Name=? and rpw=?");
           pst.setString(1,username );
           pst.setString(2,userpw );
           ResultSet rs =pst.executeQuery();
           
           if(rs.next()){
               
               
               try {
            Connection mySqlConn= DBConnection.getConnection();
            String mysqlquery="SELECT * FROM riderinfo where rpw=?";
          
            
            PreparedStatement preparedStatement=mySqlConn.prepareStatement(mysqlquery);
            
                preparedStatement.setString(1,userpw);
                //preparedStatement.setString(2,sname.getText());
                //preparedStatement.setString(3,sname.getText());
                //preparedStatement.setString(4,sname.getText());
                ResultSet rst=preparedStatement.executeQuery();
                while(rst.next()){
                    //restaurent DFrame=new  restaurent();
                    Fr.rn.setText(rst.getString("Name"));
                    Fr.ra.setText(rst.getString("Address"));
                    Fr.re.setText(rst.getString("Email"));
                    Fr.rc.setText(rst.getString("Contact"));
                    Fr.rd.setIcon(ViewResizeImage(null,rst.getBytes("riderimage")));
                    Fr.setVisible(true);
                    Fr.pack();
                    Fr.setLocationRelativeTo(null);
                    //profilepic1.setIcon(ViewResizeImage(null,rs.getBytes("IMAGE")));
                   
                    
                }
                
                
            
            /*else{
                JOptionPane.showMessageDialog(this,"Please fill up all the fields");
            }*/
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
               //b=0;
               
               
               
               
               
               
               
            
               /*loginexist=true;
                //rider Frame=new rider();
            Fr.setVisible(true);
            Fr.pack();
            Fr.setLocationRelativeTo(null);*/
           
           
           
           
           
           
           
           
           
           
           
           }
           
           else{
               
               
            loginexist=false;
            JOptionPane.showMessageDialog(this,"Please enter the valid information");
           
           }
           
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox1.isSelected()){
            lpw.setEchoChar((char)0);
        }
        else{
            lpw.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void lpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lpwActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField lpw;
    // End of variables declaration//GEN-END:variables
 private ImageIcon ViewResizeImage(String imgpath,byte[] imgbytes){
    int imagex=180;
    int imagey=170;
    ImageIcon myImage =null;
    Fr.rd.setSize(imagex, imagey);
    if(imgpath!=null){
        myImage=new ImageIcon(imgpath);
    }
    else{
        myImage=new ImageIcon(imgbytes);
    }
    
    Image img =myImage.getImage();
    Image newImage=img.getScaledInstance(Fr.rd.getWidth(), Fr.rd.getHeight(),Image.SCALE_SMOOTH);
    ImageIcon image =new ImageIcon(newImage);
    
    return image;


}







}
