package APIProject.com.org.api;

import org.json.JSONObject;

public class JSONString {

	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("action", "LOGIN");
		obj.put("username", "mzamo@quickloc8.co.za");
		obj.put("password", "12D7M@ha3ng");
		//		obj.put("cellphone","0794955360");
		//		obj.put("password","13234234");
		//		obj.put("action","LOGIN");
		//obj.put("cellphone","0813582002");
		//obj.put("password", "13234234");
		//obj.put("token", "");
		//obj.put("idNumber", "8712978361978");
		//obj.put("news", "Dikgang Tsa Gompijeno");
		//obj.put("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6Im16YW1vQHF1aWNrbG9jOC5jby56YSIsImlhdCI6MTYxMjM5MDU0MiwiZXhwIjoxNjEyNDc2OTQyfQ.rljt4bM25JD0waRJDVBOaD4mnHGfY--wo2P0Nfk1yf8");
		// obj.put("reason", "damaged device");
		String message = obj.toString();
		System.out.println(message);




	}

}
