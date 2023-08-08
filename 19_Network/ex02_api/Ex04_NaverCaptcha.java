package ex02_api;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.print.attribute.standard.PagesPerMinute;

import org.json.JSONObject;

public class Ex04_NaverCaptcha {

	private static final String CLIENT_ID = "7Px5LEuqCOMutXIZrLGL";
	private static final String CLIENT_SECRET = "I1n5aZUL6Z";
	
	private static String getKey() {
		
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		String result = null;
		
		try {
			String spec = "https://openapi.naver.com/v1/captcha/nkey";
			url = new URL(spec);
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			// API를 요청할 때  HTTP 요청 헤더에 클라이언트 아이디와 클라이언트 시크릿을 추가해야 합니다. (네이버에서 복붙)
			con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID );
			con.setRequestProperty("X-Naver-Client-Secret", CLIENT_SECRET );
			
			//응답코드
			int responseCode = con.getResponseCode();
			if (responseCode != HttpURLConnection.HTTP_OK) {
				throw new RuntimeException(responseCode +" 발생");
			}
			
			reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String line = null;
			while((line = reader.readLine()) !=null) {
				sb.append(line);
			}
			System.out.println(sb.toString());
			
			JSONObject obj = new JSONObject(sb.toString());
			result = obj.getString("key");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (reader != null) reader.close();
				if (con != null) con.disconnect();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	private static String getImage() {
		
		URL url = null;
		HttpURLConnection con = null;
		BufferedInputStream bin = null; //이미지는 버퍼리더로 안됨
		BufferedOutputStream bout = null; //읽은걸 pc에 저장
		String key = null;
		
		try {
			key =getKey();
			String spec = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
			url = new URL(spec);
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID );
			con.setRequestProperty("X-Naver-Client-Secret", CLIENT_SECRET );
			
			int responseCode = con.getResponseCode();
			if (responseCode != HttpURLConnection.HTTP_OK) {
				throw new RuntimeException(responseCode +" 발생");
			}
			
		  bin = new BufferedInputStream(con.getInputStream());
		  
		  File dir = new File("C:/storage");
		  if (dir.exists() == false) {
				dir.mkdirs();
			}
		  File file = new File(dir, System.currentTimeMillis()+".jpg"); 
		  //여러개 저장해도 이름 다르게 하기 위해 (덮어쓰기 방지) 타임스탬프 사용 (중복 막을 수 있으면 랜덤,uuid 아무거나 사용가능)
		  bout = new BufferedOutputStream(new FileOutputStream(file));
		  
		  byte[] b = new byte[1024]; //1024바이트씩 옮길것
		  int readByte = 0;
		  while((readByte = bin.read(b)) != -1) { //read() 메소드는 -1로 체크
		  	bout.write(b,0,readByte);//b 배열을 인덱스 0부터 readByte만큼 보내기
		  }
		  
		  System.out.println(file.getPath()+" 파일 생성 완료");
		  
		  
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (bout != null) bout.close();
				if (bin != null) bin.close();
				if (con != null) con.disconnect();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		return key;
		
	}
	
  private static void validInput() {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    
    try {
      
      String key = getImage();
      
      Scanner sc = new Scanner(System.in);
      System.out.println("입력 >> ");
      String value = sc.next();
      
      String spec = "https://openapi.naver.com/v1/captcha/nkey?code=1&key=" + key + "&value=" + value;
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      con.setRequestMethod("GET");
      
      con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
      con.setRequestProperty("X-Naver-Client-Secret", CLIENT_SECRET);
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + " 발생");
      }
      
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        sb.append(line);
      }
      
      JSONObject obj = new JSONObject(sb.toString());
      System.out.println("응답시간: " + obj.getDouble("responseTime"));
      if(obj.getBoolean("result")) {
        System.out.println("맞습니다.");
      } else {
        System.out.println("틀립니다.");
      }
    
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
      
  }
	
	public static void main(String[] args) {
//		getImage();
		validInput();
	}
}
