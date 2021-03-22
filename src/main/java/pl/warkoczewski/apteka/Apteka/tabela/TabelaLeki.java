package pl.warkoczewski.apteka.Apteka.tabela;

import javax.swing.*;
import java.awt.*;

public class TabelaLeki extends JPanel {

    JTable jTable;

    public TabelaLeki() {
        String[] columns = {"Id", "Name"};

        String[][] leki = {{"1", "Nurofen"}, {"2", "Gripex"}, {"3", "Apap"}, {"4", "Mydocam"}};

        jTable = new JTable(leki, columns);
        jTable.setPreferredScrollableViewportSize(new Dimension(500, 700));
        jTable.setFillsViewportHeight(true);

        JScrollPane jScrollPane = new JScrollPane(jTable);
        add(jScrollPane);
    }

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        TabelaLeki tabelaLeki = new TabelaLeki();
        jFrame.setTitle("LEKI");
        jFrame.setSize(600,600);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(tabelaLeki);
    }
}
