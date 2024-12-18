package com.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetData1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\user\\Desktop\\particulardata.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(fi);
		Sheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(0);
		CellType type = cell.getCellType();
		if (type.equals(CellType.STRING)) {
			String cellValue = cell.getStringCellValue();
			System.out.println(cellValue);
		} else {
			double value = cell.getNumericCellValue();
			int i = (int) value;
			System.out.println(i);
		}
	}
}

//Workbook w= new XSSFWorkbook(fi);
//Sheet s = w.getSheetAt(0);
//Row row = s.getRow(3);
//Cell cell = row.getCell(0);
//CellType type = cell.getCellType();
//if(type.equals(CellType.STRING)) 
//{
//	String value = cell.getStringCellValue();
//	System.out.println(value);
//}
//else
//{
//double cellValue = cell.getNumericCellValue();
//int i= (int) cellValue;
//System.out.println(i);
//}
//}
//
//	}
