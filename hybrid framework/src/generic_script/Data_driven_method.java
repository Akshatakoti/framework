package generic_script;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_driven_method
{
public static String getdata(String sh,int r,int c)
{
	String value=null;	
try
{
	FileInputStream fis = new FileInputStream("./Excel/Testdata.xlsx");
	Workbook book =WorkbookFactory.create(fis);
         Sheet s = book.getSheet("sh");
          Row row = s.getRow(r);
          Cell cell = row.getCell(c);
          value = cell.toString();
}
catch(Exception e)
{
	System.out.println(e);
	}
return value;
		
          
         
	
	
	
}
}
