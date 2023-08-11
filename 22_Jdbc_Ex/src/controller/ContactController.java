package controller;

import java.util.List;
import java.util.Map;

import dto.ContactDto;
import service.ContactService;
import service.ContactServiceImpl;

//요청 순서 contactMain -> contactController -> ContactService -> ContactServiceImpl -> ContactDao -> DB

/**
 * 요청 처리 메소드<br>
 * @param choice 1,2,3,4,5 중 하나
 * @param map 사용자가 입력한 값
 * 						choice == 1: name, tel, email, address
 * 						choice == 2: contact_no, name, tel, email, address
 * 						choice == 3: contact_no
 * 						choice == 4: null
 * 						choice == 5: contact_no
 */
public class ContactController {
	private ContactService contactService = new ContactServiceImpl();
	
	
	public void request(String choice, Map<String, Object> map) {
		
		System.out.println("Controller::"+map);
		
		String message = "";
		
		switch(choice) {
    case "1":
      int insertCount = contactService.insert(map);
      message = insertCount + "개 연락처가 등록되었습니다.";
      break;
    case "2":
      int updateCount = contactService.update(map);
      message = updateCount + "개 연락처가 수정되었습니다.";
      break;
    case "3":
      int deleteCount = contactService.delete(map);
      message = deleteCount + "개 연락처가 삭제되었습니다.";
      break;
    case "4":
      List<ContactDto> list = contactService.selectList();
      for(ContactDto contactDto : list) {
        message += contactDto.toString() + "\n";
      }
      break;
    case "5":
      ContactDto contactDto = contactService.selectContactByNo(map);
      if(contactDto == null) {
        message = "조회된 결과가 없습니다.";
      } else {
        message = "조회결과: " + contactDto.toString();
      }
      break;
    }
    
    return message;
    
  }
  
}

//널처리하는 이유 
//널이면 tostring불가능해서 안해주면 널포인터익셉션발생