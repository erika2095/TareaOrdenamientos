
package Ventana_Menu;

import Controlador.Controlador_Ordenamiento;
import Metodos.Burbuja;
import Metodos.Intercambio;
import Metodos.Megersort1;
import Metodos.QuickSort;
import Metodos.Seleccion;
import Metodos.Shell;
import javax.swing.JOptionPane;

/**
 *
 * @author 3rika
 */
public class MenuOrdenamientos extends javax.swing.JFrame {

    Controlador_Ordenamiento controlador;
    Megersort1 mer = new Megersort1();
    
    int arr1 [] = new int[10], n;
    String ax="";
    
    public MenuOrdenamientos() {
        initComponents();
        controlador = new Controlador_Ordenamiento(this);
    }
    
    public void introducirValores()
    {
        for(int i=0; i<arr1.length; i++)
        { 
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero en la posicion "+(i+1)+": ")); 
            arr1[i]=n;
            ax+=arr1[i]+" ";
        }
        System.out.println("Valores ingresados: "+ax);
    }
    
    public void setValoresIntroducidos()
    {
        this.jt_Ingresar1.setText(""+arr1[0]);
        this.jt_Ingresar2.setText(""+arr1[1]);
        this.jt_Ingresar3.setText(""+arr1[2]);
        this.jt_Ingresar4.setText(""+arr1[3]);
        this.jt_Ingresar5.setText(""+arr1[4]);
        this.jt_Ingresar6.setText(""+arr1[5]);
        this.jt_Ingresar7.setText(""+arr1[6]);
        this.jt_Ingresar8.setText(""+arr1[7]);
        this.jt_Ingresar9.setText(""+arr1[8]);
        this.jt_Ingresar10.setText(""+arr1[9]);
    }
    
    public void ordenarBurbuja()
    {
        System.out.println(" - Ordenamiento Burbuja - ");
        Burbuja.ordBurbuja(arr1);
        Burbuja.imprimir(arr1);
        
        this.jt_setIngresar1.setText(""+arr1[0]);
        this.jt_setIngresar2.setText(""+arr1[1]);
        this.jt_setIngresar3.setText(""+arr1[2]);
        this.jt_setIngresar4.setText(""+arr1[3]);
        this.jt_setIngresar5.setText(""+arr1[4]);
        this.jt_setIngresar6.setText(""+arr1[5]);
        this.jt_setIngresar7.setText(""+arr1[6]);
        this.jt_setIngresar8.setText(""+arr1[7]);
        this.jt_setIngresar9.setText(""+arr1[8]);
        this.jt_setIngresar10.setText(""+arr1[9]);
    }
    
    public void ordenarIntercambio()
    {
        System.out.println(" - Ordenamiento Intercambio - ");
        Intercambio.ordIntercambio(arr1);
        Intercambio.imprimir(arr1);
        
        this.jt_setIngresar1.setText(""+arr1[0]);
        this.jt_setIngresar2.setText(""+arr1[1]);
        this.jt_setIngresar3.setText(""+arr1[2]);
        this.jt_setIngresar4.setText(""+arr1[3]);
        this.jt_setIngresar5.setText(""+arr1[4]);
        this.jt_setIngresar6.setText(""+arr1[5]);
        this.jt_setIngresar7.setText(""+arr1[6]);
        this.jt_setIngresar8.setText(""+arr1[7]);
        this.jt_setIngresar9.setText(""+arr1[8]);
        this.jt_setIngresar10.setText(""+arr1[9]);
    }
    
    public void ordenarQuickSort()
    {
        System.out.println(" - Ordenamiento QuickSort - ");
        QuickSort.quicksort(arr1, 0, arr1.length-1);
        QuickSort.imprimir(arr1);
        
        this.jt_setIngresar1.setText(""+arr1[0]);
        this.jt_setIngresar2.setText(""+arr1[1]);
        this.jt_setIngresar3.setText(""+arr1[2]);
        this.jt_setIngresar4.setText(""+arr1[3]);
        this.jt_setIngresar5.setText(""+arr1[4]);
        this.jt_setIngresar6.setText(""+arr1[5]);
        this.jt_setIngresar7.setText(""+arr1[6]);
        this.jt_setIngresar8.setText(""+arr1[7]);
        this.jt_setIngresar9.setText(""+arr1[8]);
        this.jt_setIngresar10.setText(""+arr1[9]);
    }
    
