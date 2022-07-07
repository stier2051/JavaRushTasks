package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {

        private TableInterface original;
        private List rowsOriginal;

        public TableInterfaceWrapper (TableInterface tableInterface) {
            this.original = tableInterface;
        }

        @Override
        public void setModel(List rows) {
           this.rowsOriginal = rows;
            System.out.println(rowsOriginal.size());
            this.original.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return original.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            original.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}