
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavesh Jain
 */
public class first extends java.applet.Applet {

    /**
     * Initializes the applet first
     */
    public void init() {
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button2 = new java.awt.Button();
        button1 = new java.awt.Button();
        textField1 = new java.awt.TextField();
        button3 = new java.awt.Button();
        label1 = new java.awt.Label();

        setLayout(null);

        button2.setBackground(new java.awt.Color(102, 255, 102));
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        button2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button2.setForeground(new java.awt.Color(0, 0, 204));
        button2.setLabel("change bgcolor");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2);
        button2.setBounds(30, 70, 130, 40);

        button1.setBackground(new java.awt.Color(255, 255, 0));
        button1.setLabel("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1);
        button1.setBounds(30, 160, 130, 40);
        add(textField1);
        textField1.setBounds(240, 70, 230, 50);

        button3.setLabel("Submit");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        add(button3);
        button3.setBounds(247, 140, 240, 40);
        add(label1);
        label1.setBounds(238, 220, 250, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        this.setBackground(Color.GREEN);
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        button1.setBackground(button2.getForeground());
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        label1.setText(" WELCOME " + textField1.getText() + " HOW ARE YOU..? ");
    }//GEN-LAST:event_button3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Label label1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
