package APIProject.com.org.api;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class WebsocketsAutomation {
	ExtentHtmlReporter htlmReporter;
	ExtentReports extent ;
	ExtentTest  test;		



	@BeforeSuite 
	public void preconditinDeclarations() throws IOException
	{

		htlmReporter = new ExtentHtmlReporter("Quickloc8.Websockets.html");
		extent = new ExtentReports();
		extent.attachReporter(htlmReporter);

	}
	@Test
	public void GETALLCLIENTS2() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\GETALLCLIENTS2.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\GETALLCLIENTS2EXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("GETALLCLIENTS2");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
		//	System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
		//	System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\GETALLCLIENTS2.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test
	public void CHECKSERIAL() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\CHECKSERIAL.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\CHECKSERIALEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("CHECKSERIAL");
		if(areEqual)
		{
		//	System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
		//	System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
		//	System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\CHECKSERIAL.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}

	@Test
	public void LOGIN() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\LOGIN.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\LOGINEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("LOGIN");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
		//	System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\LOGIN.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test
	public void VERIFYOTP() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\VERIFYOTP.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\VERIFYOTPEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("VERIFYOTP");
		if(areEqual)
		{
		//	System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
		//	System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
		//	System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\VERIFYOTP.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test
	public void GETINSTALLER() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\GETINSTALLER.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\GETINSTALLEREXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("GETINSTALLER");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
		//	System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\GETINSTALLER.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();
		reader2.close();
	}
	@Test
	public void GETDEFAULTUSERDEVICES() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\GETDEFAULTUSERDEVICES.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\GETDEFAULTUSERDEVICESEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("GETDEFAULTUSERDEVICES");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\GETDEFAULTUSERDEVICES.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test 
	public void DEACTIVATE() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\DEACTIVATE.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\DEACTIVATEEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("Quickloca8 Websockets :");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\DEACTIVATE.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test(dependsOnMethods= {"DEACTIVATE"})
	public void ACTIVATE() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\ACTIVATE.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\ACTIVATEEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("ACTIVATE");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\ACTIVATE.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test
	public void GETMONTHINSTALLS() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\GETMONTHINSTALLS.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\GETMONTHINSTALLSEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("GETMONTHINSTALLS");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\GETMONTHINSTALLS.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test
	public void UNLINKDEVICE() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\UNLINKDEVICE.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\UNLINKDEVICEEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("UNLINKDEVICE");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\UNLINKDEVICE.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test
	public void GETDEVICESTATE() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\GETDEVICESTATE.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\GETDEVICESTATEEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("GETDEVICESTATE");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\GETDEVICESTATE.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test
	public void SENDSMS() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\SENDSMS.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\SENDSMSEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("SENDSMS");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\SENDSMS.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test
	public void GETNEWS() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\GETNEWS.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\GETNEWSEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("GETNEWS");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\GETNEWS.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test
	public void SAVENEWS() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\SAVENEWS.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\SAVENEWSEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("SAVENEWS");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\SAVENEWS.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test (dependsOnMethods= {"CANCELLCONTRACT"})
	public void REINSTATECONTRACT() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\REINSTATECONTRACT.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\REINSTATECONTRACTEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("REINSTATECONTRACT");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\REINSTATECONTRACT.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test 
	public void CANCELLCONTRACT() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\CANCELLCONTRACT.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\CANCELLCONTRACTEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("CANCELLCONTRACT");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\CANCELLCONTRACT.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test
	public void GETALLREFERALS() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\GETALLREFERALS.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\GETALLREFERALSEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("GETALLREFERALS");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\GETALLREFERALS.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test
	public void LEADCALLED() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\LEADCALLED.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\LEADCALLEDEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("LEADCALLED");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\LEADCALLED.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test
	public void UPDATEDEVICECELL() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\UPDATEDEVICECELL.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\UPDATEDEVICECELLEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("UPDATEDEVICECELL");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\UPDATEDEVICECELL.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@Test
	public void MAKEDEVICEREADY() throws IOException
	{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\test\\MAKEDEVICEREADY.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\test\\MAKEDEVICEREADYEXPECTED.txt"));

		String line1 = reader1.readLine();
		String file = reader1.toString();
		String line2 = reader2.readLine();

		boolean areEqual = true;

		int lineNum = 1;

		while (line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				areEqual = false;

				break;
			}
			else if(! line1.equalsIgnoreCase(line2))
			{
				areEqual = false;

				break;
			}

			line1 = reader1.readLine();

			line2 = reader2.readLine();

			lineNum++;
		}
		test = extent.createTest("MAKEDEVICEREADY");
		if(areEqual)
		{
			//System.out.println("Two files have same content.");
			test.log(Status.INFO, file);
			test.log(Status.PASS, "The files match :" + line1);

		}
		else
		{
			//System.out.println("Two files have different content. They differ at line "+lineNum);
			test.log(Status.FAIL,"Two files have different content. They differ at line "+lineNum);
			//System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
			test.log(Status.FAIL, "File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
		}
		File webSockerResponse = new  File("C:\\test\\MAKEDEVICEREADY.txt");
		Scanner readFile = new Scanner (webSockerResponse);
		while(readFile.hasNextLine())
		{

			String webSocketFile = readFile.nextLine();
			test.log(Status.INFO, webSocketFile);
		}
		readFile.close();
		reader1.close();

		reader2.close();
	}
	@AfterSuite
	public void postScriptDeclarations()
	{
		extent.flush();
	}
}
