package WebdriverExamples;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TC_POI_Excel{
	public static void main(String args[])throws Exception{
		FileInputStream fileinput = new FileInputStream("D:\\Driver\\emp_details.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(fileinput);
		XSSFSheet sheet =workbook.getSheet("Sheet1");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating Cell Data"+ sheet.getRow(2).getCell(1));
		XSSFCell cell= sheet.getRow(6).getCell(4);
		cell.setCellValue("*****");
		fileinput.close();
		FileOutputStream fileout = new FileOutputStream("D:\\Driver\\emp_details.xlsx");
		workbook.write(fileout);
		System.out.println("updated data after write is done"+ cell.getStringCellValue());
		fileout.close();
		
	}
}