package ex02_api;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

import org.json.JSONObject;

public class Ex05_NaverPapago {

	
	
	public static void main(String[] args) {
	
		URL url = null;
		HttpURLConnection con = null;
		BufferedOutputStream bout = null; // 서버로 POST 데이터 보내는 용도
	  BufferedReader reader = null;
	  
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("번역할 한국어 입력 >>> ");
			String text = sc.nextLine();

			String spec = "https://openapi.naver.com/v1/papago/n2mt";
			String clientId = "7Px5LEuqCOMutXIZrLGL";
			String clientSecret = "I1n5aZUL6Z";

			String params = "source=ko&target=en&text="+text; //서버에 데이터를 보내주야함. 보안상 get으로 못보내서 (주소창으로 못보내서) 따로 만들음
			
			url = new URL(spec);
			con = (HttpURLConnection)url.openConnection();
			
			//요청 메소드 POST (GET이 아니면 생략할 수 없음)
		  con.setRequestMethod("POST");
		  
		  // 요청 헤더 (clientId, clientSecret)
      con.setRequestProperty("X-Naver-Client-Id", clientId);
      con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
      
      // OutputStream 이용해서 POST 데이터 보내겠다
      con.setDoOutput(true);
      
      // OutputStream 이용해서 POST 데이터 서버로 보내기
      bout = new BufferedOutputStream(con.getOutputStream());
			bout.write(params.getBytes());
			bout.flush(); //버퍼에 있는 데이터 모두 처리하라
			// write()함수를 cpu가 처리했다고 해도 모든 데이터가 물리적으로 디스크에 전부 저장되지 않을 수 있음
			// write()한 파일을 다시 읽거나 할때는 반드시 flush()해주는 것이 좋음
			// write() = 빨대로 보내기, flush() = 빨대로 불어서 완전히 날리기
			
			int responseCode = con.getResponseCode();
			if(responseCode != HttpURLConnection.HTTP_OK) {
				throw new RuntimeException(responseCode+" 발생");
			}
		
			reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			StringBuilder sb = new StringBuilder();
			String line = null;
			while((line=reader.readLine())!=null) {
				sb.append(line);
			}
			
			JSONObject obj = new JSONObject(sb.toString());
			JSONObject message = obj.getJSONObject("message");
			JSONObject result = message.getJSONObject("result");
			String translatedText = result.getString("translatedText");
			
			System.out.println("번역 결과");
			System.out.println("---------");
			System.out.println(translatedText);
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(reader!=null) reader.close();
				if(bout!=null) bout.close();
				if(con!=null) con.disconnect();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
