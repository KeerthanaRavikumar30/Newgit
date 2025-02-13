package com.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
	
		File f = new File("C:\\Users\\user\\Desktop\\writedata.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.createSheet("Details1");
//		Row row = sheet.createRow(0);
//		Cell cell = row.createCell(0);
//		cell.setCellValue("NAME");
//		row.createCell(1).setCellValue("MOBILE");
//		row.createCell(2).setCellValue("ADDRESS");
//		Row row2 = sheet.createRow(1);
//		row2.createCell(0).setCellValue("Keerthana");
//		row2.createCell(1).setCellValue("abc");
//		row2.createCell(2).setCellValue("hello");
//		sheet.createRow(2).createCell(0).setCellValue("ghi");
//		sheet.createRow(3).createCell(0).setCellValue("jkl");
//		sheet.createRow(4).createCell(0).setCellValue("mno");
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		
		for (int i = 0; i <= 5; i++)
		{
		Row createRow = sheet.createRow(i);
		Cell createCell = createRow.createCell(0);
		if (i==1) {
			createCell.setCellValue("def");
			w.write(fo);
		}
		else if (i==2) {
			createCell.setCellValue("ghi");
			w.write(fo);
			
		}
		else if (i==3) {
			createCell.setCellValue("jkl");
			w.write(fo);
		}
		else if (i==4) {
			createCell.setCellValue("mno");
			w.write(fo);
		}
		else if (i==5) {
			createCell.setCellValue("pqr");
			w.write(fo);
		}
		}
		System.out.println("hello");

		
			
	}

}
