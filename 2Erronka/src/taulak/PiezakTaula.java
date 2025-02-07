package taulak;

import erronka2.Pieza;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PiezakTaula extends AbstractTableModel {

    private List<Pieza> pieza;
    private String[] columnNames = {
        "idPieza", "kategoria", "marka", "modeloa", "ezaugarriak", "erosketaPrezioa", "stock"
    };

    public PiezakTaula(List<Pieza> pieza) {
        this.pieza = pieza;
    }

    @Override
    public int getRowCount() {
        return pieza.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pieza pi = pieza.get(rowIndex);
        switch (columnIndex) {
            case 0: return pi.getIdPieza(); 
            case 1: return pi.getKategoria();
            case 2:return pi.getMarka();
            case 3: return pi.getModeloa();
            case 4: return pi.getEzaugarriak();
            case 5: return pi.getErosketaPrezioa();
            case 6: return pi.getStock();

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
