/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.login.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Jennifer
 */
public class CalculadoraImcView extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraImcView
     */
    public CalculadoraImcView() {
        initComponents();
    }

    float peso, altura, imc;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sairButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        resultadoLabel = new javax.swing.JLabel();
        calcularButton = new javax.swing.JButton();
        pesoLabel = new javax.swing.JLabel();
        alturaLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apagarButton = new javax.swing.JButton();
        pesoText1 = new javax.swing.JTextField();
        alturaText = new javax.swing.JTextField();
        resultadoLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sairButton.setForeground(new java.awt.Color(0, 0, 0));
        sairButton.setText("SAIR");
        sairButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sairButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 80, -1));

        voltarButton.setForeground(new java.awt.Color(0, 0, 0));
        voltarButton.setText("VOLTAR");
        voltarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 90, -1));

        resultadoLabel.setForeground(new java.awt.Color(255, 255, 255));
        resultadoLabel.setText("RESULTADO:");
        getContentPane().add(resultadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 70, 20));

        calcularButton.setForeground(new java.awt.Color(0, 0, 0));
        calcularButton.setText("CALCULAR IMC");
        calcularButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularButtonActionPerformed(evt);
            }
        });
        getContentPane().add(calcularButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 140, -1));

        pesoLabel.setForeground(new java.awt.Color(255, 255, 255));
        pesoLabel.setText(" PESO:");
        getContentPane().add(pesoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        alturaLabel.setForeground(new java.awt.Color(255, 255, 255));
        alturaLabel.setText("ALTURA:");
        getContentPane().add(alturaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("M");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 20, -1));

        apagarButton.setForeground(new java.awt.Color(0, 0, 0));
        apagarButton.setText("APAGAR");
        apagarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(apagarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 100, -1));

        pesoText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoText1ActionPerformed(evt);
            }
        });
        getContentPane().add(pesoText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 180, 30));

        alturaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaTextActionPerformed(evt);
            }
        });
        getContentPane().add(alturaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 180, 30));
        getContentPane().add(resultadoLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 180, 30));

        jLabel3.setFont(new java.awt.Font("Serif", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Calculadora de IMC");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 310, 50));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Imagem do WhatsApp de 2023-06-17 à(s) 15.07.06.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 357, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calcularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularButtonActionPerformed
        // TODO add your handling code here:
       if(pesoText1.getText().matches("") || alturaText.getText().matches("")){
           JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
            
    } else {  
        peso = Float.parseFloat(pesoText1.getText());
        altura = Float.parseFloat(alturaText.getText());
        
        imc = peso /(altura * altura);
        
        resultadoLabel4.setText(String.valueOf(imc));
        
        if (imc < 16.9){
         JOptionPane.showMessageDialog(null, "Muito abaixo do peso");   
        }
        if (imc >=17.0 &&  imc <= 18.4){
         JOptionPane.showMessageDialog(null, "Abaixo do peso");   
        }
        if (imc >=18.5 &&  imc <= 24.9){
         JOptionPane.showMessageDialog(null, "Peso normal");   
        }
        if (imc >=25.0 &&  imc <= 29.9){
         JOptionPane.showMessageDialog(null, "Acima do peso");   
        }
        if (imc >=30.0 &&  imc <= 34.9){
         JOptionPane.showMessageDialog(null, "Obesidade grau 1");   
        }
        if (imc >=35.0 &&  imc < 40.0){
         JOptionPane.showMessageDialog(null, "Obesidade grau 2");   
        }
        if (imc >= 40.0){
         JOptionPane.showMessageDialog(null, "Obesidade grau 3");   
        }
       }
           
    }//GEN-LAST:event_calcularButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        // TODO add your handling code here:
     TelaInicialView TelaInicial = new TelaInicialView();
        TelaInicial.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        TelaFinalView TelaFinal = new TelaFinalView();
       TelaFinal.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_sairButtonActionPerformed

    private void apagarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarButtonActionPerformed
        // TODO add your handling code here:
        pesoText1.setText("");
        alturaText.setText("");
        resultadoLabel4.setText("");
    }//GEN-LAST:event_apagarButtonActionPerformed

    private void alturaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaTextActionPerformed

    private void pesoText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoText1ActionPerformed
   
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
            java.util.logging.Logger.getLogger(CalculadoraImcView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraImcView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraImcView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraImcView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraImcView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alturaLabel;
    private javax.swing.JTextField alturaText;
    private javax.swing.JButton apagarButton;
    private javax.swing.JButton calcularButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel pesoLabel;
    private javax.swing.JTextField pesoText1;
    private javax.swing.JLabel resultadoLabel;
    private javax.swing.JLabel resultadoLabel4;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
