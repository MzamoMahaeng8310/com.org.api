package APIProject.com.org.api;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static  com.jayway.restassured.RestAssured.*;
public class WeatherMaps {

	//create extend report variables at a class level
	ExtentHtmlReporter htmlReporter ;
	ExtentReports extent ;
	ExtentTest test;
	@BeforeSuite
	public void extentReportBeforeExecution()
	{
		//Start reporters
		htmlReporter = new ExtentHtmlReporter("WeatherAPIReport.html");

		//create ExtentReports and attach reporter(s)
		extent = new ExtentReports(); 
		extent.attachReporter(htmlReporter);

	}


	//Get weather request by city name
	//Status code of 200 
	//@Test
	public void getWeatherByCityName()
	{

		test = extent.createTest("WeatherAPIReport","getWeatherByCityName");
		Response resp = when().
				get("http://api.openweathermap.org/data/2.5/weather?q=Pretoria&appid=8c8d3215dea188a4db1f105e201e5387");
		System.out.println("Response Status Code : " + resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), 200);
		System.out.println(resp.print());
		System.out.println("getWeatherByCityName");
		test.log(Status.INFO,"Respose Code:" + resp.getStatusCode());
		if  (resp.getStatusCode() == 200)
		{
			test.log(Status.PASS, "Response code of  200 sucess: /n"+resp.getStatusCode() + "JSONr response body /n" + resp.getBody().asString());

		}
		else 
		{
			test.log(Status.FAIL, "Response  fail");

		}


	}
	//Status code of 404
	//@Test
	public void getWeatherByCityName404()
	{
		Response resp = when().
				get("https://samples.openweathermap.org/data/2.5/weather&appid=439d4b804bc8187953eb36d2a8c26a02");
		System.out.println("Response Status Code : " + resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), 404);
		System.out.println("getWeatherByCityName404");


	}
	//How to use parameters with RESTassured
	//@Test(groups = {"Regression"})
	public void useParametersRestAssured()
	{
		Response resp = given().
				param("q", "Pretoria").
				param("appid","8c8d3215dea188a4db1f105e201e5387").
				when().
				get("http://api.openweathermap.org/data/2.5/weather");
		System.out.println("Response Status Code : " + resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), 200);
		System.out.println(resp.asString());
		System.out.println(resp.print());

		if(resp.getStatusCode()==200)
		{
			System.out.println("API is working");

		}
		else
		{
			System.out.println("API is NOT WORKING");
		}
		System.out.println("useParametersRestAssured");

	}


	//Get city by ID
	//@Test
	public void getCityById()
	{
		Response karabo  =	given().
				param("id", "2172797").
				param("appid","8c8d3215dea188a4db1f105e201e5387").
				when().
				get("https://samples.openweathermap.org/data/2.5/weather");
		System.out.println(karabo.getStatusCode());
		System.out.println(karabo.asString());
		Assert.assertEquals(karabo.getStatusCode(), 200);

	}

	//get by city id no response
	//@Test(groups = {"Regression"})
	public void assertRertAssured()
	{
		given().
		param("q", "Pretoria").
		param("appid","8c8d3215dea188a4db1f105e201e5387").
		when().
		get("http://api.openweathermap.org/data/2.5/weather").
		then().
		assertThat().statusCode(200);



	}
	//@Test
	public void extractingJSONResult()
	{
		String  Gielie  =	given().
				param("id", "2172797").
				param("appid","8c8d3215dea188a4db1f105e201e5387").
				when().
				get("http://glcapi-ws-tst.sanlam.co.za/fsp/acq/sh/party/api/bankaccounttypes/1").
				then().
				contentType(ContentType.JSON).
				extract().
				path("weather[0].description"); //no need to denote the $. because rest assured assumes that we start from the top. 
		System.out.println("Weather Report : " + Gielie );
		Assert.assertEquals(Gielie, "scattered clouds");


	}
	//@Test
	public void Extractingactualresultfromapis_lesson16()
	{
		Response  resp  =	given().
				param("id", "2172797").
				param("appid","8c8d3215dea188a4db1f105e201e5387").
				when().
				get("https://samples.openweathermap.org/data/2.5/weather");

		String actualWeatherReport = resp.
				then().
				contentType(ContentType.JSON).
				extract().
				path("weather[0].description"); //no need to denote the $. because rest assured assumes that we start from the top. 

		String  expectedWeatherReport = "scattered clouds";

		if (actualWeatherReport.equals(expectedWeatherReport))
		{

			System.out.println("Test Case Passed");
		}
		else
			System.out.println("Test Case Failled");


	}



	@Test
	public void Transfering_api_reponse_to_other_api_17Lesson()
	{

		Response resp = given().
				param("id","2172797").
				param("appid","8c8d3215dea188a4db1f105e201e5387").
				when().
				get("https://api.openweathermap.org/data/2.5/weather");//ensure that http or https is always added

		String reportID = resp.
				then().
				contentType(ContentType.JSON).
				extract().
				path("weather[0].description");

		System.out.println("weather description by id: " + reportID);

		String lon = String.valueOf(resp. // Because the JSON array object is float, we type case it to a string. String.valueof()
				then().
				contentType(ContentType.JSON).
				extract().
				path("coord.lon"));//extracting the longitude path
		System.out.println("Longitude for this city: " + lon);

		String lat = String.valueOf(resp.   //because the element in the  array of float we convert to string by string,valueOF
				then().
				contentType(ContentType.JSON).
				extract().
				path("coord.lat"));//extracting the latitude path
		System.out.println("Latitude for this city: " + lat );

		//By geographic weather description
		String   respByCordinates  =	given().
				param("lat", lat).
				param("lon",lon).
				param("appid","8c8d3215dea188a4db1f105e201e5387").
				when().
				get("https://api.openweathermap.org/data/2.5/weather").	
				then().
				contentType(ContentType.JSON).
				extract().
				path("weather[0].description");

		System.out.println("Report by weather description: " + respByCordinates);
		Assert.assertEquals(reportID,respByCordinates);

		test = extent.createTest("WeatherAPIReport","Transfering_api_reponse_to_other_api_17Lesson()");
		if (resp.getStatusCode() == 200)
		{
			test.log(Status.PASS,"Status code is: " + resp.getStatusCode());

		}
		else
		{


			test.log(Status.FAIL,"Response code failled: " + resp.getStatusCode());
		}
		//So the next exercise to do a request
		//the extract and display
		//then usethe same extract ad input to thee next api (  tranfser)

	}
	@AfterSuite
	public void  ExtentFlush()
	{

		//Flush the report
		extent.flush();
	}

}
