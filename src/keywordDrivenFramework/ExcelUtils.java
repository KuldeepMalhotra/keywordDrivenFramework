package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class ExcelUtils {
	
	static Logger log = (Logger) LogManager.getLogger(ExcelUtils.class);
	static HSSFWorkbook workbook;
	static HSSFSheet sheet;
	public static void setExcelFile(String path, String sheetName) throws IOException {
		FileInputStream fis = new FileInputStream(path);
		workbook = new HSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
	}
	
	public static String getCellData(int row, int col) {
		Cell cell = sheet.getRow(row).getCell(col);
		String cellData = cell.getStringCellValue();
		log.info(cellData);
		return cellData;
	}
	

}
