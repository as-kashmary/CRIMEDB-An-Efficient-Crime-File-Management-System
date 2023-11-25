package com.raven.forms;

import com.mysql.cj.jdbc.Blob;
import com.mysql.cj.xdevapi.Table;
import com.karim.model.Model_Card;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileInputStream;
import javaapplication8.DBConnection;
import javax.swing.JFileChooser;


public class Form1 extends javax.swing.JPanel {
    
    DefaultTableModel model;
    
    String r_name,r_address;
    int r_id,r_contact;
    byte[] photo=null;
    String filename=null;
    


    public Form1() {
        initComponents();
        setrestaurentinfo();
        testdata();
    }
    
    private void testdata(){
    Statement st=null;
    ResultSet rs=null;
    long l=System.currentTimeMillis();
        Date todaysDate= new Date(l);
            
          
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapp","root","");
            st=con.createStatement();
            rs=st.executeQuery("select * from rinfo");
            rs.last();
            
            String d=Integer.toString(rs.getRow());
            cardm11.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/iconrestaurent.png")), "Total Restaurents", d));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    
    
    
    
    }
    
    public void setrestaurentinfo(){
         try {
            Class.forName("com.mysql.jdbc.Driver");
             Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapp","root","");
             Statement st=con.createStatement();
             
             ResultSet rs=st.executeQuery("select * from rinfo");
             
             while(rs.next()){
                 
                 int res_id=rs.getInt("r_id");
                 String res_name=rs.getString("r_name");
                         
                 String res_address=rs.getString("r_address");
             
                 //int res_id=rs.getInt("r_id");
                 int res_contact=rs.getInt("r_contact");
                 
                 Object obj[]={res_id,res_name, res_address,res_contact};
                 model=(DefaultTableModel)tbl_rinfo.getModel();
                 model.addRow(obj);
             
             }
         
         } catch (Exception e) {
            
            e.printStackTrace();
        }
    
    
    
    
    
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cardm11 = new com.raven.components.Cardm1();
        panelShadow1 = new com.karim.swing.PanelShadow();
        jLabel2 = new javax.swing.JLabel();
        rid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rcontact = new javax.swing.JTextField();
        rname = new javax.swing.JTextField();
        raddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        panelShadow2 = new com.karim.swing.PanelShadow();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_rinfo = new rojeru_san.complementos.RSTableMetro();
        search = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        panelShadow3 = new com.karim.swing.PanelShadow();
        pic = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 246, 253));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Restaurent Analysis");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel2.setBackground(new java.awt.Color(245, 245, 245));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Enter Restaurent ID:");

        rid.setBackground(new java.awt.Color(255, 255, 204));
        rid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ridMouseClicked(evt);
            }
        });
        rid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ridActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(245, 245, 245));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(245, 245, 245));
        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Restaurent Contact:");

        jLabel6.setBackground(new java.awt.Color(245, 245, 245));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("Restaurent Address:");

        jLabel7.setBackground(new java.awt.Color(245, 245, 245));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("Restaurent Name:");

        rcontact.setBackground(new java.awt.Color(255, 255, 204));
        rcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcontactActionPerformed(evt);
            }
        });

        rname.setBackground(new java.awt.Color(255, 255, 204));
        rname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnameActionPerformed(evt);
            }
        });

        raddress.setBackground(new java.awt.Color(255, 255, 204));
        raddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raddressActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 0));
        jButton4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton4.setText("REFRESH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(raddress, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(rcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(rid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(raddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(rcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tbl_rinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Contact"
            }
        ));
        tbl_rinfo.setColorBackgoundHead(new java.awt.Color(255, 204, 0));
        tbl_rinfo.setRowHeight(30);
        tbl_rinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_rinfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_rinfo);

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );
        panelShadow2Layout.setVerticalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        search.setBackground(new java.awt.Color(255, 255, 204));
        search.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 0));
        jButton5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        panelShadow3.setShadowType(com.raven.shadow.ShadowBorder.ShadowType.IN_SHADOW);

        javax.swing.GroupLayout panelShadow3Layout = new javax.swing.GroupLayout(panelShadow3);
        panelShadow3.setLayout(panelShadow3Layout);
        panelShadow3Layout.setHorizontalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );
        panelShadow3Layout.setVerticalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        jButton6.setText("Choose");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(271, 271, 271)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardm11, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(panelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addGap(12, 12, 12)
                        .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jButton6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardm11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void raddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raddressActionPerformed

    private void rnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnameActionPerformed

    private void rcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcontactActionPerformed

    private void ridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ridActionPerformed

    private void tbl_rinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_rinfoMouseClicked
        int rowno=tbl_rinfo.getSelectedRow();
        TableModel model=tbl_rinfo.getModel();
        rid.setText(model.getValueAt(rowno,0).toString());
        //String s=model.getValueAt(rowno, 1).toString();
        rname.setText(model.getValueAt(rowno,1).toString());
        raddress.setText(model.getValueAt(rowno,2).toString());
        rcontact.setText(model.getValueAt(rowno,3).toString());
        try {
            Connection mySqlConn= DBConnection.getConnection();
            String mysqlquery="SELECT * FROM rinfo where R_Id=?";
          
            
            PreparedStatement preparedStatement=mySqlConn.prepareStatement(mysqlquery);
         
                preparedStatement.setString(1,rid.getText());
                //preparedStatement.setString(2,sname.getText());
                //preparedStatement.setString(3,sname.getText());
                //preparedStatement.setString(4,sname.getText());
                ResultSet rs=preparedStatement.executeQuery();
                while(rs.next()){
                    
                    pic.setIcon(ViewResizeImage(null,rs.getBytes("resimage")));
                   
                    
                }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_tbl_rinfoMouseClicked
   
    //toadd information about restaurent
    public boolean addrinfo(){
        
        boolean isadded=false;
            r_id=Integer.parseInt(rid.getText());
            r_name=rname.getText();
            r_address =raddress.getText();
            r_contact=Integer.parseInt(rcontact.getText());
    
            try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapp","root","");
             String sql="insert into rinfo values(?,?,?,?)";
             PreparedStatement pst=con.prepareStatement(sql);
             
             pst.setInt(1, r_id);
             pst.setString(2, r_name);
             pst.setString(3, r_address);
             pst.setInt(4, r_contact);
             //pst.setBytes(5, photo);_
             
             int rowcount= pst.executeUpdate();
             
             if(rowcount>0){
             
             isadded=true;
             
             
             }
             else{
             isadded=false;
             }
             
        } catch (Exception e) {
            e.printStackTrace();
            
        }
            
            return isadded;
    
    }
    
    // clear the info of the table;
    public void cleartable(){
        DefaultTableModel model= (DefaultTableModel)tbl_rinfo.getModel();
        model.setRowCount(0);
    
    }
    
    // update information
    
    public boolean updaterinfo(){
            boolean isupdated=false;
            r_id=Integer.parseInt(rid.getText());
            r_name=rname.getText();
            r_address =raddress.getText();
            r_contact=Integer.parseInt(rcontact.getText());
            
            
            try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapp","root","");
             String sql="update rinfo set R_Name=?,R_Address=?,R_Contact=? where R_Id=?";
             PreparedStatement pst=con.prepareStatement(sql);
             
             //pst.setInt(1, r_id);
             pst.setString(1, r_name);
             pst.setString(2, r_address);
             pst.setInt(3, r_contact);
             pst.setInt(4, r_id);
             
             int rowcount= pst.executeUpdate();
             
             if(rowcount>0){
             
             isupdated=true;
             
             
             }
             else{
             isupdated=false;
             }
             
        } catch (Exception e) {
            e.printStackTrace();
            
        }
            
            return isupdated;
    
    
    
    }
    
    //information deletion
    
    public boolean deleterinfo(){
            boolean isdeleted=false;
            r_id=Integer.parseInt(rid.getText());  
            try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapp","root","");
             String sql="delete from rinfo  where R_Id=?";
             PreparedStatement pst=con.prepareStatement(sql);
             
             pst.setInt(1, r_id);
          
             
             int rowcount= pst.executeUpdate();
             
             if(rowcount>0){
             
             isdeleted=true;
             
             
             }
             else{
             isdeleted=false;
             }
             
        } catch (Exception e) {
            e.printStackTrace();
            
        }
            
            return isdeleted;
    
    
    
    }
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(updaterinfo()){
            JOptionPane.showMessageDialog(this, "Update Successfull");
            cleartable();
            setrestaurentinfo();
            
        }
        else{
        
               JOptionPane.showMessageDialog(this, "Update Failed");
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(deleterinfo()){
            JOptionPane.showMessageDialog(this, "Deletion Successfull");
            cleartable();
            setrestaurentinfo();
            
        }
        else{
        
               JOptionPane.showMessageDialog(this, "Deletion Failed");
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(addrinfo()){
            JOptionPane.showMessageDialog(this, "Addition Successfull");
            cleartable();
            setrestaurentinfo();
            
        }
        else{
        
               JOptionPane.showMessageDialog(this, "Addition Failed");
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           
            //DFrame.pack();
            //DFrame.setLocationRelativeTo(null);
            rid.setText("");
                rname.setText("");
                raddress.setText("");
                rcontact.setText("");
                 search.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        
    }//GEN-LAST:event_searchActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        r_id=Integer.parseInt(search.getText());
        
        try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapp","root","");
             String sql="select * from rinfo  where R_Id=?";
             PreparedStatement pst=con.prepareStatement(sql);
             pst.setInt(1, r_id);
             
             ResultSet rs=pst.executeQuery();
             
             if(rs.next()){
                rid.setText(rs.getString("R_Id"));
                rname.setText(rs.getString("R_Name"));
                raddress.setText(rs.getString("R_Address"));
                rcontact.setText(rs.getString("R_Contact"));
             
         
             }
             else{
             JOptionPane.showMessageDialog(this, "Not registered yet");
             
             }
             
             
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        ImageIcon imageIcon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(pic.getWidth(),pic.getHeight(),Image.SCALE_SMOOTH));
        pic.setIcon(imageIcon );
        
        try {
            File image =new File(filename);
            FileInputStream fis= new FileInputStream(image);
            ByteArrayOutputStream bos =new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readnum;(readnum=fis.read(buf))!=-1;){
                bos.write(buf,0,readnum);
            
            }
            photo=bos.toByteArray();
            
        } catch (Exception e) {
        }
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void ridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ridMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ridMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.components.Cardm1 cardm11;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private com.karim.swing.PanelShadow panelShadow1;
    private com.karim.swing.PanelShadow panelShadow2;
    private com.karim.swing.PanelShadow panelShadow3;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField raddress;
    private javax.swing.JTextField rcontact;
    private javax.swing.JTextField rid;
    private javax.swing.JTextField rname;
    private javax.swing.JTextField search;
    private rojeru_san.complementos.RSTableMetro tbl_rinfo;
    // End of variables declaration//GEN-END:variables
private ImageIcon ViewResizeImage(String imgpath,byte[] imgbytes){
    int imagex=224;
    int imagey=238;
    ImageIcon myImage =null;
    pic.setSize(imagex, imagey);
    if(imgpath!=null){
        myImage=new ImageIcon(imgpath);
    }
    else{
        myImage=new ImageIcon(imgbytes);
    }
    
    Image img =myImage.getImage();
    Image newImage=img.getScaledInstance(pic.getWidth(), pic.getHeight(),Image.SCALE_SMOOTH);
    ImageIcon image =new ImageIcon(newImage);
    
    return image;


}


}




