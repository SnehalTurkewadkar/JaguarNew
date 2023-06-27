package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractiseDemo {

	public static void main(String[] args) throws IOException {
			FileInputStream fis=new FileInputStream (System.getProperty("user.dir")+"/src/test/resources/StudentData.xlsx");
		String sheetName="Student";
	
		
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet= book.getSheet(sheetName);
		 int row=sheet.getLastRowNum();
		 int col=sheet.getRow(0).getLastCellNum();
		System.out.println("row:"+row);
		System.out.println("col:"+col);
		
		String val="";
		for(int r=1;r<row;r++)
		{
			for(int c=0;c<col;c++)
			{
				val = sheet.getRow(r).getCell(c).getStringCellValue();
				System.out.print(String.format("%-12s", val));
			}
			System.out.println();
		}
		

	}

}
