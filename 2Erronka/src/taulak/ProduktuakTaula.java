package taulak;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import erronka2.Produktua;

public class ProduktuakTaula extends AbstractTableModel {

    private List<Produktua> produktuak;
    private String[] columnNames = {
        "ID", "Mota", "Marka", "Modeloa", "Memoria", "RAM", "Prozesagailua", "Tamaina",
        "Sistema Eragilea", "Kamara", "Erresoluzioa", "Frekuentzia", "Kolorea", "Prezioa", "Stock"
    };

    public ProduktuakTaula(List<Produktua> produktuak) {
        this.produktuak = produktuak;
    }

    @Override
    public int getRowCount() {
        return produktuak.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produktua p = produktuak.get(rowIndex);
        switch (columnIndex) {
            case 0: return p.getId();
            case 1: return p.getProduktuMotaId();
            case 2: return p.getMarka();
            case 3: return p.getModeloa();
            case 4: return p.getMemoria();
            case 5: return p.getRam();
            case 6: return p.getProzesagailua();
            case 7: return p.getTamaina();
            case 8: return p.getSistemaEragilea();
            case 9: return p.getKamara();
            case 10: return p.getErresoluzioa();
            case 11: return p.getFrekuentzia();
            case 12: return p.getKolorea();
            case 13: return p.getSalmentaPrezioa();
            case 14: return p.getStock();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}

