package coms.farhan.form;

import coms.farhan.component.Card;
import coms.farhan.model.Model_Card;
import coms.farhan.swing.ScrollBar;
import coms.farhan.swing.WrapLayout;
import javax.swing.ImageIcon;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
        init();
    }

    private void init() {
        panel.setLayout(new WrapLayout(WrapLayout.LEADING));
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/rustic.png")), "Rustic Eatery", "Where every flavour tells a story")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/kfc.png")), "KFC", "Its Finger Lickin Good")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/woodhousegrill.png")), "Woodhousegrill", "Your Culnary Adventure awaits")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/cheeze.png")), "Cheeze", "Stretching the limits of flavor")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/pizzahut.png")), "Pizzahut", "Makin' it great")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/takeout.jpg")), "Takeout", "Burger,Shakes and Fries")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/burgerres2.png")), "Burger Slogan", "Grilled to perfection")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/bfc.png")), "BFC", "We are always Here to serve you")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/starbucks.png")), "STARBUCKS", "Good things happen when we get together")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/yumcha.jpg")), "YUMCHA DISTRICT", "Wherr every bite is an adventure")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/chillox.jpg")), "CHILLOX", "Patties for our Passion")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/madchef2.png")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/mrwaffle.png")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/khanas.png")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/nothend2.jpg")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/kachi vai.png")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/masterchef.png")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/sultans dine.png")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/nothend2.jpg")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/bfc.png")), "BFC", "We are always Here to serve you")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/rustic.png")), "Rustic Eatery", "Where every flavour tells a story")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/kfc.png")), "KFC", "Its Finger Lickin Good")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/woodhousegrill.png")), "Woodhousegrill", "Your Culnary Adventure awaits")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/cheeze.png")), "Cheeze", "Stretching the limits of flavor")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/pizzahut.png")), "Pizzahut", "Makin' it great")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/takeout.jpg")), "Takeout", "Burger,Shakes and Fries")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/burgerres2.png")), "Burger Slogan", "Grilled to perfection")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/bfc.png")), "BFC", "We are always Here to serve you")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/starbucks.png")), "STARBUCKS", "Good things happen when we get together")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/yumcha.jpg")), "YUMCHA DISTRICT", "Wherr every bite is an adventure")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/chillox.jpg")), "CHILLOX", "Patties for our Passion")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/madchef2.png")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/mrwaffle.png")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/khanas.png")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/nothend2.jpg")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/kachi vai.png")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/masterchef.png")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/sultans dine.png")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/nothend2.jpg")), "MAD CHEF", "A taste you will remember")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/coms/raven/icon/testing/bfc.png")), "BFC", "We are always Here to serve you")));
                 


        panel.revalidate();
        panel.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1300, 700));

        jScrollPane1.setBorder(null);

        panel.setBackground(new java.awt.Color(255, 255, 204));
        panel.setForeground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(1400, 800));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
