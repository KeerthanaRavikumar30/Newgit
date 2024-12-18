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

public class GetAllData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\user\\Desktop\\getalldata.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet sheet = w.getSheetAt(0);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheet.getRow(i);
			int cells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cells; j++) {
				Cell cell1 = row.getCell(j);
				CellType cellType = cell1.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String value = cell1.getStringCellValue();
					System.out.println(value);
				} else if (cellType.equals(CellType.NUMERIC)) {
					double d = cell1.getNumericCellValue();
					int i1 = (int) d;
					System.out.println(i1);

				}
			}
		}

	}

}
