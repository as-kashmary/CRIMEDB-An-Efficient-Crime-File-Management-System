package com.raven.components;

import com.raven.events.EventMenu;
import com.raven.events.EventMenuCallBack;
import com.raven.events.EventMenuSelected;
import com.karim.model.Model_Menu;
import com.raven.shadow.ShadowBorder;
import com.karim.swing.PanelShadow;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javaapplication8.login;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Menu extends PanelShadow {

    private int selectedIndex = -1;
    private double menuTarget;
    private double menuLastTarget;
    private double currentLocation;
    private BufferedImage selectedImage;
    private Animator animator;
    private EventMenuCallBack callBack;
    private EventMenu event;

    public Menu() {
        initComponents();
        init();
    }

    private void init() {
        setRadius(20);
        initData();
        listMenu.addEventSelectedMenu(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, EventMenuCallBack callBack) {
                if (!animator.isRunning()) {
                    if (index != selectedIndex) {
                        Menu.this.callBack = callBack;
                        selectedIndex = index;
                        menuTarget = selectedIndex * 50 + listMenu.getY();
                        animator.start();
                    }
                }
            }
        });
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                currentLocation = (menuTarget - menuLastTarget) * fraction;
                currentLocation += menuLastTarget;
                repaint();
            }

            @Override
            public void end() {
                menuLastTarget = menuTarget;
                callBack.call(selectedIndex);
                if (event != null) {
                    event.menuIndexChange(selectedIndex);
                }
            }
        };
        animator = new Animator(300, target);
        animator.setResolution(1);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
    }

    public void setSelectedIndex(int index) {
        selectedIndex = index;
        menuTarget = selectedIndex * 50 + listMenu.getY();
        menuLastTarget = menuTarget;
        currentLocation = menuLastTarget;
        listMenu.selectedIndex(index);
        repaint();
    }

    private void initData() {
        listMenu.addItem(new Model_Menu("1", "Business Analysis", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("2", "Restaurents Information", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("3", "Employee Information", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("4", "Sponsers Information", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("5", "Orders & Services", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("6", "Customers Information", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("7", "Customers review", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("8", "Extra", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("9", "Settings", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("10", "Profile", Model_Menu.MenuType.MENU));
        //listMenu.addItem(new Model_Menu("7", "Customers review", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
    }

    private void createImage() {
        int width = getWidth() - 30;
        selectedImage = ShadowBorder.getInstance().createShadowOut(width, 50, 8, 8, new Color(242, 246, 253));
    }

    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        super.setBounds(i, i1, i2, i3);
        createImage();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        if (selectedIndex >= 0) {
            grphcs.drawImage(selectedImage, 15, (int) currentLocation, null);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profile1 = new com.raven.components.Profile();
        listMenu = new com.karim.swing.ListMenu<>();
        jButton1 = new javax.swing.JButton();

        listMenu.setOpaque(false);

        jButton1.setBackground(new java.awt.Color(204, 153, 0));
        jButton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profile1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
            .addComponent(listMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            login Frame=new login();
            Frame.setVisible(true);
            Frame.pack();
            Frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void addEvent(EventMenu event) {
        this.event = event;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.karim.swing.ListMenu<String> listMenu;
    private com.raven.components.Profile profile1;
    // End of variables declaration//GEN-END:variables
}
