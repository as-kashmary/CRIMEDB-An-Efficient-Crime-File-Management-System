package coms.farhan.component;

import coms.farhan.event.EventMenu;
import coms.farhan.event.EventMenuCallBack;
import coms.farhan.event.EventMenuSelected;
//import coms.farhan.main.restaurent;
import coms.farhan.model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Path2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javaapplication8.DBConnection;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class Menu extends javax.swing.JPanel {
    restaurent DFrame=new  restaurent();

    public void addEventMenu(EventMenu event) {
        this.event = event;
    }
    

    private int selectedIndex = -1;
    private final Timer timer;
    private boolean toUp;   //  For animation is go up
    private int menuYTarget;
    private int menuY;
    private int speed = 100;
    private EventMenuCallBack callBack;
    private EventMenu event;

    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu.setOpaque(false);
        AutoCompleteDecorator.decorate(jComboBox1);
        listMenu.addEventSelectedMenu(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, EventMenuCallBack callBack) {
                if (index != selectedIndex) {
                    Menu.this.callBack = callBack;
                    toUp = selectedIndex > index;
                    if (selectedIndex == -1) {
                        speed = 20;
                    } else {
                        speed = selectedIndex - index;
                        if (speed < 0) {
                            speed *= -1;
                            //  If speed valus <0 change it to <0   Ex : -1 to 1
                        }
                    }
                    speed++;    //  Add 1 speed
                    selectedIndex = index;
                    menuYTarget = selectedIndex * 35+ listMenu.getY(); //  menuYTarget is location y
                    if (!timer.isRunning()) {
                        timer.start();
                    }
                }
            }
        });
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (toUp) {
                    if (menuY <= menuYTarget - 5) {
                        menuY = menuYTarget;
                        repaint();
                        timer.stop();
                        callBack.call(selectedIndex);
                        if (event != null) {
                            event.menuIndexChange(selectedIndex);
                        }
                    } else {
                        menuY -= speed;
                        repaint();
                    }
                } else {
                    if (menuY >= menuYTarget + 5) { //  Add style
                        menuY = menuYTarget;
                        repaint();
                        timer.stop();
                        callBack.call(selectedIndex);
                        if (event != null) {
                            event.menuIndexChange(selectedIndex);
                        }
                    } else {
                        menuY += speed;
                        repaint();
                    }
                }
            }
        });
        initData();
    }

    private void initData() {
        listMenu.addItem(new Model_Menu("1", "Dashboard", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("2", "Vouchers & Offers", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("3", "Favourits", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("4", "Order and Reordering", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("5", "Date Table", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("6", "Rewards", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("7", "Address", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("8", "View Profile", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("9", "Setting", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("10", "Help Center", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu = new coms.farhan.swing.ListMenu<>();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        panelMoving.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("      BhojonRoshik");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "KFC", "STARBUCKS", "MADCHEF", "BFC", "PIZZA HUT", "PINEWOOD", "WOODHOUSE", "MADCHEF", "KHANAS", "KACHHI BHAI", "BURGER KING", "BURGER QUEEN", "BUN FATTY", "KOREAN GRILL", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("RESTAURANTS");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(172, 172, 172)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         System.exit(0); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            /*restaurent DFrame=new  restaurent();
            DFrame.setVisible(true);
            DFrame.pack();
            DFrame.setLocationRelativeTo(null);*/
            try {
            Connection mySqlConn= DBConnection.getConnection();
            String mysqlquery="SELECT * FROM rname where RNAME=?";
          
            
            PreparedStatement preparedStatement=mySqlConn.prepareStatement(mysqlquery);
            if(!jComboBox1.getSelectedItem().toString().isEmpty()){
                preparedStatement.setString(1,jComboBox1.getSelectedItem().toString());
                //preparedStatement.setString(2,sname.getText());
                //preparedStatement.setString(3,sname.getText());
                //preparedStatement.setString(4,sname.getText());
                ResultSet rs=preparedStatement.executeQuery();
                while(rs.next()){
                    //restaurent DFrame=new  restaurent();
                    DFrame.rspic.setIcon(ViewResizeImage(null,rs.getBytes("RIMAGE")));
                    DFrame.setVisible(true);
                    DFrame.pack();
                    DFrame.setLocationRelativeTo(null);
                    //profilepic1.setIcon(ViewResizeImage(null,rs.getBytes("IMAGE")));
                   
                    
                }
                
                
            }
            else{
                JOptionPane.showMessageDialog(this,"Please fill up all the fields");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
            
    }//GEN-LAST:event_jButton2ActionPerformed

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#ffe259"), 0, getHeight(), Color.decode("#ffa751"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        if (selectedIndex >= 0) {
            int menuX = 10;
            int height = 35;
            int width = getWidth();
            g2.setColor(new Color(242, 242, 242));
            g2.fillRoundRect(menuX, menuY, width, height, 35, 40);
            Path2D.Float f = new Path2D.Float();
            f.moveTo(width - 30, menuY);
            f.curveTo(width - 10, menuY, width, menuY, width, menuY - 30);
            f.lineTo(width, menuY + height + 30);
            f.curveTo(width, menuY + height, width - 10, menuY + height, width - 30, menuY + height);

            g2.fill(f);
        }
        super.paintComponent(grphcs);
    }

    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX() + 6;
                y = me.getY() + 6;
            }

        });
        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }
    private ImageIcon ViewResizeImage(String imgpath,byte[] imgbytes){
    int imagex=220;
    int imagey=227;
    ImageIcon myImage =null;
    DFrame.rspic.setSize(imagex, imagey);
    if(imgpath!=null){
        myImage=new ImageIcon(imgpath);
    }
    else{
        myImage=new ImageIcon(imgbytes);
    }
    
    Image img =myImage.getImage();
    Image newImage=img.getScaledInstance(DFrame.rspic.getWidth(), DFrame.rspic.getHeight(),Image.SCALE_SMOOTH);
    ImageIcon image =new ImageIcon(newImage);
    
    return image;


}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private coms.farhan.swing.ListMenu<String> listMenu;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
