/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkhosteldevs;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author rodri
 */
public class FormReserva extends javax.swing.JDialog {

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;

    /**
     * Creates new form FormReserva
     */
    public void flagCongreso(boolean flag) {
        jLabelJornadas.setVisible(flag);
        jSpinnerJornadas.setVisible(flag);
        jCheckBoxHabitaciones.setVisible(flag);
    }
    
    public void añadirTooltip() {
        Component[] componentes = this.getComponents();
        for (Component c : componentes) {
            System.err.println("Tipo :" + "Nombre :" + c.getName());
            
//            if (c.getClass().toString()=="class javax.swing.JLabel") {
//                label=(JLabel)c;
//                System.out.println("etiqueta guardada");
//            }
        }
    }
    
    public FormReserva(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        buttonGroup1.add(jRButtonNA);
        buttonGroup1.add(jRButtonBuffet);
        buttonGroup1.add(jRButtonCarta);
        buttonGroup1.add(jRButtonChef);
        flagCongreso(false);
        añadirTooltip();
        
        setLayout(new FlowLayout());

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
        
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelCocina = new javax.swing.JLabel();
        jCheckBoxHabitaciones = new javax.swing.JCheckBox();
        jRButtonChef = new javax.swing.JRadioButton();
        jRButtonCarta = new javax.swing.JRadioButton();
        jRButtonBuffet = new javax.swing.JRadioButton();
        jRButtonNA = new javax.swing.JRadioButton();
        jFormattedTextFieldTelefono = new javax.swing.JFormattedTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        spinFecha = new javax.swing.JSpinner();
        jLabelFecha = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabelPlazas = new javax.swing.JLabel();
        jSpinnerPlazas = new javax.swing.JSpinner();
        jLabelJornadas = new javax.swing.JLabel();
        jSpinnerJornadas = new javax.swing.JSpinner();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jLabelCocina.setText("Cocina");
        jLabelCocina.setName("jLabelCocina"); // NOI18N

        jCheckBoxHabitaciones.setText("Habitaciones");
        jCheckBoxHabitaciones.setName("jCheckBoxHabitaciones"); // NOI18N
        jCheckBoxHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxHabitacionesActionPerformed(evt);
            }
        });

        jRButtonChef.setText("Chef");
        jRButtonChef.setName("jRButtonChef"); // NOI18N

        jRButtonCarta.setText("Carta");
        jRButtonCarta.setName("jRButtonCarta"); // NOI18N
        jRButtonCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRButtonCartaActionPerformed(evt);
            }
        });

        jRButtonBuffet.setText("Buffet");
        jRButtonBuffet.setName("jRButtonBuffet"); // NOI18N
        jRButtonBuffet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRButtonBuffetActionPerformed(evt);
            }
        });

        jRButtonNA.setText("N/A");
        jRButtonNA.setName("jRButtonNA"); // NOI18N
        jRButtonNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRButtonNAActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefono.setMaximumSize(new java.awt.Dimension(9, 9));
        jFormattedTextFieldTelefono.setName("jFormattedTextFieldTelefono"); // NOI18N

        jLabelNombre.setText("Nombre");
        jLabelNombre.setMinimumSize(new java.awt.Dimension(40, 16));
        jLabelNombre.setName("jLabelNombre"); // NOI18N

        jLabelTelefono.setText("Teléfono");
        jLabelTelefono.setName("jLabelTelefono"); // NOI18N

        jTextFieldNombre.setColumns(15);
        jTextFieldNombre.setName("jTextFieldNombre"); // NOI18N

        spinFecha.setModel(new javax.swing.SpinnerDateModel());
        spinFecha.setName("spinFecha"); // NOI18N

        jLabelFecha.setText("Fecha reserva");
        jLabelFecha.setName("jLabelFecha"); // NOI18N

        jLabelTipo.setText("Tipo de evento");
        jLabelTipo.setName("jLabelTipo"); // NOI18N

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banquete", "Jornada", "Congreso" }));
        jComboBoxTipo.setName("jComboBoxTipo"); // NOI18N
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jLabelPlazas.setText("Plazas :");
        jLabelPlazas.setName("jLabelPlazas"); // NOI18N

        jSpinnerPlazas.setName("jSpinnerPlazas"); // NOI18N

        jLabelJornadas.setText("Jornadas:");
        jLabelJornadas.setName("jLabelJornadas"); // NOI18N

        jSpinnerJornadas.setName("jSpinnerJornadas"); // NOI18N

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cancelButton))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSpinnerJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCheckBoxHabitaciones))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelPlazas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jSpinnerPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jRButtonChef)
                                    .addGap(15, 15, 15)
                                    .addComponent(jRButtonBuffet))
                                .addComponent(jLabelCocina))
                            .addGap(107, 107, 107))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabelTipo)
                                    .addGap(12, 12, 12)
                                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelTelefono)
                                    .addGap(12, 12, 12)
                                    .addComponent(jFormattedTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(spinFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jRButtonCarta)
                                    .addGap(21, 21, 21)
                                    .addComponent(jRButtonNA)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, okButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabelTelefono))
                                .addComponent(jFormattedTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabelTipo)))
                            .addGap(3, 3, 3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                .addComponent(jLabelFecha))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spinFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelJornadas)
                        .addComponent(jSpinnerJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBoxHabitaciones))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPlazas)
                        .addComponent(jSpinnerPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelCocina)
                    .addGap(4, 4, 4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRButtonChef)
                        .addComponent(jRButtonBuffet))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRButtonCarta)
                                .addComponent(jRButtonNA))
                            .addGap(96, 96, 96))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(101, 101, 101)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cancelButton)
                                .addComponent(okButton))))
                    .addContainerGap()))
        );

        getRootPane().setDefaultButton(okButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        doClose(RET_OK);
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
        System.err.println();
        if (jComboBoxTipo.getSelectedItem().toString().equals("Congreso")) {
            System.err.println("entra");
            flagCongreso(true);
        } else {
            flagCongreso(false);
        }
        repaint();
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    private void jRButtonNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRButtonNAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRButtonNAActionPerformed

    private void jRButtonBuffetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRButtonBuffetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRButtonBuffetActionPerformed

    private void jRButtonCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRButtonCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRButtonCartaActionPerformed

    private void jCheckBoxHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHabitacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxHabitacionesActionPerformed
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

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
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormReserva dialog = new FormReserva(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox jCheckBoxHabitaciones;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefono;
    private javax.swing.JLabel jLabelCocina;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelJornadas;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPlazas;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRButtonBuffet;
    private javax.swing.JRadioButton jRButtonCarta;
    private javax.swing.JRadioButton jRButtonChef;
    private javax.swing.JRadioButton jRButtonNA;
    private javax.swing.JSpinner jSpinnerJornadas;
    private javax.swing.JSpinner jSpinnerPlazas;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JButton okButton;
    private javax.swing.JSpinner spinFecha;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
