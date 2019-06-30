/*
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ExcelSheet2Shiva {
    @Test

    public void sheeyt() throws IOException {
        File f = new File("./server/Plan.xlsx");
        Workbook wb = WorkbookFactory.create(f);
        Sheet s = wb.getSheet("Decomm");
        int rowCount = s.getLastRowNum();
        for (int i = 0; i < rowCount; i++) {
            Row r = s.getRow(i);
            int colCount = r.getLastCellNum();
            String data = " ";

            for (int j = 0; j < colCount; j++){
                if(s.getRow(i).getCell(j).getCellType()== CellType.NUMERIC){
                   int cellData= (int)s.getRow(i).getCell(j).getNumericCellValue();
                   data = String.valueOf(cellData);
                }
                else {
                    data= s.getRow(i).getCell(j).getStringCellValue();
                }
            }
            System.out.println(data);
        }
    }
}
*/
