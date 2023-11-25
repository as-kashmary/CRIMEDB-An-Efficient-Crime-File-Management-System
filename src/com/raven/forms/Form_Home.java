package com.raven.forms;

import com.raven.chart.ModelChart;
import com.karim.model.Model_Card;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
        testData();
    }

    private void testData() {
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/income.png")), "Income", "20,300 taka"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/other_income.png")), "Profit", "15,000 taka"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/expense.png")), "Expense", "1,800  taka"));
        chart.addLegend("Income", new Color(0, 0, 255));
        chart.addLegend("Expense", new Color(204, 0, 0));
        chart.addLegend("Profit", new Color(0, 153, 51));
        chart.addData(new ModelChart("January", new double[]{500, 200, 80}));
        chart.addData(new ModelChart("February", new double[]{600, 750, 90}));
        chart.addData(new ModelChart("March", new double[]{200, 350, 460}));
        chart.addData(new ModelChart("April", new double[]{480, 150, 750}));
        chart.addData(new ModelChart("May", new double[]{350, 540, 300}));
        chart.addData(new ModelChart("June", new double[]{190, 280, 81}));
        chart.addData(new ModelChart("July", new double[]{500, 200, 100}));
        chart.addData(new ModelChart("August", new double[]{170, 280, 85}));
        chart.addData(new ModelChart("September", new double[]{190, 280, 81}));
        chart.addData(new ModelChart("October", new double[]{700, 289, 819}));
        chart.addData(new ModelChart("November", new double[]{290, 380, 81}));
        chart.addData(new ModelChart("December", new double[]{1200, 200, 801}));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        card1 = new com.raven.components.Card1();
        card2 = new com.raven.components.Card1();
        card3 = new com.raven.components.Card1();
        panelShadow1 = new com.karim.swing.PanelShadow();
        jLabel2 = new javax.swing.JLabel();
        chart = new com.raven.chart.Chart();

        setBackground(new java.awt.Color(242, 246, 253));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Analysis");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("Chart Report-2023");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        chart.setOpaque(false);

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addContainerGap())
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.components.Card1 card1;
    private com.raven.components.Card1 card2;
    private com.raven.components.Card1 card3;
    private com.raven.chart.Chart chart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.karim.swing.PanelShadow panelShadow1;
    // End of variables declaration//GEN-END:variables
}
