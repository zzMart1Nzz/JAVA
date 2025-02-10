package taulak;

import erronka2.Eskaera;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class EskaerakTaula extends AbstractTableModel {

    private List<Eskaera> eskaera;
    private String[] columnNames = {
        "idEskaera", "fraZkia", "Bezeroa_idBezeroa", "totala", "data", "faktura"
    };

    public EskaerakTaula(List<Eskaera> eskaera) {
        this.eskaera = eskaera;
    }

    @Override
    public int getRowCount() {
        return eskaera.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Eskaera es = eskaera.get(rowIndex);
        switch (columnIndex) {
            case 0: return es.getIdEskaera();
            case 1: return es.getFraZkia();
            case 2: return es.getBezeroa_idBezeroa();
            case 3: return es.getTotala();
            case 4: return es.getEgoera();
            case 5: return es.getData();
            case 6: return es.getFaktura();   
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
