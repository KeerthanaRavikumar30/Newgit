package com.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("C:\\Users\\user\\Desktop\\particulardata.xlsx");
		FileInputStream f2 = new FileInputStream(f1);
		Workbook w = new XSSFWorkbook(f2);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING))  
		{
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		} 
		else
		{
			double numericCellValue = cell.getNumericCellValue();
			int i = (int) numericCellValue;
			System.out.println(i);
		}
	}

}
