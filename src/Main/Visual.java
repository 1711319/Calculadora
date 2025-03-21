/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import javax.swing.JOptionPane;
import java.awt.Color;

/**
 *
 * @author myself
 */
public class Visual extends javax.swing.JFrame {

    /**
     * Creates new form Visual
     */
    public Visual() {
        setResizable(false);
        setLocationRelativeTo(null); // Centraliza na tela
        this.getContentPane().setBackground(new Color(128, 128, 128));
        initComponents();
    }
    // Inicialize o botão com o estado desligado
    private boolean ON = false;

    double num1, num2, resultado;
    String contas;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_NumeroCinco = new javax.swing.JButton();
        BTN_Dividir = new javax.swing.JButton();
        BTN_NumeroSeis = new javax.swing.JButton();
        BTN_Subtracao = new javax.swing.JButton();
        BTN_NumeroQuatro = new javax.swing.JButton();
        BTN_NumeroUm = new javax.swing.JButton();
        BTN_NumeroDois = new javax.swing.JButton();
        BTN_NumeroTres = new javax.swing.JButton();
        BTN_Multiplicar = new javax.swing.JButton();
        BTN_NumeroZero = new javax.swing.JButton();
        jTFCalc = new javax.swing.JTextField();
        BTN_Voltar = new javax.swing.JButton();
        BTN_CE = new javax.swing.JButton();
        BTN_Clear = new javax.swing.JButton();
        BTN_InverterSinal = new javax.swing.JButton();
        BTN_NumeroOito = new javax.swing.JButton();
        BTN_NumeroNove = new javax.swing.JButton();
        BTN_Mais = new javax.swing.JButton();
        BTN_Ponto = new javax.swing.JButton();
        BTN_NumeroSete = new javax.swing.JButton();
        BTN_Igual = new javax.swing.JButton();
        jTBTN_OnOFF = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(335, 505));
        setResizable(false);

        BTN_NumeroCinco.setBackground(new java.awt.Color(51, 51, 51));
        BTN_NumeroCinco.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_NumeroCinco.setText("5");
        BTN_NumeroCinco.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_NumeroCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NumeroCincoActionPerformed(evt);
            }
        });

        BTN_Dividir.setBackground(new java.awt.Color(51, 51, 51));
        BTN_Dividir.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_Dividir.setText("/");
        BTN_Dividir.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DividirActionPerformed(evt);
            }
        });

        BTN_NumeroSeis.setBackground(new java.awt.Color(51, 51, 51));
        BTN_NumeroSeis.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_NumeroSeis.setText("6");
        BTN_NumeroSeis.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_NumeroSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NumeroSeisActionPerformed(evt);
            }
        });

        BTN_Subtracao.setBackground(new java.awt.Color(51, 51, 51));
        BTN_Subtracao.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_Subtracao.setText("-");
        BTN_Subtracao.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_Subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SubtracaoActionPerformed(evt);
            }
        });

        BTN_NumeroQuatro.setBackground(new java.awt.Color(51, 51, 51));
        BTN_NumeroQuatro.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_NumeroQuatro.setText("4");
        BTN_NumeroQuatro.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_NumeroQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NumeroQuatroActionPerformed(evt);
            }
        });

        BTN_NumeroUm.setBackground(new java.awt.Color(51, 51, 51));
        BTN_NumeroUm.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_NumeroUm.setText("1");
        BTN_NumeroUm.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_NumeroUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NumeroUmActionPerformed(evt);
            }
        });

        BTN_NumeroDois.setBackground(new java.awt.Color(51, 51, 51));
        BTN_NumeroDois.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_NumeroDois.setText("2");
        BTN_NumeroDois.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_NumeroDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NumeroDoisActionPerformed(evt);
            }
        });

        BTN_NumeroTres.setBackground(new java.awt.Color(51, 51, 51));
        BTN_NumeroTres.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_NumeroTres.setText("3");
        BTN_NumeroTres.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_NumeroTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NumeroTresActionPerformed(evt);
            }
        });

        BTN_Multiplicar.setBackground(new java.awt.Color(51, 51, 51));
        BTN_Multiplicar.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_Multiplicar.setText("X");
        BTN_Multiplicar.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MultiplicarActionPerformed(evt);
            }
        });

        BTN_NumeroZero.setBackground(new java.awt.Color(51, 51, 51));
        BTN_NumeroZero.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_NumeroZero.setText("0");
        BTN_NumeroZero.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_NumeroZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NumeroZeroActionPerformed(evt);
            }
        });

        jTFCalc.setBackground(new java.awt.Color(255, 204, 51));
        jTFCalc.setFont(new java.awt.Font("Digital-7", 0, 48)); // NOI18N
        jTFCalc.setForeground(new java.awt.Color(0, 0, 0));
        jTFCalc.setToolTipText("");
        jTFCalc.setAlignmentX(20.0F);
        jTFCalc.setAlignmentY(10.0F);
        jTFCalc.setName(""); // NOI18N
        jTFCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCalcActionPerformed(evt);
            }
        });

        BTN_Voltar.setBackground(new java.awt.Color(51, 51, 51));
        BTN_Voltar.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_Voltar.setText("←");
        BTN_Voltar.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_VoltarActionPerformed(evt);
            }
        });

        BTN_CE.setBackground(new java.awt.Color(51, 51, 51));
        BTN_CE.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_CE.setText("CE");
        BTN_CE.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CEActionPerformed(evt);
            }
        });

        BTN_Clear.setBackground(new java.awt.Color(51, 51, 51));
        BTN_Clear.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_Clear.setText("C");
        BTN_Clear.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ClearActionPerformed(evt);
            }
        });

        BTN_InverterSinal.setBackground(new java.awt.Color(51, 51, 51));
        BTN_InverterSinal.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_InverterSinal.setText("±");
        BTN_InverterSinal.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_InverterSinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_InverterSinalActionPerformed(evt);
            }
        });

        BTN_NumeroOito.setBackground(new java.awt.Color(51, 51, 51));
        BTN_NumeroOito.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_NumeroOito.setText("8");
        BTN_NumeroOito.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_NumeroOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NumeroOitoActionPerformed(evt);
            }
        });

        BTN_NumeroNove.setBackground(new java.awt.Color(51, 51, 51));
        BTN_NumeroNove.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_NumeroNove.setText("9");
        BTN_NumeroNove.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_NumeroNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NumeroNoveActionPerformed(evt);
            }
        });

        BTN_Mais.setBackground(new java.awt.Color(51, 51, 51));
        BTN_Mais.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_Mais.setText("+");
        BTN_Mais.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_Mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MaisActionPerformed(evt);
            }
        });

        BTN_Ponto.setBackground(new java.awt.Color(51, 51, 51));
        BTN_Ponto.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_Ponto.setText(".");
        BTN_Ponto.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_Ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PontoActionPerformed(evt);
            }
        });

        BTN_NumeroSete.setBackground(new java.awt.Color(51, 51, 51));
        BTN_NumeroSete.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_NumeroSete.setText("7");
        BTN_NumeroSete.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_NumeroSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NumeroSeteActionPerformed(evt);
            }
        });

        BTN_Igual.setBackground(new java.awt.Color(51, 51, 51));
        BTN_Igual.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        BTN_Igual.setText("=");
        BTN_Igual.setPreferredSize(new java.awt.Dimension(65, 65));
        BTN_Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_IgualActionPerformed(evt);
            }
        });

        jTBTN_OnOFF.setBackground(new java.awt.Color(0, 0, 0));
        jTBTN_OnOFF.setFont(new java.awt.Font("EuroStyle", 0, 18)); // NOI18N
        jTBTN_OnOFF.setForeground(new java.awt.Color(204, 255, 204));
        jTBTN_OnOFF.setText("Ligar | Desligar");
        jTBTN_OnOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBTN_OnOFFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFCalc, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_InverterSinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_NumeroSete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_NumeroOito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_NumeroNove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Mais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_NumeroQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_NumeroCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_NumeroSeis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_NumeroUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_NumeroDois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_NumeroTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_NumeroZero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Ponto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Igual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTBTN_OnOFF)
                        .addGap(95, 95, 95))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_InverterSinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_NumeroSete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_NumeroOito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_NumeroNove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Mais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_NumeroQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_NumeroCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_NumeroSeis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_NumeroUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_NumeroDois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_NumeroTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_NumeroZero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Ponto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Igual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTBTN_OnOFF)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_VoltarActionPerformed
        // TODO add your handling code here:
        String numero = jTFCalc.getText(); // Obtém o texto atual
        if (!numero.isEmpty()) { // Verifica se há algo para apagar
            jTFCalc.setText(numero.substring(0, numero.length() - 1)); // Remove o último número
        }
    }//GEN-LAST:event_BTN_VoltarActionPerformed

    private void BTN_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CEActionPerformed
        // TODO add your handling code here:
        jTFCalc.setText(""); // Apenas limpa o campo de entrada, sem resetar os números armazenados
    }//GEN-LAST:event_BTN_CEActionPerformed

    private void BTN_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ClearActionPerformed
        // TODO add your handling code here:
