package taulak;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import erronka2.Hornitzailea;

public class HornitzaileakTaula extends AbstractTableModel {

    private List<Hornitzailea> hornitzailea;
    private String[] columnNames = {
        "idHornitzailea", "nif", "izena", "telefonoZenbakia", "postaElektronikoa", "helbidea", "herria", "postakodea"
    };

    public HornitzaileakTaula(List<Hornitzailea> hornitzailea) {
        this.hornitzailea = hornitzailea;
    }

    @Override
    public int getRowCount() {
        return hornitzailea.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Hornitzailea h = hornitzailea.get(rowIndex);
        switch (columnIndex) {
            case 0: return h.getIdHornitzailea();
            case 1: return h.getNif();
            case 2: return h.getIzena();
            case 3: return h.getTelefonoZenbakia();
            case 4: return h.getPostaElektronikoa();
            case 5: return h.getHelbidea();
            case 6: return h.getHerria();
            case 7: return h.getPostakodea();


            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}

