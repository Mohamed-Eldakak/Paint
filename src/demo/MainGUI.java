/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;

/**
 *
 * @author mazen
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    static Color ctemp;
    public MainGUI() {
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

        board = new demo.DrawingBoard();
        jPanel1 = new javax.swing.JPanel();
        setCLR = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        cpyBTN = new javax.swing.JButton();
        ovalBTN = new javax.swing.JButton();
        undoBTN = new javax.swing.JButton();
        resizeBTN = new javax.swing.JButton();
        fillShapeBTN = new javax.swing.JButton();
        redoBTN1 = new javax.swing.JButton();
        moveBTN = new javax.swing.JButton();
        circleBTN = new javax.swing.JButton();
        lineBTN = new javax.swing.JButton();
        sqrBTN = new javax.swing.JButton();
        triBTN = new javax.swing.JButton();
        recBTN = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drawing Board\n");
        setBackground(new java.awt.Color(0, 0, 0));

        board.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout boardLayout = new javax.swing.GroupLayout(board);
        board.setLayout(boardLayout);
        boardLayout.setHorizontalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        boardLayout.setVerticalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        setCLR.setText("Set Color");
        setCLR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setCLRActionPerformed(evt);
            }
        });

        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        cpyBTN.setText("Copy");
        cpyBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpyBTNActionPerformed(evt);
            }
        });

        ovalBTN.setText("Oval");
        ovalBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovalBTNActionPerformed(evt);
            }
        });

        undoBTN.setText("Undo");
        undoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoBTNActionPerformed(evt);
            }
        });

        resizeBTN.setText("Resize");
        resizeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeBTNActionPerformed(evt);
            }
        });

        fillShapeBTN.setText("Fill Shape");
        fillShapeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillShapeBTNActionPerformed(evt);
            }
        });

        redoBTN1.setText("Redo");
        redoBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoBTN1ActionPerformed(evt);
            }
        });

        moveBTN.setText("Move");
        moveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveBTNActionPerformed(evt);
            }
        });

        circleBTN.setText("Circle");
        circleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleBTNActionPerformed(evt);
            }
        });

        lineBTN.setText("Line");
        lineBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineBTNActionPerformed(evt);
            }
        });

        sqrBTN.setText("Square");
        sqrBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrBTNActionPerformed(evt);
            }
        });

        triBTN.setText("Triangle");
        triBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triBTNActionPerformed(evt);
            }
        });

        recBTN.setText("Rectangle");
        recBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Shapes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tools");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(resizeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(moveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cpyBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(undoBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fillShapeBTN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(redoBTN1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setCLR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lineBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ovalBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 2, Short.MAX_VALUE)
                                        .addComponent(triBTN)
                                        .addGap(22, 22, 22)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(sqrBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(4, 4, 4))
                                    .addComponent(circleBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(recBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(circleBTN)
                    .addComponent(ovalBTN))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recBTN)
                    .addComponent(lineBTN))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sqrBTN)
                    .addComponent(triBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resizeBTN)
                    .addComponent(moveBTN))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBTN)
                    .addComponent(fillShapeBTN))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(undoBTN)
                    .addComponent(redoBTN1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpyBTN)
                    .addComponent(setCLR))
                .addGap(156, 156, 156))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sqrBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrBTNActionPerformed
        board.button = 5;
    }//GEN-LAST:event_sqrBTNActionPerformed

    private void lineBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineBTNActionPerformed
        board.button = 1;
    }//GEN-LAST:event_lineBTNActionPerformed

    private void fillShapeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillShapeBTNActionPerformed
        board.button = 8;
        board.flag=-1;
        ctemp = board.currColor;
        JColorChooser selectColor = new JColorChooser();
        Color c = selectColor.showDialog(this, "Please Select Colour", Color.BLACK);
        board.currColor = c;
    }//GEN-LAST:event_fillShapeBTNActionPerformed

    private void circleBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleBTNActionPerformed
        board.button = 0;
    }//GEN-LAST:event_circleBTNActionPerformed

    private void ovalBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovalBTNActionPerformed
        board.button = 2;
    }//GEN-LAST:event_ovalBTNActionPerformed

    private void recBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recBTNActionPerformed
        board.button = 3;
    }//GEN-LAST:event_recBTNActionPerformed

    private void triBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triBTNActionPerformed
        board.button = 4;
    }//GEN-LAST:event_triBTNActionPerformed

    private void setCLRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setCLRActionPerformed
        // TODO add your handling code here:
        JColorChooser selectColor = new JColorChooser();
        Color c = selectColor.showDialog(this, "Please Select Colour", Color.BLACK);
        board.currColor = c;
    }//GEN-LAST:event_setCLRActionPerformed

    private void undoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoBTNActionPerformed
        try {
            board.undo();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_undoBTNActionPerformed

    private void redoBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoBTN1ActionPerformed
        try {
            board.redo();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_redoBTN1ActionPerformed

    private void moveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveBTNActionPerformed
        board.button = 9;
        board.flag=-1;
    }//GEN-LAST:event_moveBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        board.button = 10;
        board.flag=-1;
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void resizeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeBTNActionPerformed
        board.button = 11;
        board.flag=-1;
    }//GEN-LAST:event_resizeBTNActionPerformed

    private void cpyBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpyBTNActionPerformed
        board.button = 12;
        board.flag=-1;
    }//GEN-LAST:event_cpyBTNActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private demo.DrawingBoard board;
    private javax.swing.JButton circleBTN;
    private javax.swing.JButton cpyBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton fillShapeBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton lineBTN;
    private javax.swing.JButton moveBTN;
    private javax.swing.JButton ovalBTN;
    private javax.swing.JButton recBTN;
    private javax.swing.JButton redoBTN1;
    private javax.swing.JButton resizeBTN;
    private javax.swing.JButton setCLR;
    private javax.swing.JButton sqrBTN;
    private javax.swing.JButton triBTN;
    private javax.swing.JButton undoBTN;
    // End of variables declaration//GEN-END:variables
}
