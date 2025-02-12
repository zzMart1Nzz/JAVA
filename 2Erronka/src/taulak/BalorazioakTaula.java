package taulak;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import erronka2.Balorazioa;

public class BalorazioakTaula extends AbstractTableModel {

    private List<Balorazioa> balorazioa;
    private String[] columnNames = {
        "idBalorazioa", "idBezeroa", "idProduktua", "balorazioa", "data"
    };

    public BalorazioakTaula(List<Balorazioa> balorazioa) {
        this.balorazioa = balorazioa;
    }

    @Override
    public int getRowCount() {
        return balorazioa.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Balorazioa bl = balorazioa.get(rowIndex);
        switch (columnIndex) {
            case 0: return bl.getIdBalorazioa();
            case 1: return bl.getBezeroa_idBezeroa();
            case 2: return bl.getProduktua_idProduktua();
            case 3: return bl.getBalorazioa();
            case 4: return bl.getData();
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
