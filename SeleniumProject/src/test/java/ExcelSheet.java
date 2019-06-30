/*
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;


public class ExcelSheet {
    @Test
    public void readExcel() throws IOException {
        FileInputStream fileInputStream= new FileInputStream("./server/Plan.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        int numberOfSheets = workbook.getNumberOfSheets();
        for(int i=0; i<numberOfSheets;i++){
            if(workbook.getSheetName(i).equalsIgnoreCase("Decomm")){
                XSSFSheet sheetAt = workbook.getSheetAt(i);
                Iterator<Row> rows = sheetAt.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> cellFirstRow = firstRow.cellIterator();
                cellFirstRow.next();
                int k=0;
                int column=0;
                while (cellFirstRow.hasNext()){
                 Cell cellValue=   cellFirstRow.next();
                 if(cellValue.getStringCellValue().equalsIgnoreCase("Customers")){
                    column=k;
                 }
                    k++;
                }
                System.out.println(column);
               */
/* while (rows.hasNext()){
                    Row r = rows.next();
                   if( r.getCell(column).getStringCellValue().equalsIgnoreCase("AMS-18300148-STAGE-UUW-C0068")){
                       Iterator<Cell> cellIterator = r.cellIterator();
                       while (cellIterator.hasNext()){
                           System.out.println(cellIterator.next().getStringCellValue());

                       }
                   }*//*


                }


            }

        }


    }

*/
