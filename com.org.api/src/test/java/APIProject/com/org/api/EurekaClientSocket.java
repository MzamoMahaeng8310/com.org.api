package APIProject.com.org.api;
import java.net.*;
import java.io.*;

public class EurekaClientSocket {

	//initialize socket and input output streams
	private Socket socket = null;
	private DataInputStream input = null;
	private DataOutputStream out = null;
	
	//constructor to put IP address and port 
	@SuppressWarnings("deprecation")
	public EurekaClientSocket(String address,int port)
	{
		try 
		{
			socket = new Socket( address, port);
			System.out.println("Connected");
			
			//take input from terminal 
			input = new DataInputStream(System.in);
			
			//sends output to the socket
			out = new DataOutputStream(socket.getOutputStream());
		}
		catch(UnknownHostException u)
		{
			System.out.println(u);
		}
		catch(IOException i)
		{
			System.out.println(i);
			
		}
		
		//String to read message form the input tab
		String line = "";
		//Keep reading untill "Over" is displayed on the screen
		while(!line.equals("Over"))	
		{
			try
			{
				line = input.readLine();
				out.writeUTF(line);
			}
			catch(IOException i)
			{
				System.out.println(i);
			}
		}
		
		try 
		{
			input.close();
			out.close();
			socket.close();
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}

	
public static void main(String[] args) {
	// TODO Auto-generated method stub

	EurekaClientSocket javaclient = new  EurekaClientSocket ("ws://197.189.216.18:3001",3001);
	
	
}

}
