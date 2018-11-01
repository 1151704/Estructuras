/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.tablas;

import javax.swing.table.AbstractTableModel;
import ufps.util.colecciones_seed.ListaS;

/**
 *
 * @author OMAR MONTES
 * @param <T>
 */
public class ListaSimpleTabla<T> extends AbstractTableModel {

    protected ListaS<T> lista;

    private final String[] columnNames = {"Info", "Sig"};
    private final Class[] columnClasses = {Integer.class, Integer.class};

    public ListaSimpleTabla(ListaS<T> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.getTamanio();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        T info = this.lista.get(rowIndex);
        T sig = this.lista.get(rowIndex + 1);
        switch (columnIndex) {
            case 0:
                return info.hashCode();
            case 1:
                return sig != null ? sig.hashCode() : null;
            default:
        }
        return ("");

    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClasses[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

}
