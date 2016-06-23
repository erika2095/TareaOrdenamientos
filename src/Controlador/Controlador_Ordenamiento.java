/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Ventana_Menu.MenuOrdenamientos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/**
 *
 * @author 3rika
 */
public class Controlador_Ordenamiento implements ActionListener
{
    MenuOrdenamientos ventana;
    
    public Controlador_Ordenamiento(MenuOrdenamientos ventana)
    {
        this.ventana = ventana;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Burbuja"))
        {
            System.out.println(" Burbuja\n");
        }
    }
    
}
