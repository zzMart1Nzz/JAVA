package taulak;

import erronka2.Langilea;

import erronka2.Langilea;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class LangileakTaula extends AbstractTableModel {

    private List<Langilea> langilea;
    private String[] columnNames = {
        "idlangilea", "lanpostua_idlanpostua", "lanpostua","nan", "izena", "abizena", "telefonoZenbakia", "postaElektronikoa", "erabiltzaileIzena", 
        "pasahitza", "helbidea", "postaKodea"
    };

    public LangileakTaula(List<Langilea> langilea) {
        this.langilea = langilea;
    }

    @Override
    public int getRowCount() {
        return langilea.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Langilea l = langilea.get(rowIndex);
        switch (columnIndex) {
            case 0: return l.getIdlangilea();
            case 1: return l.getLanpostua_idlanpostua();
            case 2: return l.getLanpostua();
            case 3: return l.getNan();
            case 4: return l.getIzena();
            case 5: return l.getAbizena();
            case 6: return l.getTelefonoZenbakia();
            case 7: return l.getPostaElektronikoa();
            case 8: return l.getErabiltzaileIzena();
            case 9: return l.getPasahitza();
            case 10: return l.getHelbidea();
            case 11: return l.getPostaKodea();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}

