package fileprocess;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExportFile {

    SimpleDateFormat form1 = new SimpleDateFormat("dd");
    SimpleDateFormat form2 = new SimpleDateFormat("MM");
    SimpleDateFormat form3 = new SimpleDateFormat("yyyy");

    Date today = new Date();
    String ngay = form1.format(today);
    String thang = form2.format(today);
    String nam = form3.format(today);

    public void exportExcel(JTable table, int startRow, int startCol, String tieude,
            String time, String name, String thu, String chi) {

        JFileChooser chooser = new JFileChooser();

        File fileName = null;

        int f = chooser.showSaveDialog(chooser);
        if (f == JFileChooser.APPROVE_OPTION) {
            fileName = chooser.getSelectedFile();
        }

        DefaultTableModel model = (DefaultTableModel) table.getModel();

        Workbook workbook;
        WritableWorkbook temp;
        WritableSheet sheet;

        Desktop dt = Desktop.getDesktop();

        if (fileName != null) {
            try {
                workbook = Workbook.getWorkbook(fileName);
                temp = Workbook.createWorkbook(fileName, workbook);
                sheet = temp.getSheet(0);

                //bảng kê
                WritableFont font1 = new WritableFont(WritableFont.TAHOMA, 11);
                font1.setColour(Colour.BLACK);
                WritableCellFormat cellformat1 = new WritableCellFormat(font1);
                cellformat1.setAlignment(Alignment.CENTRE);
                cellformat1.setBorder(Border.ALL, BorderLineStyle.THIN);

                //tên cột
                WritableFont font2 = new WritableFont(WritableFont.TAHOMA, 12, WritableFont.BOLD);
                font2.setColour(Colour.BLACK);
                WritableCellFormat cellformat2 = new WritableCellFormat(font2);
                cellformat2.setWrap(true);
                cellformat2.setAlignment(Alignment.CENTRE);
                cellformat2.setBorder(Border.ALL, BorderLineStyle.THIN);
                cellformat2.setBackground(Colour.GRAY_25);

                //tiêu đề
                WritableFont font = new WritableFont(WritableFont.TAHOMA, 16, WritableFont.BOLD);
                font.setColour(Colour.BLACK);
                WritableCellFormat cellformat = new WritableCellFormat(font);
                cellformat.setAlignment(Alignment.CENTRE);

                //chữ nghieng
                WritableFont font4 = new WritableFont(WritableFont.TAHOMA, 11);
                font4.setColour(Colour.BLACK);
                font4.setItalic(true);
                WritableCellFormat cellformat4 = new WritableCellFormat(font4);
                cellformat4.setAlignment(Alignment.CENTRE);

                sheet.addCell(new Label(2, 0, tieude, cellformat));
                sheet.addCell(new Label(2, 1, time, cellformat4));

                if (Integer.parseInt(chi) >= 0 && Integer.parseInt(thu) >= 0) {
                    sheet.addCell(new Label(5, 3, "Tổng thu", cellformat2));
                    sheet.addCell(new Label(5, 4, "Tổng chi", cellformat2));
                    sheet.addCell(new Label(6, 3, thu, cellformat2));
                    sheet.addCell(new Label(6, 4, chi, cellformat2));
                }

                int row, col = 0, i, j;
                sheet.addCell(new Label(0, startRow, "Stt", cellformat2));
                for (i = startCol + 1, j = 1; j < table.getColumnCount(); i++, j++) {
                    sheet.addCell(new Label(i, startRow, (String) model.getColumnName(j), cellformat2));
                }

                for (row = startRow + 1, i = 0; i < table.getRowCount(); row++, i++) {
                    for (col = startCol + 1, j = 1; j < table.getColumnCount(); col++, j++) {
                        Object obj = model.getValueAt(i, j);
                        if (obj instanceof String) {
                            sheet.addCell(new Label(col, row, (String) model.getValueAt(i, j), cellformat1));
                        } else if (obj instanceof Integer) {
                            sheet.addCell(new Number(col, row, (Integer) model.getValueAt(i, j), cellformat1));
                        }
                    }
                    sheet.addCell(new Number(startCol, row, i + 1, cellformat1));
                }

                sheet.addCell(new Label(col - 2, row + 1, name, cellformat4));

                temp.write();

                temp.close();

                dt.open(fileName);

                JOptionPane.showMessageDialog(table, "Xuất file thành công!", "Thông báo", 1);
            } catch (IOException | WriteException | BiffException e) {
                System.out.println("loi: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(table, "File không tồn tại!", "Thông báo", 0);
        }
    }

    public void fileThanhVien(JTable table, int startRow, int startCol,String name) {
        JFileChooser chooser = new JFileChooser();

        File fileName = null;

        int f = chooser.showSaveDialog(chooser);
        if (f == JFileChooser.APPROVE_OPTION) {
            fileName = chooser.getSelectedFile();
            fileName.setWritable(true);
        }

        DefaultTableModel model = (DefaultTableModel) table.getModel();

        Workbook workbook;
        WritableWorkbook temp;
        WritableSheet sheet;

        Desktop dt = Desktop.getDesktop();

        if (fileName != null && fileName.canWrite()) {
            try {
                workbook = Workbook.getWorkbook(fileName);
                temp = Workbook.createWorkbook(fileName, workbook);
                sheet = temp.getSheet(0);

                //bảng kê
                WritableFont font1 = new WritableFont(WritableFont.TAHOMA, 11);
                font1.setColour(Colour.BLACK);
                WritableCellFormat cellformat1 = new WritableCellFormat(font1);
                cellformat1.setAlignment(Alignment.CENTRE);
                cellformat1.setBorder(Border.ALL, BorderLineStyle.THIN);

                //tên cột
                WritableFont font2 = new WritableFont(WritableFont.TAHOMA, 12, WritableFont.BOLD);
                font2.setColour(Colour.BLACK);
                WritableCellFormat cellformat2 = new WritableCellFormat(font2);
                cellformat2.setWrap(true);
                cellformat2.setAlignment(Alignment.CENTRE);
                cellformat2.setBorder(Border.ALL, BorderLineStyle.THIN);
                cellformat2.setBackground(Colour.GRAY_25);

                //tiêu đề
                WritableFont font = new WritableFont(WritableFont.TAHOMA, 18, WritableFont.BOLD);
                font.setColour(Colour.BLACK);
                WritableCellFormat cellformat = new WritableCellFormat(font);
                cellformat.setAlignment(Alignment.CENTRE);

                //chữ nghieng
                WritableFont font4 = new WritableFont(WritableFont.TAHOMA, 11);
                font4.setColour(Colour.BLACK);
                font4.setItalic(true);
                WritableCellFormat cellformat4 = new WritableCellFormat(font4);
                cellformat4.setAlignment(Alignment.CENTRE);
                
                sheet.addCell(new Label(3, 0,"BẢNG KÊ CÁC THÀNH VIÊN", cellformat));

                int row, col = 0, i, j;
                sheet.addCell(new Label(startCol, startRow,"Stt", cellformat2));
                for (i = startCol+1, j = 0; j < table.getColumnCount(); i++, j++) {
                    sheet.addCell(new Label(i, startRow, (String) model.getColumnName(j), cellformat2));
                }

                for (row = startRow + 1, i = 0; i < table.getRowCount(); row++, i++) {
                    for (col = startCol+1, j = 0; j < table.getColumnCount(); col++, j++) {
                        Object obj = model.getValueAt(i, j);
                        if (obj instanceof String) {
                            sheet.addCell(new Label(col, row, (String) model.getValueAt(i, j), cellformat1));
                        } else if (obj instanceof Integer) {
                            sheet.addCell(new Number(col, row, (Integer) model.getValueAt(i, j), cellformat1));
                        }
                    }
                    sheet.addCell(new Number(startCol, row, i + 1, cellformat1));
                }

                sheet.addCell(new Label(col - 1, row + 1, "Người lập báo cáo", cellformat4));
                sheet.addCell(new Label(col - 1, row + 2, name, cellformat4));

                temp.write();

                temp.close();

                dt.open(fileName);

                JOptionPane.showMessageDialog(table, "Xuất file thành công!", "Thông báo", 1);
            } catch (IOException | WriteException | BiffException e) {
                System.out.println("loi: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(table, "File không tồn tại!", "Thông báo", 0);
        }
    }
}
