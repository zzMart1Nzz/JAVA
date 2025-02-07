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
        ProduktuaPrestakuntzan ppp = prodprest.get(rowIndex);
        switch (columnIndex) {
            case 0: return ppp.getIdProdPrest();
            case 1: return ppp.getProduktuMota_idProduktuMota();
            case 2: return ppp.getBezeroa_idBezeroa();
            case 3: return ppp.getMarka();
            case 4: return ppp.getModeloa();
            case 5: return ppp.getEzaugarriak();
            case 6: return ppp.getEgoera();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}

