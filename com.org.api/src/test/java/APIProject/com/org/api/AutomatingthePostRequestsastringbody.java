package APIProject.com.org.api;
import org.testng.annotations.Test;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static  com.jayway.restassured.RestAssured.*;


public class AutomatingthePostRequestsastringbody {

	
	//GET    /posts
	@Test
	public void getPost()
	{
		Response resp = given().
		when().
		get("http://api.openweathermap.org/data/2.5/weather?q=Pretoria&appid=8c8d3215dea188a4db1f105e201e5387");
		System.out.println("Get response is :" + resp.asString());
		
	}
	
	//POST   /posts
	//@Test
	public void getRequestToPosts()
	{
		given().
		body("             {\"id\":\"2\"              ").
		when().
		contentType(ContentType.JSON).
		post("http://localhost:3000//posts");
		
	}
}
