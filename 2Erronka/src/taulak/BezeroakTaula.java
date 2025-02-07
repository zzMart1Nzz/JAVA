package taulak;

import erronka2.Bezeroa;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class BezeroakTaula extends AbstractTableModel {

    private List<Bezeroa> bezeroa;
    private String[] columnNames = {
        "idBezeroa", "nanEdoNif", "izena", "abizena", "telefonoZenbakia", "postaElektronikoa", "helbidea", "herria", "postakodea", "pasahitza"
    };

    public BezeroakTaula(List<Bezeroa> bezeroa) {
        this.bezeroa = bezeroa;
    }

    @Override
    public int getRowCount() {
        return bezeroa.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Bezeroa b = bezeroa.get(rowIndex);
        switch (columnIndex) {
            case 0: return b.getIdBezeroa();
            case 1: return b.getNanEdoNif();
            case 2: return b.getIzena();
            case 3: return b.getAbizena();
            case 4: return b.getTelefonoZenbakia();
            case 5: return b.getPostaElektronikoa();
            case 6: return b.getHelbidea();
            case 7: return b.getHerria();
            case 8: return b.getPostakodea();
            case 9: return b.getPasahitza();
          
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}

