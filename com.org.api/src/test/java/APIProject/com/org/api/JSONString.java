package APIProject.com.org.api;

import org.json.JSONObject;

public class JSONString {

	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("action", "LOGIN");
		obj.put("username", "mzamo@quickloc8.co.za");
		obj.put("password", "12D7M@ha3ng");
		//obj.put("imageurl", "imageurl");
		//obj.put("newsId", "newsId");
		//obj.put("headline", "headline");
		//obj.put("news", "Dikgang Tsa Gompijeno");
		//obj.put("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6Im16YW1vQHF1aWNrbG9jOC5jby56YSIsImlhdCI6MTYxMjM5MDU0MiwiZXhwIjoxNjEyNDc2OTQyfQ.rljt4bM25JD0waRJDVBOaD4mnHGfY--wo2P0Nfk1yf8");
		// obj.put("reason", "damaged device");
		String message = obj.toString();
		System.out.println(message);




	}

}
