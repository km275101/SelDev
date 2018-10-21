package dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class LogindataProvider {
	public String path = "G:\\workspace\\home\\TestData.xlsx";
	public XSSFWorkbook workbook;
	FileInputStream fis;

	
	public List<String> getUserDetails() throws InvalidFormatException{
		
		List<String> userDetails = new ArrayList<String>();
		
		try{
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			XSSFSheet worksheet = workbook.getSheet("Login");
			int n = worksheet.getLastRowNum();
			System.out.println("Total number of rows :"+n);
			
				userDetails.add(worksheet.getRow(1).getCell(0).getStringCellValue().toString());
				userDetails.add(worksheet.getRow(1).getCell(1).getStringCellValue().toString());
				
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		http://pydev.org/updateshttp://pydev.org/updateshttp://pydev.org/updateshttp://pydev.org/updateshttp://pydev.org/updateshttp://pydev.org/updateshttp://pydev.org/updates
		return userDetails;
		
	}
	
public List<String> getUrlDetails() throws InvalidFormatException{
		
		List<String> urlDetails = new ArrayList<String>();
		
		try{
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			XSSFSheet worksheet = workbook.getSheet("Login");
			int n = worksheet.getLastRowNum();
			System.out.println("Total number of rows :"+n);
			
			urlDetails.add(worksheet.getRow(1).getCell(0).getStringCellValue());
			urlDetails.add(worksheet.getRow(1).getCell(1).getStringCellValue());
				
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return urlDetails;
		
	}
	
}
