package main;

import java.util.Map;

import javax.swing.JOptionPane;

import controller.ContactController;

public class ContactMain {
//요청 순서 contactMain -> contactController -> ContactService -> ContactServiceImpl -> ContactDao -> DB
	
	
	
	public static void main(String[] args) {
		
	
		

//			// 스캐너 대신 쓸 수 있는 입력
//			String str = JOptionPane.showInputDialog("입력하시오"); //자바옵션패널 입력출력상자
//			JOptionPane.showMessageDialog(null, str); //showInputDialog로 입력받는 모든 것은 String으로 처리됨

			
			
			
			
			ContactController contactController = new ContactController();
			
			while(true) {
				String choice = JOptionPane.showInputDialog("1.삽입\n2.수정\n3.삭제\n4.전체조회\n5.상세조회\n0.종료\n 원하는 작업을 입력하세요");
				View view = null;
				
				switch (choice) {
				case "1": 
					view = new InsertView();
					break;
				case "2":
					view = new UpdateView();
					break;
				case "3":
					view = new DeleteView();
					break;
				case "4":
					view = new ListView();
					break;
				case "5":
					view = new DetailView();
					break;
				case "0": JOptionPane.showMessageDialog(null, "연락처 프로그램을 종료합니다");
									return;
				default:
					JOptionPane.showInternalMessageDialog(null, "잘못된 입력입니다. 다시 선택하세요.");
				}
				
				Map<String, Object> map =null; //display 메소드의 실행결과가 map
				if(view!=null) {
					view.display();
				}
									
				contactController.request(choice, map);
			}		
	}

}