    public void ordenarSeleccion()
    {
        System.out.println(" - Ordenamiento Seleccion - ");
        Seleccion.ordSeleccion(arr1);
        Seleccion.imprimir(arr1);
        
        this.jt_setIngresar1.setText(""+arr1[0]);
        this.jt_setIngresar2.setText(""+arr1[1]);
        this.jt_setIngresar3.setText(""+arr1[2]);
        this.jt_setIngresar4.setText(""+arr1[3]);
        this.jt_setIngresar5.setText(""+arr1[4]);
        this.jt_setIngresar6.setText(""+arr1[5]);
        this.jt_setIngresar7.setText(""+arr1[6]);
        this.jt_setIngresar8.setText(""+arr1[7]);
        this.jt_setIngresar9.setText(""+arr1[8]);
        this.jt_setIngresar10.setText(""+arr1[9]);
    }
    
    public void ordenarShell()
    {
        System.out.println(" - Ordenamiento Shell - ");
        Shell.ordenacionShell(arr1);
        Shell.imprimir(arr1);
        
        this.jt_setIngresar1.setText(""+arr1[0]);
        this.jt_setIngresar2.setText(""+arr1[1]);
        this.jt_setIngresar3.setText(""+arr1[2]);
        this.jt_setIngresar4.setText(""+arr1[3]);
        this.jt_setIngresar5.setText(""+arr1[4]);
        this.jt_setIngresar6.setText(""+arr1[5]);
        this.jt_setIngresar7.setText(""+arr1[6]);
        this.jt_setIngresar8.setText(""+arr1[7]);
        this.jt_setIngresar9.setText(""+arr1[8]);
        this.jt_setIngresar10.setText(""+arr1[9]);
    }

    public void ordenarMezcla()
    {
        System.out.println(" - Ordenamiento MergeShort - ");
        mer.MergeSort1(arr1);
        mer.imprimir(arr1);
        
        this.jt_setIngresar1.setText(""+arr1[0]);
        this.jt_setIngresar2.setText(""+arr1[1]);
        this.jt_setIngresar3.setText(""+arr1[2]);
        this.jt_setIngresar4.setText(""+arr1[3]);
        this.jt_setIngresar5.setText(""+arr1[4]);
        this.jt_setIngresar6.setText(""+arr1[5]);
        this.jt_setIngresar7.setText(""+arr1[6]);
        this.jt_setIngresar8.setText(""+arr1[7]);
        this.jt_setIngresar9.setText(""+arr1[8]);
        this.jt_setIngresar10.setText(""+arr1[9]);
    }
    
    
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
        btn_Burbuja = new javax.swing.JButton();
        btn_Intercambio = new javax.swing.JButton();
        btn_QuickSort = new javax.swing.JButton();
        btn_Seleccion = new javax.swing.JButton();
        btn_Shell = new javax.swing.JButton();
        btn_MergeSort = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();
        btn_Paso_Burbuja = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_Limpiar = new javax.swing.JButton();
        btn_Paso_Intercambio = new javax.swing.JButton();
        btn_Paso_QuickSort = new javax.swing.JButton();
        btn_Paso_Seleccion = new javax.swing.JButton();
        btn_Paso_Shell = new javax.swing.JButton();
        btn_Paso_MergeSort = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tarea Ordenamientos");
        setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setText("Valores ingresados");

        jLabel2.setText("Opción Ordenar:");

