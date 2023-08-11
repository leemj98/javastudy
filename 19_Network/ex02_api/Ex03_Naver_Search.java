package ex02_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

public class Ex03_Naver_Search {
	
	public static void main(String[] args) {
		
		/*
		 * 네이버개발자센터 - 검색(블로그)
		 * 1. 요청주소 : https://openapi.naver.com/v1/search/blog.json
		 * 2. 요청변수
		 * 		1) query : 필수, 인코딩된 검색어
		 * 		2) display : 선택, 10 (검색 결과의 개수)
		 * 		3) start : 선택, 1
		 * 		4) sort  : 선택, sim(sim, date) - 유사도(시밀러)순으로 조회할지 날짜(date)순으로 조회할지
		 */
  	
  	URL url = null;
  	HttpURLConnection con = null;
  	BufferedReader reader = null;
  	
  	try {
			String spec = "https://openapi.naver.com/v1/search/blog.json";
			String query = "폭염"; //검색어
			String display = "10"; //기본값
			String start = "1"; //기본값
			String sort = "sim"; //기본값
			String clientId = "7Px5LEuqCOMutXIZrLGL";
			String clientSecret = "I1n5aZUL6Z";
			
			StringBuilder sbUrl = new StringBuilder();
			sbUrl.append(spec);
			sbUrl.append("?query=").append(URLEncoder.encode(query,"UTF-8")); //파라미터 첫 연결은 '?'
			sbUrl.append("&dispaly=").append(display);
			sbUrl.append("&start=").append(start);
			sbUrl.append("&sort=").append(sort);
			
			url = new URL(sbUrl.toString());
			con = (HttpURLConnection)url.openConnection();
			
			//요청 메소드
			con.setRequestMethod("GET"); //반드시 대문자 작성
			//요청헤더, 요청 헤더로 데이터 보내기 setRequestProperty
			con.setRequestProperty("X-Naver-Client-Id", clientId); //X-Naver-Client-Id 네이버에서 미리 정해둔 요청헤더 변수
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret); // //X-Naver-Client-Secret 네이버에서 미리 정해둔 요청헤더 변수
			
			
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        sb.append(line);
      }
      
      System.out.println(sb.toString());
      JSONObject obj = new JSONObject(sb.toString());
      
      JSONArray items = obj.getJSONArray("items");
      for (int i = 0,length = items.length(); i < length; i++) {
				JSONObject item = items.getJSONObject(i);
				System.out.println((i+1)+"번째 블로그 검색 결과");
				System.out.println("제목: "+item.getString("title"));
				System.out.println("링크: "+item.getString("link"));
				System.out.println("요약: "+item.getString("description"));
				System.out.println("블로거: "+item.getString("bloggername"));
				System.out.println("블로거링크: "+item.getString("bloggerlink"));
				System.out.println("작성일: "+item.getString("postdate"));
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
}
