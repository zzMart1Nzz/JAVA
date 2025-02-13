package taulak;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import erronka2.PiezaEskaera;

public class PiezaEskTaula extends AbstractTableModel {
    private static final long serialVersionUID = 1L;
    private List<PiezaEskaera> piezaEskaeraList;
    private String[] columnNames = { "ID", "Hornitzaile ID", "Pieza ID", "Kopurua", "Data" };

    public PiezaEskTaula(List<PiezaEskaera> piezaEskaeraList) {
        this.piezaEskaeraList = piezaEskaeraList;
    }

    @Override
    public int getRowCount() {
        return piezaEskaeraList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PiezaEskaera pe = piezaEskaeraList.get(rowIndex);
        if (pe != null) {
            switch (columnIndex) {
                case 0:
                    return pe.getIdPiezaEskaera();
                case 1:
                    return pe.getHornitzaile_idHornitzailea();
                case 2:
                    return pe.getPieza_idPieza();
                case 3:
                    return pe.getKopurua();
                case 4:
                    return pe.getData();
                default:
                    return null;
            }
        } else {
            return "N/A";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
            case 1:
            case 2:
            case 3:
                return Integer.class;
            case 4:
                return java.sql.Timestamp.class;
            default:
                return String.class;
        }
    }
}