        btn_Burbuja.setText("Burbuja");
        btn_Burbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BurbujaActionPerformed(evt);
            }
        });

        btn_Intercambio.setText("Intercambio");
        btn_Intercambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IntercambioActionPerformed(evt);
            }
        });

        btn_QuickSort.setText("QuickSort");
        btn_QuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuickSortActionPerformed(evt);
            }
        });

        btn_Seleccion.setText("Seleccion");
        btn_Seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeleccionActionPerformed(evt);
            }
        });

        btn_Shell.setText("Shell");
        btn_Shell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShellActionPerformed(evt);
            }
        });

        btn_MergeSort.setText("MergeSort");
        btn_MergeSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MergeSortActionPerformed(evt);
            }
        });

        btn_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga.png"))); // NOI18N

        btn_Paso_Burbuja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga (1).png"))); // NOI18N
        btn_Paso_Burbuja.setText("Paso");
        btn_Paso_Burbuja.setActionCommand("PasoBurbuja");

        jLabel4.setText("Erika / Jaky");

        btn_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga (2).png"))); // NOI18N
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        btn_Paso_Intercambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga (1).png"))); // NOI18N
        btn_Paso_Intercambio.setText("Paso");
        btn_Paso_Intercambio.setActionCommand("PasoIntercambio");

        btn_Paso_QuickSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga (1).png"))); // NOI18N
        btn_Paso_QuickSort.setText("Paso");
        btn_Paso_QuickSort.setActionCommand("PasoQuickSort");

        btn_Paso_Seleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga (1).png"))); // NOI18N
        btn_Paso_Seleccion.setText("Paso");
        btn_Paso_Seleccion.setActionCommand("PasoSeleccion");

        btn_Paso_Shell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga (1).png"))); // NOI18N
        btn_Paso_Shell.setText("Paso");
        btn_Paso_Shell.setActionCommand("PasoShell");

        btn_Paso_MergeSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga (1).png"))); // NOI18N
        btn_Paso_MergeSort.setText("Paso");
        btn_Paso_MergeSort.setActionCommand("PasoMergeSort");

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
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btn_Burbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_Intercambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Paso_Intercambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_QuickSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Paso_QuickSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_Seleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Paso_Seleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_Paso_Shell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Shell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_Paso_MergeSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_MergeSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jt_setIngresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_setIngresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jt_setIngresar4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_setIngresar5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jt_setIngresar6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_setIngresar7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jt_setIngresar8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_setIngresar9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_setIngresar10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Paso_Burbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
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
                                .addComponent(jt_Ingresar10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
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
                    .addComponent(jt_Ingresar10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btn_Burbuja)
                    .addComponent(btn_Intercambio)
                    .addComponent(btn_QuickSort)
                    .addComponent(btn_Seleccion)
                    .addComponent(btn_Shell)
                    .addComponent(btn_MergeSort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 108, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Paso_Burbuja)
                            .addComponent(btn_Paso_Intercambio)
                            .addComponent(btn_Paso_QuickSort)
                            .addComponent(btn_Paso_Seleccion)
                            .addComponent(btn_Paso_Shell)
                            .addComponent(btn_Paso_MergeSort))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
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
                                    .addComponent(jt_setIngresar10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Volver)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BurbujaActionPerformed
        // TODO add your handling code here:
        ordenarBurbuja();
    }//GEN-LAST:event_btn_BurbujaActionPerformed

    private void btn_IntercambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IntercambioActionPerformed
        // TODO add your handling code here:
        ordenarIntercambio();
    }//GEN-LAST:event_btn_IntercambioActionPerformed

    private void btn_QuickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuickSortActionPerformed
        // TODO add your handling code here:
        ordenarQuickSort();
    }//GEN-LAST:event_btn_QuickSortActionPerformed

    private void btn_SeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeleccionActionPerformed
        // TODO add your handling code here:
        ordenarSeleccion();
    }//GEN-LAST:event_btn_SeleccionActionPerformed

    private void btn_ShellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShellActionPerformed
        // TODO add your handling code here:
        ordenarShell();
    }//GEN-LAST:event_btn_ShellActionPerformed

    private void btn_MergeSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MergeSortActionPerformed
        // TODO add your handling code here:
        ordenarMezcla();
    }//GEN-LAST:event_btn_MergeSortActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        // TODO add your handling code here:
        this.jt_setIngresar1.setText(" ");
        this.jt_setIngresar2.setText(" ");
        this.jt_setIngresar3.setText(" ");
        this.jt_setIngresar4.setText(" ");
        this.jt_setIngresar5.setText(" ");
        this.jt_setIngresar6.setText(" ");
        this.jt_setIngresar7.setText(" ");
        this.jt_setIngresar8.setText(" ");
        this.jt_setIngresar9.setText(" ");
        this.jt_setIngresar10.setText(" ");
    }//GEN-LAST:event_btn_LimpiarActionPerformed

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
                ventana.setValoresIntroducidos();
                ventana.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Burbuja;
    private javax.swing.JButton btn_Intercambio;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_MergeSort;
    private javax.swing.JButton btn_Paso_Burbuja;
    private javax.swing.JButton btn_Paso_Intercambio;
    private javax.swing.JButton btn_Paso_MergeSort;
    private javax.swing.JButton btn_Paso_QuickSort;
    private javax.swing.JButton btn_Paso_Seleccion;
    private javax.swing.JButton btn_Paso_Shell;
    private javax.swing.JButton btn_QuickSort;
    private javax.swing.JButton btn_Seleccion;
    private javax.swing.JButton btn_Shell;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
