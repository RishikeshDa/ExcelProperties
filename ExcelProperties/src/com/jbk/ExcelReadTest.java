package com.jbk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReadTest {
	public static void main(String[] args) throws BiffException, IOException {
		FileInputStream fis=new FileInputStream("Book2.xls");
		Workbook wk=Workbook.getWorkbook(fis);
		Sheet sheet=wk.getSheet(0);
		//Cell cell=sheet.getCell(0,0);
		//System.out.println(cell.getContents());
		int Rw=sheet.getRows();
		int Clm=sheet.getColumns();
		for(int r=0; r<=Rw-1;r++) {
			for(int c=0;c<=Clm-1;c++) {
				Cell cell2 =sheet.getCell(c,r);
				System.out.print(" "+cell2.getContents());
				
			}
			System.out.println();
			
			
		}
		
	}
	

}
