package com.qsp.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author SOWMYA Y T
 */
public class ExcelUtility {
	/**
	 * This method will read string data from excel and return value on row and
	 * column index
	 * 
	 * @param sheet
	 * @param rowIndex
	 * @param ColIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getstringdatafromexcel(String sheet, int rowIndex, int ColIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheet).getRow(rowIndex).getCell(ColIndex).getStringCellValue();

	}

	public boolean getBooleandatafromexcel(String sheet, int rowIndex, int ColIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheet).getRow(rowIndex).getCell(ColIndex).getBooleanCellValue();

	}
	
	public double getNumericdatafromexcel(String sheet, int rowIndex, int ColIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheet).getRow(rowIndex).getCell(ColIndex).getNumericCellValue();

	}
	
	public LocalDateTime getDateandtimedatafromexcel(String sheet, int rowIndex, int ColIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheet).getRow(rowIndex).getCell(ColIndex).getLocalDateTimeCellValue();

	}

}
