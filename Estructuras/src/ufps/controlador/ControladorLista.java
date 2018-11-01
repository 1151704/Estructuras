/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.controlador;

import javax.swing.JPanel;

/**
 *
 * @author OMAR MONTES
 */
public abstract class ControladorLista {
    
    public abstract void cargarLista(String className);

    public abstract void resetearLista();
    
    public abstract JPanel getVista();

}