// Limpa o campo de texto
        jTFCalc.setText("");

// Reseta o primeiro número
        num1 = 0;

// Reseta o segundo número
        num2 = 0;

// Reseta o resultado
        resultado = 0;

// Reseta o operador
        contas = "";
    }//GEN-LAST:event_BTN_ClearActionPerformed

    private void BTN_InverterSinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_InverterSinalActionPerformed
        // TODO add your handling code here:
        String texto = jTFCalc.getText(); // Obtém o valor atual

        if (!texto.isEmpty()) { // Verifica se há algo na tela
            double numero = Double.parseDouble(texto); // Converte para número
            numero = numero * -1; // Inverte o sinal
            jTFCalc.setText(String.valueOf(numero)); // Atualiza a tela com o novo valor
        }
    }//GEN-LAST:event_BTN_InverterSinalActionPerformed

    private void BTN_MaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MaisActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(jTFCalc.getText());
        contas = "+";
        jTFCalc.setText("");
    }//GEN-LAST:event_BTN_MaisActionPerformed

    private void BTN_IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_IgualActionPerformed
        // TODO add your handling code here:
// Obtém o segundo número da caixa de texto
        try {
// Obtém o segundo número da caixa de texto
            num2 = Double.parseDouble(jTFCalc.getText());

            // Variável para armazenar o resultado da operação
            double resultado;

// Verifica qual operação foi selecionada
            switch (contas) {
                case "+": // Se a operação for soma
                    resultado = num1 + num2; // Soma os dois números
                    break;

                case "-": // Se a operação for subtração
                    resultado = num1 - num2; // Subtrai o segundo número do primeiro
                    break;

                case "*": // Se a operação for multiplicação
                    resultado = num1 * num2; // Multiplica os dois números
                    break;

                case "/": // Se a operação for divisão
                    if (num2 != 0) { // Verifica se o divisor não é zero
                        resultado = num1 / num2; // Divide o primeiro número pelo segundo
                    } else {
                        // Se o divisor for zero, exibe uma mensagem de erro
                        jTFCalc.setText("ERRO");
                        return; // Sai do método para evitar continuar com a operação
                    }
                    break;

                default: // Caso não haja uma operação válida
                    jTFCalc.setText("ERRO");
                    return; // Sai do método
            }
            // Exibe o resultado na caixa de texto
            jTFCalc.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            jTFCalc.setText("ERRO");
        }
    }//GEN-LAST:event_BTN_IgualActionPerformed

    private void jTFCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCalcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCalcActionPerformed

    private void BTN_NumeroZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NumeroZeroActionPerformed
        // TODO add your handling code here:
        jTFCalc.setText(jTFCalc.getText() + "0");
    }//GEN-LAST:event_BTN_NumeroZeroActionPerformed

    private void BTN_NumeroUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NumeroUmActionPerformed
        // TODO add your handling code here:
        jTFCalc.setText(jTFCalc.getText() + "1");
    }//GEN-LAST:event_BTN_NumeroUmActionPerformed

    private void BTN_NumeroDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NumeroDoisActionPerformed
        // TODO add your handling code here:
        jTFCalc.setText(jTFCalc.getText() + "2");
    }//GEN-LAST:event_BTN_NumeroDoisActionPerformed

    private void BTN_NumeroTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NumeroTresActionPerformed
        // TODO add your handling code here:
        jTFCalc.setText(jTFCalc.getText() + "3");
    }//GEN-LAST:event_BTN_NumeroTresActionPerformed

    private void BTN_NumeroQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NumeroQuatroActionPerformed
        // TODO add your handling code here:
        jTFCalc.setText(jTFCalc.getText() + "4");
    }//GEN-LAST:event_BTN_NumeroQuatroActionPerformed

    private void BTN_NumeroCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NumeroCincoActionPerformed
        // TODO add your handling code here:
        jTFCalc.setText(jTFCalc.getText() + "5");
    }//GEN-LAST:event_BTN_NumeroCincoActionPerformed

    private void BTN_NumeroSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NumeroSeisActionPerformed
        // TODO add your handling code here:
        jTFCalc.setText(jTFCalc.getText() + "6");
    }//GEN-LAST:event_BTN_NumeroSeisActionPerformed

    private void BTN_NumeroSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NumeroSeteActionPerformed
        // TODO add your handling code here:
        jTFCalc.setText(jTFCalc.getText() + "7");
    }//GEN-LAST:event_BTN_NumeroSeteActionPerformed

    private void BTN_NumeroOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NumeroOitoActionPerformed
        // TODO add your handling code here:
        jTFCalc.setText(jTFCalc.getText() + "8");
    }//GEN-LAST:event_BTN_NumeroOitoActionPerformed

    private void BTN_NumeroNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NumeroNoveActionPerformed
        // TODO add your handling code here:
        jTFCalc.setText(jTFCalc.getText() + "9");
    }//GEN-LAST:event_BTN_NumeroNoveActionPerformed

    private void BTN_SubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SubtracaoActionPerformed
        // TODO add your handling code here:
