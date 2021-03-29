package APIProject.com.org.api;

import java.net.URI;
import java.net.URISyntaxException;

import org.json.JSONObject;

public class TestApp {

    public static void main(String[] args) {
        try {
            // open websocket
             WebsocketClientEndpoint clientEndPoint = new WebsocketClientEndpoint(new URI("wss://real.okcoin.cn:10440/websocket/okcoinapi"));

            // add listener
            clientEndPoint.addMessageHandler(new WebsocketClientEndpoint.MessageHandler() {
                public void handleMessage(String message) {
                    System.out.println(message);
                }
            });

            // send message to websocket
            JSONObject obj = new JSONObject();
  		  obj.put("action", "LOGIN");
  		  obj.put("username", "mzamo@quickloc8.co.za");
  		  obj.put("password", "12D7M@ha3ng");
  		  String messageSend = obj.toString();
  		  System.out.println(messageSend);
            clientEndPoint.sendMessage(messageSend);

            // wait 5 seconds for messages from websocket
            Thread.sleep(5000);

        } catch (InterruptedException ex) {
            System.err.println("InterruptedException exception: " + ex.getMessage());
        } catch (URISyntaxException ex) {
            System.err.println("URISyntaxException exception: " + ex.getMessage());
        }
    }
}