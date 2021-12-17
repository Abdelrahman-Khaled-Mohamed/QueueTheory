/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication85;

/**
 *
 * @author Abdelrahman Khaled
 */
public class M_M_cInputScreen extends javax.swing.JFrame {

    /**
     * Creates new form M_M_1InputScreen
     */
    public M_M_cInputScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        cLabel = new javax.swing.JLabel();
        cInput = new javax.swing.JTextField();
        arrivalRateLabel = new javax.swing.JLabel();
        arrivalRateInput = new javax.swing.JTextField();
        serviceRateLabel = new javax.swing.JLabel();
        serviceRateInput = new javax.swing.JTextField();
        enter = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        title.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        title.setForeground(new java.awt.Color(50, 50, 50));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("M / M / c / ∞ / FCFS");

        cLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        cLabel.setForeground(new java.awt.Color(130, 0, 0));
        cLabel.setText("c");

        cInput.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        cInput.setForeground(new java.awt.Color(50, 50, 50));
        cInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cInputActionPerformed(evt);
            }
        });

        arrivalRateLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        arrivalRateLabel.setForeground(new java.awt.Color(130, 0, 0));
        arrivalRateLabel.setText("Arrival Rate");

        arrivalRateInput.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        arrivalRateInput.setForeground(new java.awt.Color(50, 50, 50));

        serviceRateLabel.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        serviceRateLabel.setForeground(new java.awt.Color(130, 0, 0));
        serviceRateLabel.setText("Service Rate");

        serviceRateInput.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        serviceRateInput.setForeground(new java.awt.Color(50, 50, 50));
        serviceRateInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceRateInputActionPerformed(evt);
            }
        });

        enter.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        enter.setForeground(new java.awt.Color(0, 0, 130));
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Gabriola", 1, 26)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 0, 130));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(serviceRateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arrivalRateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cInput, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arrivalRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serviceRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cInput, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrivalRateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serviceRateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serviceRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cInputActionPerformed

    private void serviceRateInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceRateInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceRateInputActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        boolean[] flag = new boolean[3];
        int c = 0;
        double arrivalRate = 0, serviceRate = 0;
        try
        {
            String input = cInput.getText().replaceAll(" ", "");
            c = Integer.parseInt(input);
            flag[0] = true;
        } catch(Exception e) {
            cInput.setText("error");
        }
        try
        {
            String input = arrivalRateInput.getText().replaceAll(" ", "");
            if(input.split("/").length <= 2)
            {
                if(input.split("/").length == 1)
                {
                    arrivalRate = Double.parseDouble(input);
                    flag[1] = true;
                }
                else
                {
                    double p1, p2;
                    p1 = Double.parseDouble(input.split("/")[0]);
                    p2 = Double.parseDouble(input.split("/")[1]);
                    if(p2 == 0)
                        arrivalRateInput.setText("error");
                    else
                    {
                        arrivalRate = p1 / p2;
                        flag[1] = true;
                    }
                }
            }
            else
                arrivalRateInput.setText("error");
        } catch(Exception e) {
            arrivalRateInput.setText("error");
        }
        try
        {
            String input = serviceRateInput.getText().replaceAll(" ", "");
            if(input.split("/").length <= 2)
            {
                if(input.split("/").length == 1)
                {
                    serviceRate = Double.parseDouble(input);
                    flag[2] = true;
                }
                else
                {
                    double p1, p2;
                    p1 = Double.parseDouble(input.split("/")[0]);
                    p2 = Double.parseDouble(input.split("/")[1]);
                    if(p2 == 0)
                        serviceRateInput.setText("error");
                    else
                    {
                        serviceRate = p1 / p2;
                        flag[2] = true;
                    }
                }
            }
            else
                serviceRateInput.setText("error");
        } catch(Exception e) {
            serviceRateInput.setText("error");
        }
        if(flag[0] && flag[1] && flag[2])
        {
            M_M_cOutputScreen screen = new M_M_cOutputScreen(new M_M_c(arrivalRate, serviceRate, c));
            screen.setLocationRelativeTo(null);
            screen.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_enterActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        StochasticInputScreen screen = new StochasticInputScreen();
        screen.setLocationRelativeTo(null);
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(M_M_cInputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(M_M_cInputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(M_M_cInputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(M_M_cInputScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new M_M_cInputScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField arrivalRateInput;
    private javax.swing.JLabel arrivalRateLabel;
    private javax.swing.JTextField cInput;
    private javax.swing.JLabel cLabel;
    private javax.swing.JButton enter;
    private javax.swing.JTextField serviceRateInput;
    private javax.swing.JLabel serviceRateLabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
