/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ufps.util.colecciones_seed.ListaS;
import ufps.vista.ListaDoble;

/**
 *
 * @author OMAR MONTES
 * @param <T>
 */
public class ListaDobleControl<T> extends ControladorLista implements ActionListener {
    
    private ListaDoble vista;
    private ListaS<T> listaS;
    
    
    public ListaDobleControl() {
        this.vista = new ListaDoble();
        this.listaS = new ListaS<>();
        
        this.init();
    }
    
    private void init() {
        this.vista.btnCargar.addActionListener(this);
        this.vista.btnResetear.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            
            if (event.getActionCommand().contentEquals("lista-cargar")) {
                this.cargarLista(this.vista.txtClase.getText());
            }
            if (event.getActionCommand().contentEquals("lista-resetear")) {
                this.resetearLista();
            }
            
        } catch (Exception e) {
            
        }
    }
    
    @Override
    public void cargarLista(String className) {
        try {
            Class clase = Class.forName(className);
            
            
                        
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this.vista, "Clase no encontrada");            
        }
    }
    
    @Override
    public void resetearLista() {
//        this.vista.contenido.setViewportView(null);
    }
    
    @Override
    public JPanel getVista() {
        return this.vista;
    }
    
}
