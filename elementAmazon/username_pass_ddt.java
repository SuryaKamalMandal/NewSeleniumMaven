package elementAmazon;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class username_pass_ddt {
	
	public String getDataFromExcelSheet(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewSelenium\\DDTExcel\\personalinfo.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		String un= book.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		//String val1= book.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return un;
	}
}