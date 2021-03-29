package APIProject.com.org.api;

import static com.jayway.restassured.RestAssured.given;
import java.io.FileInputStream;
import java.io.IOException;
import org.testng.annotations.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.jayway.restassured.response.Response;
public class FSPAquistionGETMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Declarations at a class level

		//Apache POI XSSF declarations





		//Extend reports variable declarations
		//start the reporters
		ExtentHtmlReporter htlmReporter = new ExtentHtmlReporter("FSPAquisitionPartyReport.html");
		//create ExtentReport and attach reporter(s)
		//create ExtentReport and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htlmReporter);


		ExtentTest  test;


		//start the reporters



		// TODO Auto-generated method stub
		//XSSF variable declarations
		String excelFilePath; excelFilePath = ".\\FSPAquisitionPartyData\\FSPAquisitionData.xlsx";
		FileInputStream inputStream = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook  = new XSSFWorkbook(inputStream);
		XSSFSheet sheet  = workbook.getSheet("GETW");
		//System.out.println(sheet.getSheetName()+ " <<This is the sheet name");




		// using the for loop
		int rows = sheet.getLastRowNum(); // this will return the last row in the sheet and store the  value
		System.out.println(rows);
		int cols = sheet.getRow(1).getLastCellNum();// this will get the number of cells in the row
		System.out.println(cols);
		for(int r=0;r<=rows;r++) // for loop for the rows
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<cols;c++) //for loop the collums
			{
				XSSFCell cell = row.getCell(c);
				String url = sheet.getRow(r).getCell(c).getStringCellValue();
				System.out.println(url);

				//String url=cell.getStringCellValue();
				Response resp = given().
						when().
						get(url);
				System.out.println("Get response is :" + resp.asString());
				test = extent.createTest("FSP Aquistion Party", url);
				test.log(Status.INFO, "Respose :" + resp.asString());
				if (resp.getStatusCode() == 200)		
				{
					test.pass("FSP Aquisiton Party Response Code: " +resp.getStatusCode()+  " Pass");
				}else
				{

					test.fail("FSP Aquisiton Party Response Code:" +resp.getStatusCode()+  " Pass");
				}	

			}

		}

		extent.flush();
	}

}