// Armazena o primeiro número a partir da caixa de texto
        num1 = Double.parseDouble(jTFCalc.getText());

// Configura o operador para subtrair
        contas = "-";

// Limpa o campo de texto para a próxima entrada
        jTFCalc.setText("");
    }//GEN-LAST:event_BTN_SubtracaoActionPerformed

    private void BTN_MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MultiplicarActionPerformed
        // TODO add your handling code here:
// Armazena o primeiro número a partir da caixa de texto
        num1 = Double.parseDouble(jTFCalc.getText());

// Configura o operador para multiplicar
        contas = "*";

// Limpa o campo de texto para a próxima entrada
        jTFCalc.setText("");
    }//GEN-LAST:event_BTN_MultiplicarActionPerformed

    private void BTN_DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DividirActionPerformed
        // TODO add your handling code here:
// Armazena o primeiro número a partir da caixa de texto
        num1 = Double.parseDouble(jTFCalc.getText());

// Configura o operador para divisão
        contas = "/";

// Limpa o campo de texto para a próxima entrada
        jTFCalc.setText("");
    }//GEN-LAST:event_BTN_DividirActionPerformed

    private void BTN_PontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PontoActionPerformed
        // TODO add your handling code here:
// Verificar se existe
        if (!jTFCalc.getText().contains(".")) {
            jTFCalc.setText(jTFCalc.getText() + ".");
        }
    }//GEN-LAST:event_BTN_PontoActionPerformed

    private void jTBTN_OnOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBTN_OnOFFActionPerformed
        // TODO add your handling code here:
        if (jTBTN_OnOFF.isSelected()) {
// Desliga a calculadora
// Desativa todos botões
            BTN_Mais.setEnabled(false);
            BTN_Subtracao.setEnabled(false);
            BTN_Multiplicar.setEnabled(false);
            BTN_Dividir.setEnabled(false);
            BTN_Igual.setEnabled(false);
            BTN_InverterSinal.setEnabled(false);
            BTN_NumeroUm.setEnabled(false);
            BTN_NumeroDois.setEnabled(false);
            BTN_NumeroTres.setEnabled(false);
            BTN_NumeroQuatro.setEnabled(false);
            BTN_NumeroCinco.setEnabled(false);
            BTN_NumeroSeis.setEnabled(false);
            BTN_NumeroSete.setEnabled(false);
            BTN_NumeroOito.setEnabled(false);
            BTN_NumeroNove.setEnabled(false);
            BTN_NumeroZero.setEnabled(false);
            BTN_Ponto.setEnabled(false);
            BTN_CE.setEnabled(false);
            BTN_Clear.setEnabled(false);
            BTN_Voltar.setEnabled(false);
// Exibe mensagem de que a calculadora está desligada
            jTFCalc.setText("");
            JOptionPane.showMessageDialog(this, "Calculadora Desligada");
        } else {
// Liga a calculadora
// Ativa todos os botões 
                BTN_Mais.setEnabled(true);
                BTN_Subtracao.setEnabled(true);
                BTN_Multiplicar.setEnabled(true);
                BTN_Dividir.setEnabled(true);
                BTN_Igual.setEnabled(true);
                BTN_InverterSinal.setEnabled(true);
                BTN_NumeroUm.setEnabled(true);
                BTN_NumeroDois.setEnabled(true);
                BTN_NumeroTres.setEnabled(true);
                BTN_NumeroQuatro.setEnabled(true);
                BTN_NumeroCinco.setEnabled(true);
                BTN_NumeroSeis.setEnabled(true);
                BTN_NumeroSete.setEnabled(true);
                BTN_NumeroOito.setEnabled(true);
                BTN_NumeroNove.setEnabled(true);
                BTN_NumeroZero.setEnabled(true);
                BTN_Ponto.setEnabled(true);
                BTN_CE.setEnabled(true);
                BTN_Clear.setEnabled(true);
                BTN_Voltar.setEnabled(true);
// exibe mensagem de que a calculadora está ligada
                JOptionPane.showMessageDialog(this, "Calculadora Ligada");
        }
    }//GEN-LAST:event_jTBTN_OnOFFActionPerformed

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
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_CE;
    private javax.swing.JButton BTN_Clear;
    private javax.swing.JButton BTN_Dividir;
    private javax.swing.JButton BTN_Igual;
    private javax.swing.JButton BTN_InverterSinal;
    private javax.swing.JButton BTN_Mais;
    private javax.swing.JButton BTN_Multiplicar;
    private javax.swing.JButton BTN_NumeroCinco;
    private javax.swing.JButton BTN_NumeroDois;
    private javax.swing.JButton BTN_NumeroNove;
    private javax.swing.JButton BTN_NumeroOito;
    private javax.swing.JButton BTN_NumeroQuatro;
    private javax.swing.JButton BTN_NumeroSeis;
    private javax.swing.JButton BTN_NumeroSete;
    private javax.swing.JButton BTN_NumeroTres;
    private javax.swing.JButton BTN_NumeroUm;
    private javax.swing.JButton BTN_NumeroZero;
    private javax.swing.JButton BTN_Ponto;
    private javax.swing.JButton BTN_Subtracao;
    private javax.swing.JButton BTN_Voltar;
    private javax.swing.JToggleButton jTBTN_OnOFF;
    private javax.swing.JTextField jTFCalc;
    // End of variables declaration//GEN-END:variables
}