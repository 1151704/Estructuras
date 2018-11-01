/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufps.vista.Menu;

/**
 *
 * @author OMAR MONTES
 */
public class MenuControl implements ActionListener {

    private Menu vista;

    public MenuControl() {

        this.vista = new Menu();
        this.init();
    }

    private void init() {

        this.vista.setVisible(true);

        this.vista.menuListaS.addActionListener(this);
        this.vista.menuListaD.addActionListener(this);
        this.vista.menuListaC.addActionListener(this);
        this.vista.menuListaCD.addActionListener(this);

        insertarEstructura(new ListaSimpleControl());

    }

    private void insertarEstructura(ControladorLista control) {

        this.vista.contenedor.setViewportView(control.getVista());
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        try {

            if (event.getActionCommand().contentEquals("lista-simple")) {
                this.insertarEstructura(new ListaSimpleControl());
            }
            if (event.getActionCommand().contentEquals("lista-doble")) {
                this.insertarEstructura(new ListaDobleControl());
            }
            if (event.getActionCommand().contentEquals("lista-circular")) {

            }
            if (event.getActionCommand().contentEquals("lista-circular_doble")) {

            }

        } catch (Exception e) {
        }

    }

}
