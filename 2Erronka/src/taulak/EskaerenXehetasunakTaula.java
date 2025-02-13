package taulak;

import java.util.List;

import javax.swing.table.AbstractTableModel;


import erronka2.EskaerenXehetasunak;

public class EskaerenXehetasunakTaula extends AbstractTableModel {

    private List<EskaerenXehetasunak> eskaerenXehetasunak;
    private String[] columnNames = {
        "idEskaeraproduktua", "fraZkia", "idProduktua", "kopurua", "prezioa", "data", "idBezeroa"
    };

    public EskaerenXehetasunakTaula(List<EskaerenXehetasunak> eskaerenXehetasunak) {
        this.eskaerenXehetasunak = eskaerenXehetasunak;
    }

    @Override
    public int getRowCount() {
        return eskaerenXehetasunak.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EskaerenXehetasunak es = eskaerenXehetasunak.get(rowIndex);
        switch (columnIndex) {
            case 0: return es.getIdEskaeraproduktua();
            case 1: return es.getFraZkia();
            case 2: return es.getIdProduktua();
            case 3: return es.getKopurua();
            case 4: return es.getPrezioa();
            case 5: return es.getData();
            case 6: return es.getIdBezeroa();
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
