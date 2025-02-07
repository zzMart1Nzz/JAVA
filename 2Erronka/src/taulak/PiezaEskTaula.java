package taulak;

import erronka2.PiezaEskaera;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PiezaEskTaula extends AbstractTableModel {

    private List<PiezaEskaera> piezaEskaera;
    private String[] columnNames = {
        "idPiezaEskaera", "Hornitzaile_idHornitzailea", "Pieza_idPieza", "kopurua", "data"
    };

    public PiezaEskTaula(List<PiezaEskaera> piezaEskaera) {
        this.piezaEskaera = piezaEskaera;
    }

    @Override
    public int getRowCount() {
        return piezaEskaera.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PiezaEskaera pe = PiezaEskaera.get(rowIndex);
        switch (columnIndex) {
            case 0: return pe.getIdPiezaEskaera();
            case 1: return pe.getHornitzaile_idHornitzailea();
            case 2: return pe.getPieza_idPieza();
            case 3: return pe.getKopurua();
            case 4: return pe.getData();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        if (column >= 0 && column < columnNames.length) {
            return columnNames[column];
        }
        return null;
    }
}
