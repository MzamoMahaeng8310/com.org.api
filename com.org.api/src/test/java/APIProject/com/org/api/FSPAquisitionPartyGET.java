package APIProject.com.org.api;
import static com.jayway.restassured.RestAssured.given;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
public class FSPAquisitionPartyGET {
	// TODO Auto-generated method stub
	//Declarations at a class level
	//Apache POI XSSF declarations
	ExtentHtmlReporter htlmReporter;
	ExtentReports extent ;
	ExtentTest  test;		
	String  excelFilePath;
	FileInputStream inputStream ;
	XSSFWorkbook workbook;
	XSSFSheet sheet;


	@BeforeSuite 
	public void preconditinDeclarations() throws IOException
	{

		htlmReporter = new ExtentHtmlReporter("FSPAquisitionPartyReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htlmReporter);
		excelFilePath = ".\\FSPAquisitionPartyData\\FSPAquisitionData.xlsx";
		inputStream = new FileInputStream(excelFilePath);
		workbook  = new XSSFWorkbook(inputStream);
		sheet  = workbook.getSheet("GETW");
	}

	@Test (enabled =true)
	public void FSPAquisiontGETRequest()
	{

		// using the for loop
		int rows = sheet.getLastRowNum(); // this will return the last row in the sheet and store the  value
		System.out.println("This is the last row: " + rows);
		int cols = sheet.getRow(0).getLastCellNum();// this will get the number of cells in the row
		System.out.println("Number of collums: "+cols);
		for(int r=0;r<=rows;r++) // for loop for the rows
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<cols;c++) //for loop the collums
			{
				XSSFCell cell = row.getCell(c);
				String url = sheet.getRow(r).getCell(c).getStringCellValue();
				System.out.println(url);

				Response resp = given().
						when().
						get(url);
				System.out.println("Get response is :" + resp.asString());
				test = extent.createTest("FSPAquisionParty_GET Smoke", url);
				test.log(Status.INFO, "Respose :" + resp.asString());

				int codeRespose = resp.getStatusCode();
				switch(codeRespose)
				{
				case 200:
					test.pass("FSP Aquisiton Party Response Code: " +resp.getStatusCode()+  " Pass");
					break;

				case 404:

					test.pass("FSP Aquisiton Party Response Code: 404  " +resp.getStatusCode()+  " Pass");
					break;

				}

				if (resp.getStatusCode() != 200 && resp.getStatusCode() !=  404)
				{

					test.pass("FSP Aquisiton Party Response " + resp.getStatusCode() + " Fail" );
				}
			}

		}


	}

	@Test(enabled = true)
	public void partytypes() throws IOException
	{
		File src = new File("./RESTApiConfig/RESTApiConfig.property");
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		String  englishDescriptionVerify = pro.getProperty("englishDescriptionVerify");


		Response resp = given().
				when().get(pro.getProperty("partyTypeEndPoint"));
		//Extract JSON array element 
		//Verify the partytype id
		String englishDescription = resp.
				then().
				contentType(ContentType.JSON).
				extract().
				path(pro.getProperty("partyTypeJSONPath"));
		System.out.println("partytypes  english description : "+ englishDescription);
		test = extent.createTest("partytype  response: ", resp.asString());
		test.log(Status.INFO, "partytype id value :" + englishDescription);
		Assert.assertEquals(englishDescription, englishDescriptionVerify);

		if (englishDescription.equals(englishDescriptionVerify))

		{

			test.log(Status.PASS,"partytype english description : "+  englishDescription + " Matches expected: "+ englishDescriptionVerify);
		}
		else 
		{
			test.log(Status.FAIL, "partytype english description : "+ englishDescription + " Does not match expected descripton : "+ englishDescriptionVerify);
		}



	}

	@AfterSuite
	public void postScriptDeclarations()
	{
		extent.flush();
	}
}




