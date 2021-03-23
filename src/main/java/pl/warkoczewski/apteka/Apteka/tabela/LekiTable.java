package pl.warkoczewski.apteka.Apteka.tabela;
import pl.warkoczewski.apteka.Apteka.model.Lek;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class LekiTable extends AbstractTableModel {

    private final String[] COLUMN_NAMES = {"Id", "Name", "Expiry Date", "Amount"};
    private List<Lek> leki;


    @Override
    public int getRowCount() {
        return leki.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return leki.get(rowIndex).getId();
            case 1:
                return leki.get(rowIndex).getName();
            case 2:
                return leki.get(rowIndex).getExpiresAt();
            case 3:
                return leki.get(rowIndex).getAmount();
        }
        return null;
    }
}
