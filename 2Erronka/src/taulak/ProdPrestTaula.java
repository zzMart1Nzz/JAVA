package taulak;

import erronka2.ProduktuaPrestakuntzan;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ProdPrestTaula extends AbstractTableModel {

    private List<ProduktuaPrestakuntzan> prodprest;
    private String[] columnNames = {
        "idProdPrest", "ProduktuMota_idProduktuMota", "Bezeroa_idBezeroa", "marka", "modeloa", "ezaugarriak", "egoera"
    };

    public ProdPrestTaula(List<ProduktuaPrestakuntzan> prodprest) {
        this.prodprest = prodprest;
    }

    @Override
    public int getRowCount() {
        return prodprest.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProduktuaPrestakuntzan pp = prodprest.get(rowIndex);
        switch (columnIndex) {
            case 0: return pp.getIdProdPrest();
            case 1: return pp.getProduktuMota_idProduktuMota();
            case 2: return pp.getBezeroa_idBezeroa();
            case 3: return pp.getMarka();
            case 4: return pp.getModeloa();
            case 5: return pp.getEzaugarriak();
            case 6: return pp.getEgoera();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}

