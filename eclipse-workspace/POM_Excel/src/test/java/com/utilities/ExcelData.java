package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.DataProvider;

public class ExcelData {

    @DataProvider(name = "validData")
    public Object[][] validData() throws IOException {
        Object[][] data = excelDataProvider();
        return new Object[][] { data[0] };
    }

    @DataProvider(name = "InvalidData")
    public Object[][] invalidData() throws IOException {
        Object[][] data = excelDataProvider();
        return new Object[][] { data[1], data[2] };
    }

    public static Object[][] excelDataProvider() throws IOException {
        String path = System.getProperty("user.dir") + "/src/test/resources/Data.xlsx";
        return getExcelData(path, "sheet2");
    }

    private static Object[][] getExcelData(String file, String sheetName) throws IOException {

        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook work = new XSSFWorkbook(fis);
        XSSFSheet sheet = work.getSheet(sheetName);

        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfCols = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[noOfRows - 1][noOfCols];

        for (int i = 1; i < noOfRows; i++) {
            XSSFRow row = sheet.getRow(i);

            for (int j = 0; j < noOfCols; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] = cell.toString(); 
            }
        }

        work.close(); 
        fis.close();   

        return data;
    }
}