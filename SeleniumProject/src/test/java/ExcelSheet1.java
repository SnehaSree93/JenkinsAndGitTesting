/*
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelSheet1 {
    @Test
    @DataProvider(name = "TestData")

    public Object[][] excel() throws IOException {
        File file = new File("/home/gaian/AutomatioSoftWares/eclipse-workspace/L3aas-Automation/src/test/resources/testData/CategoryTestData.xls");
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFRow firstRow = sheet.getRow(0);
        int row = sheet.getPhysicalNumberOfRows();
        int cell = firstRow.getLastCellNum();
        Object[][] Data = new Object[row - 1][cell];
        for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            XSSFRow rowValue = sheet.getRow(rowIndex);
            if (rowValue == null) {
                continue;
            }
            for (int colIndex = rowValue.getFirstCellNum(); colIndex < rowValue.getLastCellNum(); colIndex++) {
                Data[rowIndex - 1][colIndex] = rowValue.getCell(colIndex).getStringCellValue();
            }
        }
        return Data;

    }
}
*/
