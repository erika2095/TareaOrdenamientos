
package Ventana_Menu;

import Controlador.Controlador_Ordenamiento;
import Metodos.Burbuja;
import javax.swing.JOptionPane;

/**
 *
 * @author 3rika
 */
public class MenuOrdenamientos extends javax.swing.JFrame {

    Controlador_Ordenamiento controlador;
    
    int valores;
    int vector[];
    
    public MenuOrdenamientos() {
        initComponents();
        controlador = new Controlador_Ordenamiento(this);
    }
    
    public void introducirValores()
    {
        for(int i = 0; i < 10; i++)
        {
            valores = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero"));
            vector[i] = valores;
        }
        System.out.println(valores);
//        Burbuja.ordBurbuja(vector);
//        Burbuja.imprimir(vector);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public void escucharComboBox()
//    {
//        this.btn_Burbuja.addActionListener(controlador);
//        this.btn_Intercambio.addActionListener(controlador);
//        this.btn_QuickSort.addActionListener(controlador);
//        this.btn_Seleccion.addActionListener(controlador);
//        this.btn_Shell.addActionListener(controlador);
//    }
//        
//    public void limpiarJtEntradas()
//    {
//        this.jt_Ingresar1.setText(" ");
//        this.jt_Ingresar2.setText(" ");
//        this.jt_Ingresar3.setText(" ");
//        this.jt_Ingresar4.setText(" ");
//        this.jt_Ingresar5.setText(" ");
//        this.jt_Ingresar6.setText(" ");
//        this.jt_Ingresar7.setText(" ");
//        this.jt_Ingresar8.setText(" ");
//        this.jt_Ingresar9.setText(" ");
//        this.jt_Ingresar10.setText(" ");
//    }
//    
//    public long[] labelIngresados()
//    {
//        valores[0] = Integer.parseInt(this.jt_Ingresar1.getText());
//        valores[1] = Integer.parseInt(this.jt_Ingresar2.getText());
//        valores[2] = Integer.parseInt(this.jt_Ingresar3.getText());
//        valores[3] = Integer.parseInt(this.jt_Ingresar4.getText());
//        valores[4] = Integer.parseInt(this.jt_Ingresar5.getText());
//        valores[5] = Integer.parseInt(this.jt_Ingresar6.getText());
//        valores[6] = Integer.parseInt(this.jt_Ingresar7.getText());
//        valores[7] = Integer.parseInt(this.jt_Ingresar8.getText());
//        valores[8] = Integer.parseInt(this.jt_Ingresar7.getText());
//        valores[9] = Integer.parseInt(this.jt_Ingresar10.getText());
//        
//        return valores;
//    }
//    
//    public void setLabel()
//    {
//        this.jt_setIngresar1.setText(jt_Ingresar1.getText());
//        this.jt_setIngresar2.setText(jt_Ingresar2.getText());
//        this.jt_setIngresar3.setText(jt_Ingresar3.getText());
//        this.jt_setIngresar4.setText(jt_Ingresar4.getText());
//        this.jt_setIngresar5.setText(jt_Ingresar5.getText());
//        this.jt_setIngresar6.setText(jt_Ingresar6.getText());
//        this.jt_setIngresar7.setText(jt_Ingresar7.getText());
//        this.jt_setIngresar8.setText(jt_Ingresar8.getText());
//        this.jt_setIngresar9.setText(jt_Ingresar9.getText());
//        this.jt_setIngresar10.setText(jt_Ingresar10.getText());
//    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jt_Ingresar1 = new javax.swing.JTextField();
        jt_Ingresar2 = new javax.swing.JTextField();
        jt_Ingresar3 = new javax.swing.JTextField();
        jt_Ingresar4 = new javax.swing.JTextField();
        jt_Ingresar5 = new javax.swing.JTextField();
        jt_Ingresar6 = new javax.swing.JTextField();
        jt_Ingresar7 = new javax.swing.JTextField();
        jt_Ingresar8 = new javax.swing.JTextField();
        jt_Ingresar9 = new javax.swing.JTextField();
        jt_Ingresar10 = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jt_setIngresar1 = new javax.swing.JTextField();
        jt_setIngresar2 = new javax.swing.JTextField();
        jt_setIngresar3 = new javax.swing.JTextField();
        jt_setIngresar4 = new javax.swing.JTextField();
        jt_setIngresar5 = new javax.swing.JTextField();
        jt_setIngresar6 = new javax.swing.JTextField();
        jt_setIngresar7 = new javax.swing.JTextField();
        jt_setIngresar8 = new javax.swing.JTextField();
        jt_setIngresar9 = new javax.swing.JTextField();
        jt_setIngresar10 = new javax.swing.JTextField();
        jt_Ordenar1 = new javax.swing.JTextField();
        jt_Ordenar2 = new javax.swing.JTextField();
        jt_Ordenar3 = new javax.swing.JTextField();
        jt_Ordenar4 = new javax.swing.JTextField();
        jt_Ordenar5 = new javax.swing.JTextField();
        jt_Ordenar6 = new javax.swing.JTextField();
        jt_Ordenar7 = new javax.swing.JTextField();
        jt_Ordenar8 = new javax.swing.JTextField();
        jt_Ordenar9 = new javax.swing.JTextField();
        jt_Ordenar10 = new javax.swing.JTextField();
        btn_Burbuja = new javax.swing.JButton();
        btn_Intercambio = new javax.swing.JButton();
        btn_QuickSort = new javax.swing.JButton();
        btn_Seleccion = new javax.swing.JButton();
        btn_Shell = new javax.swing.JButton();
        btn_MergeSort = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tarea Ordenamientos");
        setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setText("Ingrese 10 valores:");

        btn_Guardar.setText("Guardar");

        jLabel2.setText("Opción Ordenar:");

        btn_Burbuja.setText("Burbuja");
        btn_Burbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BurbujaActionPerformed(evt);
            }
        });

        btn_Intercambio.setText("Intercambio");

        btn_QuickSort.setText("QuickSort");

        btn_Seleccion.setText("Seleccion");

        btn_Shell.setText("Shell");

        btn_MergeSort.setText("MergeSort");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jt_setIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jt_Ordenar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_setIngresar2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(jt_Ordenar2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_setIngresar3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                    .addComponent(jt_Ordenar3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_setIngresar4, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                                    .addComponent(jt_Ordenar4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_setIngresar5, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addComponent(jt_Ordenar5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_setIngresar6, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(jt_Ordenar6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_setIngresar7, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(jt_Ordenar7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_setIngresar8, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(jt_Ordenar8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_setIngresar9, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                    .addComponent(jt_Ordenar9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_setIngresar10, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addComponent(jt_Ordenar10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btn_Burbuja)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Intercambio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_QuickSort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Seleccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Shell)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_MergeSort))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jt_Ingresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_Ingresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_Ingresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_Ingresar4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_Ingresar5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_Ingresar6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_Ingresar7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_Ingresar8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_Ingresar9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_Ingresar10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Guardar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jt_Ingresar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ingresar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ingresar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ingresar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ingresar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ingresar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ingresar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ingresar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ingresar9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ingresar10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Guardar))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btn_Burbuja)
                    .addComponent(btn_Intercambio)
                    .addComponent(btn_QuickSort)
                    .addComponent(btn_Seleccion)
                    .addComponent(btn_Shell)
                    .addComponent(btn_MergeSort))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_setIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_setIngresar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_setIngresar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_setIngresar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_setIngresar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_setIngresar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_setIngresar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_setIngresar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_setIngresar9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_setIngresar10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_Ordenar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ordenar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ordenar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ordenar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ordenar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ordenar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ordenar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ordenar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ordenar9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_Ordenar10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BurbujaActionPerformed
        // TODO add your handling code here:
        introducirValores();
    }//GEN-LAST:event_btn_BurbujaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuOrdenamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOrdenamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOrdenamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOrdenamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuOrdenamientos ventana = new MenuOrdenamientos();
                ventana.introducirValores();
                ventana.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Burbuja;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Intercambio;
    private javax.swing.JButton btn_MergeSort;
    private javax.swing.JButton btn_QuickSort;
    private javax.swing.JButton btn_Seleccion;
    private javax.swing.JButton btn_Shell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jt_Ingresar1;
    private javax.swing.JTextField jt_Ingresar10;
    private javax.swing.JTextField jt_Ingresar2;
    private javax.swing.JTextField jt_Ingresar3;
    private javax.swing.JTextField jt_Ingresar4;
    private javax.swing.JTextField jt_Ingresar5;
    private javax.swing.JTextField jt_Ingresar6;
    private javax.swing.JTextField jt_Ingresar7;
    private javax.swing.JTextField jt_Ingresar8;
    private javax.swing.JTextField jt_Ingresar9;
    private javax.swing.JTextField jt_Ordenar1;
    private javax.swing.JTextField jt_Ordenar10;
    private javax.swing.JTextField jt_Ordenar2;
    private javax.swing.JTextField jt_Ordenar3;
    private javax.swing.JTextField jt_Ordenar4;
    private javax.swing.JTextField jt_Ordenar5;
    private javax.swing.JTextField jt_Ordenar6;
    private javax.swing.JTextField jt_Ordenar7;
    private javax.swing.JTextField jt_Ordenar8;
    private javax.swing.JTextField jt_Ordenar9;
    private javax.swing.JTextField jt_setIngresar1;
    private javax.swing.JTextField jt_setIngresar10;
    private javax.swing.JTextField jt_setIngresar2;
    private javax.swing.JTextField jt_setIngresar3;
    private javax.swing.JTextField jt_setIngresar4;
    private javax.swing.JTextField jt_setIngresar5;
    private javax.swing.JTextField jt_setIngresar6;
    private javax.swing.JTextField jt_setIngresar7;
    private javax.swing.JTextField jt_setIngresar8;
    private javax.swing.JTextField jt_setIngresar9;
    // End of variables declaration//GEN-END:variables
}
