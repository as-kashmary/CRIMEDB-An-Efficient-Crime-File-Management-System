package coms.farhan.component;

import com.anim.main1.Main;
import coms.farhan.model.Model_Card;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javaapplication8.Terms;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import pizza.Home;

public class Card extends javax.swing.JPanel {

    private final Model_Card data;
    private final Timer timer;
    private final Timer timerStop;
    private final CardDescription cardDescription;
    private int y = 140;
    private int speed = 2;
    private boolean showing = false;

    public Card(Model_Card data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        cardDescription = new CardDescription(data.getTitle(), data.getDescription());
        cardDescription.setLocation(0, y);
        setPreferredSize(new Dimension(130, 200));
        cardDescription.setSize(new Dimension(150, 150));
        add(cardDescription);
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (showing) {
                    y -= speed;
                    if (y <= 50) {
                        y = 50;
                        cardDescription.setLocation(0, y);
                        timer.stop();
                    } else {
                        cardDescription.setLocation(0, y);
                    }
                } else {
                    y += speed;
                    if (y >= 140) {
                        y = 140;
                        cardDescription.setLocation(0, y);
                        timer.stop();
                    } else {
                        cardDescription.setLocation(0, y);
                    }
                }
            }
        });
        //  500 for delay hide description
        timerStop = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                showing = false;
                timerStop.stop();
                timer.start();
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                showing = true;
                timerStop.stop();
                timer.start();
            }

            @Override
            public void mouseExited(MouseEvent me) {
                timerStop.start();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        myButton1 = new button.MyButton();
        myButton2 = new button.MyButton();
        myButton3 = new button.MyButton();

        jLabel1.setText("jLabel1");

        myButton1.setText("myButton1");

        myButton2.setText("myButton2");

        setLayout(null);

        myButton3.setText("Enter");
        myButton3.setBorderColor(new java.awt.Color(255, 204, 0));
        myButton3.setColor(new java.awt.Color(255, 255, 204));
        myButton3.setColorClick(new java.awt.Color(255, 204, 51));
        myButton3.setColorOver(new java.awt.Color(255, 204, 102));
        myButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton3ActionPerformed(evt);
            }
        });
        add(myButton3);
        myButton3.setBounds(0, 0, 72, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void myButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton3ActionPerformed
        // TODO add your handling code here:
        Home TFrame=new Home();
        TFrame.setVisible(true);
        TFrame.pack();
        TFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_myButton3ActionPerformed

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        Rectangle size = getAutoSize(data.getIcon());
        g2.drawImage(toImage(data.getIcon()), size.x, size.y, size.width, size.height, null);
        super.paintComponent(grphcs);
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, getHeight(), new Color(245, 222, 179, 200), 0, getHeight() - 50, new Color(0, 0, 0, 0));
        g2.setPaint(g);
        g2.fillRect(0, 0, getWidth(), getHeight());
    }

    private Rectangle getAutoSize(Icon image) {
        int w = 150;
        int h = 200;
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        int x = (w - width) / 2;
        int y = (h - height) / 2;
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }

    private Image toImage(Icon icon) {
        return ((ImageIcon) icon).getImage();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private button.MyButton myButton1;
    private button.MyButton myButton2;
    private button.MyButton myButton3;
    // End of variables declaration//GEN-END:variables
}
