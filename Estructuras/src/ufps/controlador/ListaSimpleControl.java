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
import ufps.tablas.ListaSimpleTabla;
import ufps.util.colecciones_seed.ListaS;
import ufps.vista.ListaSimple;

/**
 *
 * @author OMAR MONTES
 * @param <T>
 */
public class ListaSimpleControl<T> extends ControladorLista implements ActionListener {
    
    private ListaSimple vista;
    private ListaS listaS;
    private ListaSimpleTabla tabla;
    
    public ListaSimpleControl() {
        this.vista = new ListaSimple();
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
        this.vista.contenedorTabla.setViewportView(null);
    }
    
    @Override
    public JPanel getVista() {
        return this.vista;
    }
    
}
