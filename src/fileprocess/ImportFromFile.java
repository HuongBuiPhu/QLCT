package fileprocess;

import javax.swing.JFileChooser;
import javax.swing.JTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

public class ImportFromFile {

    public void importExcel(JTable table, String[] arr) {

        JFileChooser chooser = new JFileChooser();

        File fileName = null;

        int f = chooser.showOpenDialog(chooser);
        if (f == JFileChooser.APPROVE_OPTION) {
            fileName = chooser.getSelectedFile();
        }
        FileInputStream file;
        HSSFWorkbook workbook;
        try {
            file = new FileInputStream(fileName);
            workbook = new HSSFWorkbook(file);

            DefaultTableModel model = new DefaultTableModel(arr, 0);

            HSSFSheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator cellIterator = row.cellIterator();
                Vector v = new Vector();
                while (cellIterator.hasNext()) {
                    Cell cell = (Cell) cellIterator.next();
                    CellType cellType = cell.getCellTypeEnum();

                    switch (cellType) {
                        case _NONE:
                            break;
                        case BLANK:
                            break;
                        case FORMULA:
                            break;
                        case NUMERIC:
                            v.add((int) cell.getNumericCellValue());
                            break;
                        case STRING:
                            v.add(cell.getStringCellValue());
                            break;
                        case ERROR:
                            break;
                    }
                }
                model.addRow(v);
            }
            workbook.close();
            table.setModel(model);
            file.close();
        } catch (IOException ex) {
            System.out.print("Loi: " + ex.getMessage());
        }
    }

}
